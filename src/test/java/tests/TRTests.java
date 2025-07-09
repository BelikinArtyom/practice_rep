package tests;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import tests.pages.Cookies;
import tests.pages.ObjectListPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class TRTests extends TestBase {

    ObjectListPage objectListPage = new ObjectListPage();
    Cookies cookies = new Cookies();

    @Test
    public void filterTest() {

        cookies.cityWithCookie();

        objectListPage.openObjectListPage();
        objectListPage.allFilters.click();
        objectListPage.storySelector.click();
        objectListPage.storyFrom.setValue("-5");
        objectListPage.storyFrom.shouldHave(value("5"));
    }


    @Test
    public void bathroomTagsTest() {

        cookies.cityWithCookie();

        objectListPage.openObjectListPage();
        objectListPage.allFilters.click();
        $("[name=wcType]").closest(".field__element").click();
        $(".dropdown-item").closest(".shell-element").click();
        $(".shell-element .chips__item_black").shouldBe(visible)
                .shouldHave(text("Раздельный"));
    }
}

//        open("/objects/list");
//        Cookie ck = new Cookie("selected_city", "58c665588b6aa52311afa01b");
//        WebDriverRunner.getWebDriver().manage().addCookie(ck);
//
//        open("/objects/list");
//        $(".filter__open-extend").shouldHave(text("Все фильтры")).click();
//        $("[name='floor']").closest(".field__element").click();
//
//        $("[name=from]").closest(".field-wrapper").click();
//        $(Selectors.byAttribute("placeholder","Этаж c"))
//                .setValue("-5")
//                .shouldHave(value("5"));
//
//    }
