package ru.ibsqa.qualit.definitions.repository.selenium.elements;

import ru.ibsqa.qualit.definitions.repository.IElementFacadeMapper;
import ru.ibsqa.qualit.definitions.repository.MetaPriority;
import ru.ibsqa.qualit.definitions.repository.ConfigurationPriority;
import ru.ibsqa.qualit.definitions.repository.selenium.AbstractMetaContainer;
import ru.ibsqa.qualit.definitions.repository.selenium.IMetaCollection;
import lombok.Getter;
import lombok.ToString;
import ru.ibsqa.qualit.selenium.driver.ISupportedDriver;
import ru.ibsqa.qualit.utils.spring.SpringUtils;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@ToString(callSuper = true)
@XmlRootElement(name = "Collection")
@MetaPriority(ConfigurationPriority.LOW)
public class MetaCollection extends AbstractMetaContainer implements IMetaCollection {

    @Getter
    @XmlAttribute
    private String customType;

    @Override
    public String getFacadeClassName(Class<? extends ISupportedDriver> supportedDriver) {
        if (null != customType && !customType.isEmpty()) {
            return customType;
        } else {
            // mapping
            return getElementFacadeMapper().getFacadeClassName(this.getClass(), supportedDriver);
            //return DefaultCollection.class.getCanonicalName();
        }
    }

    private static IElementFacadeMapper elementFacadeMapper;
    private static IElementFacadeMapper getElementFacadeMapper(){
        if (null == elementFacadeMapper){
            elementFacadeMapper = SpringUtils.getBean(IElementFacadeMapper.class);
        }
        return elementFacadeMapper;
    }

}
