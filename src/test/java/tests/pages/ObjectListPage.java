package tests.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ObjectListPage {

    public SelenideElement allFilters = $(".filter__open-extend"),
                           storySelector = $("[name='floor']"),
                           storyFrom = $("[name=from]").closest(".field-wrapper"),
                           storyTo = $("[name=to").closest(".field-wrapper");

    public void openObjectListPage() {
        open("/objects/list");
    }

    public ObjectListPage filtersButton() {
        $(allFilters);
        return this;
    }

    public ObjectListPage storySelector () {
        $(storySelector);
        return this;
    }

    public ObjectListPage storyFromSelectorClick() {
        $(storyFrom).click();
        return this;
    }

    public ObjectListPage storyFrom() {
        return this;
    }
}
