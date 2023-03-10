package ru.ibsqa.qualit.image.driver;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import ru.ibsqa.qualit.selenium.driver.ISupportedDriver;
import ru.ibsqa.qualit.selenium.driver.configuration.IDriverConfiguration;

@RequiredArgsConstructor
public enum ImageSupportedDriver implements ISupportedDriver {

    IMAGE_DRIVER(ImageDriver.class);

    private final Class<? extends WebDriver> driverClass;

    @Override
    public Class<? extends WebDriver> getAsClass() {
        return driverClass;
    }

    @Override
    public void initDriver(IDriverConfiguration configuration) {
    }

}
