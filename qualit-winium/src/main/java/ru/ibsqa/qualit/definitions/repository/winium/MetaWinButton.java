package ru.ibsqa.qualit.definitions.repository.winium;

import lombok.ToString;
import ru.ibsqa.qualit.definitions.repository.MetaPriority;
import ru.ibsqa.qualit.definitions.repository.ConfigurationPriority;

import javax.xml.bind.annotation.XmlRootElement;

@ToString(callSuper = true)
@XmlRootElement(name = "WinButton")
@MetaPriority(ConfigurationPriority.LOW)
public class MetaWinButton extends AbstractMetaWiniumField {
}
