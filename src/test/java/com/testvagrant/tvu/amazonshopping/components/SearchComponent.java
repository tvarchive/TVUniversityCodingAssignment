package com.testvagrant.tvu.amazonshopping.components;

import com.testvagrant.tvu.amazonshopping.models.Item;
import com.testvagrant.tvu.amazonshopping.models.SearchContext;
import com.testvagrant.tvu.amazonshopping.pages.BaseComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class SearchComponent extends BaseComponent {
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchNowButton;

    public List<Item> customerSearch(SearchContext searchContext) {
        type(searchBox, searchContext.getQuery(), "search box");
        click(searchNowButton, "search now icon");
        return Arrays.asList(Item.builder().build());
    }
}
