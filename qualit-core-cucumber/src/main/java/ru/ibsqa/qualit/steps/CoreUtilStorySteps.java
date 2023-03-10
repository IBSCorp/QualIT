package ru.ibsqa.qualit.steps;

import ru.ibsqa.qualit.steps.roles.Value;
import io.cucumber.java.ru.Когда;
import org.springframework.beans.factory.annotation.Autowired;

public class CoreUtilStorySteps extends AbstractSteps {

    @Autowired
    private CoreUtilSteps utilSteps;

    @StepDescription(action = "Пауза"
            , subAction = "Пауза в секундах"
            , parameters = {"seconds - время, на которое приостановить выполнение, сек"})
    @Когда("^приостановлено выполнение на \"([^\"]*)\" секунд$")
    public void stepStopExecuted(
            @Value String seconds
    ) {
        flow(()->
                utilSteps.stopExecuted(Integer.valueOf(evalVariable(seconds)))
        );
    }

    @StepDescription(action = "Пауза"
            , subAction = "Пауза в миллисекундах"
            , parameters = {"ms - время, на которое приостановить выполнение, мс"}
            , expertView = true)
    @Когда("^приостановлено выполнение на \"([^\"]*)\" мс$")
    public void stepStopExecutedMs(
            @Value String ms
    ) {
        flow(() ->
                utilSteps.stopExecutedMs(Integer.valueOf(evalVariable(ms)))
        );
    }
}