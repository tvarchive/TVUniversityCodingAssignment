package com.testvagrant.tvu.amazonshopping.properties;


import com.testvagrant.tvu.amazonshopping.drivers.Browser;
import com.testvagrant.tvu.amazonshopping.drivers.Target;

public final class SystemProperties {
    private static final String DEFAULT_ENV = System.getProperty("defaultEnv", "dev");
    public static final String ENV = System.getProperty("env", DEFAULT_ENV);
    public static final String TARGET = System.getProperty("target", Target.UI.name().toLowerCase());
    public static final String BROWSER = System.getProperty("browser", Browser.CHROME.name().toLowerCase());
    public static final Boolean TIMELINE = Boolean.valueOf(System.getProperty("timeline", "true"));
}
