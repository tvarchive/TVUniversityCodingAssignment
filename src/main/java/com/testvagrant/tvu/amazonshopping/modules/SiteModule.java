package com.testvagrant.tvu.amazonshopping.modules;

import com.google.inject.AbstractModule;
import com.testvagrant.tvu.amazonshopping.clients.SiteClient;

public class SiteModule extends AbstractModule {

    @Override
    public void configure() {
        bind(SiteClient.class).asEagerSingleton();
    }
}
