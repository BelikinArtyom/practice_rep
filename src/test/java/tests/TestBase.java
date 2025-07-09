package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class TestBase {

    @BeforeAll
    public static void beforeAll() {

        String BROWSER = System.getProperty("browser", "chrome");
        String BROWSER_SIZE = System.getProperty("browser.size", "1920x1080");

        Configuration.browser = BROWSER;
        Configuration.browserSize = BROWSER_SIZE;
        Configuration.baseUrl = "https://trendrealty.ru";
    }
}