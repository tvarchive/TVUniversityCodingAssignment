package com.testvagrant.tvu.amazonshopping.listeners;

import com.google.inject.Injector;
import com.testvagrant.tvu.amazonshopping.clients.SiteClient;
import com.testvagrant.tvu.amazonshopping.io.LogWriter;
import com.testvagrant.tvu.amazonshopping.modules.PropertyModule;
import com.testvagrant.tvu.amazonshopping.modules.SiteModule;
import com.testvagrant.tvu.amazonshopping.site.Constants;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import java.util.logging.Logger;

import static com.testvagrant.tvu.amazonshopping.ReportLogger.log;


public class SiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        Injector siteInjector = suite.getParentInjector().createChildInjector(new SiteModule(), new PropertyModule());
        Logger logger = siteInjector.getInstance(Logger.class);
        log("Verifying if site is up");
        siteInjector.getInstance(SiteClient.class).terminateIfSiteIsDown();
        String logFolder = siteInjector.getInstance(LogWriter.class).createLogFolder();
        suite.setAttribute(Constants.LOG_FOLDER, logFolder);
    }
}
