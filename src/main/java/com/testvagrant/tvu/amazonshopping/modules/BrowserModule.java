package com.testvagrant.tvu.amazonshopping.modules;

import com.google.inject.AbstractModule;
import com.testvagrant.tvu.amazonshopping.drivers.Browser;
import com.testvagrant.tvu.amazonshopping.drivers.browserManager.ChromeDriverManager;
import com.testvagrant.tvu.amazonshopping.drivers.browserManager.FirefoxDriverManager;
import com.testvagrant.tvu.amazonshopping.drivers.wait.Waits;
import com.testvagrant.tvu.amazonshopping.properties.SystemProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedHashMap;
import java.util.Map;

public class BrowserModule extends AbstractModule {

    @Override
    public void configure() {
        bind(WebDriver.class).toProvider(getBrowserManager()).asEagerSingleton();
        bind(WebDriverWait.class).toProvider(Waits.class).asEagerSingleton();
    }


    private Class getBrowserManager() {
        Browser browser = Browser.valueOf(SystemProperties.BROWSER.toUpperCase());
        return browserProviderMap().get(browser);
    }

    private Map<Browser, Class> browserProviderMap() {
        Map<Browser, Class> browserProviderMap = new LinkedHashMap<>();
        browserProviderMap.put(Browser.CHROME, ChromeDriverManager.class);
        browserProviderMap.put(Browser.FIREFOX, FirefoxDriverManager.class);
        return browserProviderMap;
    }
}
