package tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ObjectListPage {

    public SelenideElement allFilters = $(".filter__open-extend"),
                           storySelector = $("[name='floor']"),
                           storyFrom = $("[name=from]").closest(".field-wrapper"),
                           storyTo = $("[name=to").closest(".field-wrapper"),
                           wcType = $("[name=wcType]").closest(".field__element"),
                           wcTypeValue = $(".dropdown-item").closest(".shell-element"),
                           searchChips = $(".shell-element .chips__item_black");


    public void openObjectListPage() {
        open("/objects/list");
    }

    public ObjectListPage filtersButtonClick() {
        $(allFilters).click();
        return this;
    }

    public ObjectListPage storySelectorClick () {
        $(storySelector).click();
        return this;
    }

    public ObjectListPage storyFromSelectorClick() {
        $(storyFrom).click();
        return this;
    }

    public ObjectListPage storyFromClick() {
        $(storyFrom).click();
        return this;
    }

    public ObjectListPage storyToClick() {
        $(storyTo).click();
        return this;
    }

}
