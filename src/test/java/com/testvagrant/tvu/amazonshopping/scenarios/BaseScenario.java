package com.testvagrant.tvu.amazonshopping.scenarios;

import com.testvagrant.tvu.amazonshopping.modules.PropertyModule;
import com.testvagrant.tvu.amazonshopping.modules.SiteModule;
import com.testvagrant.tvu.amazonshopping.pages.PageInitiator;
import org.testng.annotations.Guice;

@Guice(modules = {SiteModule.class, PropertyModule.class})
public class BaseScenario {

    protected <T> T getComponent(Class tClass) {
        return (T) PageInitiator.getComponent(tClass);
    }
}
