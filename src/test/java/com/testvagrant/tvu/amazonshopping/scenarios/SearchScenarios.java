package com.testvagrant.tvu.amazonshopping.scenarios;

import com.google.inject.Inject;
import com.testvagrant.tvu.amazonshopping.components.SearchComponent;
import com.testvagrant.tvu.amazonshopping.data.SearchData;
import com.testvagrant.tvu.amazonshopping.models.SearchContext;
import org.testng.annotations.Test;

public class SearchScenarios extends BaseScenario {

    @Test
    public void customerSearch() {
        SearchContext searchContext = SearchContext.builder().build().init();
        SearchComponent searchComponent = getComponent(SearchComponent.class);
        searchComponent.customerSearch(searchContext);
    }

    @Test(groups = "smoke", dataProvider = "search_items", dataProviderClass = SearchData.class)
    public void customerMultipleSearch(SearchContext searchContext) {
        SearchComponent searchComponent = getComponent(SearchComponent.class);
        searchComponent.customerSearch(searchContext);
    }
}
