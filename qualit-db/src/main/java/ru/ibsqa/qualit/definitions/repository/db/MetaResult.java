package ru.ibsqa.qualit.definitions.repository.db;

import lombok.ToString;
import ru.ibsqa.qualit.definitions.repository.MetaPriority;
import ru.ibsqa.qualit.definitions.repository.ConfigurationPriority;

import javax.xml.bind.annotation.XmlRootElement;

@ToString(callSuper = true)
@XmlRootElement(name="Result")
@MetaPriority(ConfigurationPriority.LOW)
public class MetaResult extends AbstractFieldList {
}
