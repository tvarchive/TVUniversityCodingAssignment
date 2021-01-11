package com.testvagrant.tvu.amazonshopping.data;

import com.testvagrant.tvu.amazonshopping.models.SearchContext;
import org.testng.annotations.DataProvider;

public class SearchData {

    @DataProvider(name = "search_items")
    public Object[] dpMethod() {

        return new Object [] {
                SearchContext.builder().query("Nikon 5300").build(),
                SearchContext.builder().query("OnePlus 7t").build()
        };

    }
}
