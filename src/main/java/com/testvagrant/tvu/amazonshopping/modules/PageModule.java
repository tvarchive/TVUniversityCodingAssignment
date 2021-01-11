package com.testvagrant.tvu.amazonshopping.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.testvagrant.tvu.amazonshopping.annotations.Screenshot;
import com.testvagrant.tvu.amazonshopping.annotations.StaleHandler;
import com.testvagrant.tvu.amazonshopping.interceptors.ScreenshotInterceptor;
import com.testvagrant.tvu.amazonshopping.interceptors.ScreenshotTaker;
import com.testvagrant.tvu.amazonshopping.interceptors.StaleHandlerInterceptor;

import static com.google.inject.matcher.Matchers.annotatedWith;
import static com.google.inject.matcher.Matchers.any;

public class PageModule extends AbstractModule {

    @Inject
    ScreenshotTaker screenshotTaker;

    @Override
    public void configure() {
        ScreenshotInterceptor screenshotInterceptor = new ScreenshotInterceptor();
        StaleHandlerInterceptor staleHandlerInterceptor = new StaleHandlerInterceptor();
        requestInjection(screenshotInterceptor);
        bindInterceptor(any(), annotatedWith(Screenshot.class), screenshotInterceptor);
        bindInterceptor(any(), annotatedWith(StaleHandler.class), staleHandlerInterceptor);
    }
}
