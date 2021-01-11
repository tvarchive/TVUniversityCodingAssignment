package com.testvagrant.tvu.amazonshopping.site;


import com.testvagrant.tvu.amazonshopping.pages.LaunchPage;
import com.testvagrant.tvu.amazonshopping.pages.PageInitiator;

public class Launcher {

    public void launch() {
        LaunchPage launchPage = PageInitiator.getPage(LaunchPage.class);
        launchPage.launch();
        launchPage.getSiteDetails().assertThatSiteIsUp();
    }
}
