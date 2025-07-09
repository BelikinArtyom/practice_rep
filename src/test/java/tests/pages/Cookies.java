package tests.pages;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Cookie;
import tests.TestBase;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;

public class Cookies {

    public Cookies cityWithCookie() {
        open("https://trendrealty.ru/images/favicons/favicon-16x16.png");
        Cookie selected_city = new Cookie("selected_city", "58c665588b6aa52311afa01b");
        webdriver().driver().getWebDriver().manage().addCookie(selected_city);
        return this;
    }
}
