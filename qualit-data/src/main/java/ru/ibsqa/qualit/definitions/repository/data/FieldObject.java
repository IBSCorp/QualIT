package ru.ibsqa.qualit.definitions.repository.data;

import lombok.ToString;
import ru.ibsqa.qualit.definitions.repository.MetaPriority;
import ru.ibsqa.qualit.definitions.repository.ConfigurationPriority;

import javax.xml.bind.annotation.XmlRootElement;

@ToString(callSuper = true)
@XmlRootElement(name="FieldObject")
@MetaPriority(ConfigurationPriority.LOW)
public class FieldObject extends AbstractDataMetaField { // TODO реализовать проверку на соответствие типу при чтении
    @Override
    protected Class getPrimitiveType() {
        return String.class; // TODO
    }
}
