package com.testvagrant.tvu.amazonshopping.pages;

import com.google.inject.Injector;
import com.testvagrant.tvu.amazonshopping.site.Constants;
import org.testng.Reporter;

public class PageInitiator {

    public static <T extends BasePage> T getPage(Class<T> tClass) {
        Injector pageInjector = (Injector) Reporter.getCurrentTestResult()
                .getAttribute(Constants.PAGE_INJECTOR);
        T page = pageInjector.getInstance(tClass);
        return (T) page.init(page);
    }

    public static <T extends BaseComponent> T getComponent(Class<T> tClass) {
        Injector pageInjector = (Injector) Reporter.getCurrentTestResult()
                .getAttribute(Constants.PAGE_INJECTOR);
        T page = pageInjector.getInstance(tClass);
        return (T) page.init(page);
    }
}
