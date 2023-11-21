# Автоматизация приложения Wikipedia
![image](https://github.com/nice58/mobile_autotests_appium/assets/103956147/48f9a57c-7875-4b9c-b549-cf861bac605a)

## :bookmark_tabs: Содержание:
+ [Стек технологий](#Стек-технологий)
+ [Реализованные проверки](#Реализованные-проверки)
+ [Команды запуска автотестов](#Команды-запуска-автотестов)
+ [Сборка в Jenkins](#Сборка-в-Jenkins)
+ [Пример Allure-отчета](#Пример-Allure-отчета)
+ [Уведомление в Telegram о результатах прохождения тестов](#Уведомление-в-Telegram-о-результатах-прохождения-тестов)
+ [Видеопример прохождения тестов](#Видеопример-прохождения-тестов)
  
### :wrench: ***Стек технологий***
<p>
<img width="5%" title="IntelliJ IDEA" src="img/idea.svg">
<img width="5%" title="Java" src="img/java.svg">
<img width="5%" title="Selenide" src="img/selenide.svg">
<img width="5%" title="Selenoid" src="img/selenoid.svg">
<img width="5%" title="Allure Report" src="img/allureReport.svg">
<img width="5%" title="Gradle" src="img/gradle.svg">
<img width="5%" title="JUnit5" src="img/junit5.svg">
<img width="5%" title="GitHub" src="img/github.svg">
<img width="5%" title="Jenkins" src="img/jenkins.svg">
<img width="5%" title="Telegram" src="img/telegram.svg">
<img width="5%" title="Appium" src="img/appium.png">
<img width="5%" title="Appium Inspector" src="img/appiuminspector.png">
<img width="5%" title="Android Studio" src="img/androidstudio.png">
<img width="5%" title="BrowserStack" src="img/browserstack.png">
</p>

### :ballot_box_with_check: ***Реализованные проверки***
При запуске локально:
- Корректность открытия главной страницы
- Проверка перехода на вторую страницу onboarding screen
- Пропуск настроек на главной странице
- Поиск статей
- Переход в настройки

При запуске удаленно:
- Поиск статьи
- Проверка ошибки при переходе на статью

### :arrows_clockwise: ***Запуск автотестов***
Команда запуска тестов из терминала локально
```bash
gradle clean local_test -DdeviceHost=local 
```
Команда запуска тестов из терминала удаленно
```bash
gradle clean browserstack_test -DdeviceHost=browserstack
```

### :large_blue_circle: ***Сборка в [Jenkins](https://jenkins.autotests.cloud/job/student-trubanenko-qa_guru_21_android_test_appium/)***

<kbd>![image](https://github.com/nice58/mobile_autotests_appium/assets/103956147/9489dd92-939e-4418-9b63-1c6a97db0d74)</kbd>

### :large_blue_circle: ***Пример Allure-отчета***
<kbd>![image](https://github.com/nice58/mobile_autotests_appium/assets/103956147/b8a87a5c-602f-437f-ad44-1e3b396c4324)</kbd>

### :large_blue_circle: ***Уведомление в Telegram о результатах прохождения тестов***
<kbd>![image](https://github.com/nice58/mobile_autotests_appium/assets/103956147/e37d2b8e-4d70-4c8a-81bc-5abff30a9f2e)</kbd>

### :large_blue_circle: ***Видеопример прохождения тестов***
![video](https://github.com/nice58/mobile_autotests_appium/assets/103956147/e9a0526a-e7ad-42e2-b958-5b54ee874b6e)
