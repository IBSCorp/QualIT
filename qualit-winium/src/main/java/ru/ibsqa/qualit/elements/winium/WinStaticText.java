package ru.ibsqa.qualit.elements.winium;

import ru.ibsqa.qualit.definitions.repository.ConfigurationPriority;
import ru.ibsqa.qualit.definitions.repository.winium.MetaWinStaticText;
import ru.ibsqa.qualit.elements.MetaElement;
import ru.ibsqa.qualit.i18n.ILocaleManager;
import ru.ibsqa.qualit.selenium.driver.WiniumSupportedDriver;

@MetaElement(value = MetaWinStaticText.class, supportedDriver = WiniumSupportedDriver.class, priority = ConfigurationPriority.LOW)
public class WinStaticText extends WinElementFacade {

    @Override
    public boolean isEditable() {
        return false;
    }

    @Override
    public void type(String value){
        throw new UnsupportedOperationException(ILocaleManager.message("elementIsReadOnlyErrorMessage"));
    }
}
