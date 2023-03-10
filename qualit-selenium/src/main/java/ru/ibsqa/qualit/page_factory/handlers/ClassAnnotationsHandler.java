package ru.ibsqa.qualit.page_factory.handlers;

import ru.ibsqa.qualit.definitions.annotations.selenium.Page;
import ru.ibsqa.qualit.elements.selenium.WebElementFacade;
import ru.ibsqa.qualit.exceptions.ElementCreationError;
import ru.ibsqa.qualit.page_factory.locator.ISearchStrategy;
import ru.ibsqa.qualit.utils.spring.SpringUtils;
import org.openqa.selenium.By;

public class ClassAnnotationsHandler<T extends WebElementFacade> extends AbstractClassAnnotationsHandler {

    private ISearchStrategy searchStrategy = SpringUtils.getBean(ISearchStrategy.class);

    public ClassAnnotationsHandler(String driverId, Class<T> elementClass) {
        super(driverId, elementClass);
    }

    @Override
    public By buildBy() {
        Class<?> clazz = getElementClass();
        while (clazz != Object.class) {
            if (clazz.isAnnotationPresent(Page.class)) {
                Page pageAnnotation = clazz.getAnnotation(Page.class);
                return searchStrategy.getLocator(pageAnnotation.locator());
            }
            clazz = clazz.getSuperclass();
        }
        throw new ElementCreationError(String.format("Не удалось создать элемент %s", getElementClass()));
    }

    @Override
    public boolean isLookupCached() {
        return false;
    }
}
