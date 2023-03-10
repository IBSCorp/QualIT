package ru.ibsqa.qualit.drivers;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ibsqa.qualit.evaluate.IEvaluateManager;
import ru.ibsqa.qualit.selenium.driver.WebSupportedDriver;
import ru.ibsqa.qualit.selenium.driver.configuration.IDriverConfiguration;
import ru.ibsqa.qualit.selenium.driver.configuration.IDriverConfigurationAppender;

@Component
public class MyDriverConfigurationAppender implements IDriverConfigurationAppender {

    @Autowired
    private IEvaluateManager evaluateManager;

    @Override
    public void appendToConfiguration(IDriverConfiguration driverConfiguration) {
        if (WebSupportedDriver.CHROME.equals(driverConfiguration.getDriverType())) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments((String) evaluateManager.evalVariable("--load-extension=#{systemProperties['user.dir']}\\src\\main\\resources\\RecordPlugin\\chrome"));
            driverConfiguration.setOptions(options);
        }
    }

}
