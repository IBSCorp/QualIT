package ru.ibsqa.qualit.page_factory.handlers;

import lombok.AccessLevel;
import lombok.Getter;
import org.openqa.selenium.support.pagefactory.Annotations;

import java.lang.reflect.Field;

public abstract class AbstractElementAnnotationsHandler extends Annotations {

    @Getter(AccessLevel.PROTECTED)
    private final String driverId;

    public AbstractElementAnnotationsHandler(String driverId, Field field) {
        super(field);
        this.driverId = driverId;
    }

    /**
     * Признак того, что локатор содержит плейсхолдеры #{...}. Это означает, что требуется
     * искать элемент не при создании формы, а при обращении к нему.
     * @return
     */
    public abstract boolean isDynamic();

}
