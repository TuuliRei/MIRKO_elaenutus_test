package ui_testing;

import com.codeborne.selenide.Configuration;

public class SelenideConfig {
    public static void configureSelenideElaenutus(){
        Configuration.browser = "edge";
        Configuration.browser = "firefox";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://elaenutus.mirko.ee/et";
        Configuration.timeout = 1000000;

    }
}
