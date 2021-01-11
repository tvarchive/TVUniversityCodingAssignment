package com.testvagrant.tvu.amazonshopping.interceptors;

import com.testvagrant.tvu.amazonshopping.retry.RetryEngine;
import org.aopalliance.intercept.MethodInvocation;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.StaleElementReferenceException;
import org.springframework.retry.RetryCallback;

import java.util.concurrent.atomic.AtomicReference;

public abstract class SiteInterceptor {

    @NotNull
    protected AtomicReference<Object> retryObjInvoke(MethodInvocation invocation) {
        AtomicReference<Object> proceed = new AtomicReference<>();
        RetryCallback retryCallback = retry -> {
            try {
                proceed.set(invocation.proceed());
                return proceed.get();
            } catch (StaleElementReferenceException e) {
                throw e;
            }
        };
        RetryEngine retryEngine = new RetryEngine(StaleElementReferenceException.class);
        retryEngine.execute(retryCallback);
        return proceed;
    }
}
