package ru.ibsqa.qualit;

import ru.ibsqa.qualit.selenium.driver.WebDriverFacade;
import ru.ibsqa.qualit.steps.AbstractSteps;
import ru.ibsqa.qualit.steps.TestStep;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

@Component
public class ApplicationUtilSteps extends AbstractSteps {

    @Autowired
    private WinProcessSteps winProcessSteps;

    @TestStep("показать приложение поверх всех окон")
    public void showWindow(WebDriverFacade driverFacade){
        String driverName = driverFacade.getDriverFactory().getConfiguration().getDriverType().name().toLowerCase();
        Field executor  = ReflectionUtils.findField(driverFacade.getWrappedDriver().getClass(), "executor");
        ReflectionUtils.makeAccessible(executor);
        CommandExecutor commandExecutor = (CommandExecutor) ReflectionUtils.getField(executor, driverFacade.getWrappedDriver());
        int port = ((DriverCommandExecutor) commandExecutor).getAddressOfRemoteServer().getPort();
        long pidDriver = winProcessSteps.getPidByPort(port);
        long chromePid = winProcessSteps.getParentPid(pidDriver, driverName);
        winProcessSteps.showWindow(chromePid);
    }
}
