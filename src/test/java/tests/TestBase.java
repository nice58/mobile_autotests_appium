package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserStackDriver;
import drivers.LocalDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class TestBase {

    private final static String deviceHost = System.getProperty("deviceHost");
    @BeforeAll
    static void beforeAll() {
        switch (deviceHost) {
            case "local":
                Configuration.browser = LocalDriver.class.getName();
                break;
            case "browserstack":
                Configuration.browser = BrowserStackDriver.class.getName();
                break;
            }

        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void beforeEach() {SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        switch (deviceHost) {
            case "local":
                Attach.screenshotAs("Last screenshot");
                Attach.pageSource();
                break;
            case "browserstack":
                String sessionId = Selenide.sessionId().toString();
                Attach.pageSource();
                Attach.addVideo(sessionId);
                break;
        }
        closeWebDriver();
    }
}