package com.testvagrant.tvu.amazonshopping.listeners;

import com.testvagrant.tvu.amazonshopping.io.LogWriter;
import com.testvagrant.tvu.amazonshopping.site.Constants;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.Reporter;
import org.testng.xml.XmlSuite;

import java.util.List;

public class ReportListener implements IReporter {

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        suites.forEach(suite -> {
            suite.getResults().entrySet().forEach(entry -> {
                entry.getValue().getTestContext().getPassedTests().getAllResults().forEach(iTestResult -> {
                    List<String> logs = Reporter.getOutput(iTestResult);
                    String logFolder = (String) suite.getAttribute(Constants.LOG_FOLDER);
                    LogWriter.writeLog(logFolder, iTestResult.getName(),logs);
                });
            });
        });
    }
}
