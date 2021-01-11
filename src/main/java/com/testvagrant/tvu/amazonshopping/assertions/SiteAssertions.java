package com.testvagrant.tvu.amazonshopping.assertions;

import com.google.inject.Inject;
import com.testvagrant.tvu.amazonshopping.ReportLogger;
import com.testvagrant.tvu.amazonshopping.models.Site;

import static org.assertj.core.api.Assertions.assertThat;

public class SiteAssertions {
    @Inject
    Site expSiteDetails;


    public void assertThatSiteIsLoadedSuccessfully(Site siteDetails) {
        assertThat(siteDetails.equals(expSiteDetails.get())).isTrue();
        ReportLogger.log("Site is loaded correctly");
    }
}
