package tests.local;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.className;

public class SearchTestLocal extends TestBaseLocal {

    @Test
    @Tag("local")
    @DisplayName("Проверка открытия главной страницы")
    void successfulStartPageTest() {
        step("Проверка текста на главной странице", () ->
                $(id("org.wikipedia.alpha:id/primaryTextView"))
                        .shouldHave(text("The Free Encyclopedia")));
    }

    @Test
    @Tag("local")
    @DisplayName("Проверка второй страницы настроек главной страницы")
    void secondStartPageTest() {
        step("Переход на вторую страницу настроек", () ->
                $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());
        step("Проверка текста на второй странице настроек", () ->
                $(id("org.wikipedia.alpha:id/primaryTextView"))
                        .shouldHave(text("New ways to explore")));
    }

    @Test
    @Tag("local")
    @DisplayName("Пропуск настроек на главной странице")
    void skippSettingsStartPageTest() {
        step("Пропуск настроек на главной странице", () ->
            $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click());
        step("Проверка перехода на основную страницу", () ->
                $(id("org.wikipedia.alpha:id/main_toolbar_wordmark"))
                        .shouldBe(visible));
    }

    @Test
    @Tag("local")
    @DisplayName("Поиск статей на Wikipedia")
    void successfulSearchTest() {
        back();
        step("Ввод данных в поиск", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });
        step("Проверка найденного контента", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @Tag("local")
    @DisplayName("Переход в настройки")
    void settingTest() {
        back();
        step("Переход в настройки", () ->
            $(id("org.wikipedia.alpha:id/view_announcement_action_positive")).click());
        step("Проверка текста на странице настроек", () ->
                $(className("android.widget.TextView"))
                        .shouldHave(text("Customize the feed")));
    }


}
