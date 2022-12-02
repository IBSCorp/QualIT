package ru.ibsqa.qualit.influx.providers.defaults;

import ru.ibsqa.qualit.influx.config.InfluxConfig;
import ru.ibsqa.qualit.influx.context.TestContext;
import ru.ibsqa.qualit.influx.providers.FieldData;
import ru.ibsqa.qualit.influx.providers.IFieldProvider;
import ru.ibsqa.qualit.influx.providers.Moment;
import org.springframework.stereotype.Component;

@Component
public class FailureMessageProvider implements IFieldProvider {

    @Override
    public FieldData getFieldData(InfluxConfig config, Moment moment, TestContext context) {
        if (Moment.AFTER_TEST == moment && !config.isSkipDefaultProviders()) {
            return new FieldData("failure_message", context.getFailureMessage());
        }
        return null;
    }

}