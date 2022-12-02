package ru.ibsqa.qualit.elements.collections;

import ru.ibsqa.qualit.elements.IFacadeCollection;
import ru.ibsqa.qualit.elements.IFacadeMappedByMeta;
import ru.ibsqa.qualit.page_factory.pages.IPageObject;
import lombok.AccessLevel;
import lombok.Getter;
import org.json.JSONArray;
import org.json.JSONException;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.util.Iterator;

public abstract class AbstractCollection<PAGE extends IPageObject> implements IFacadeCollection<PAGE>, IFacadeMappedByMeta {

    @Getter(AccessLevel.PUBLIC)
    private String collectionName;

    @Getter(AccessLevel.PUBLIC)
    private int waitTimeOut;

    @Getter(AccessLevel.PROTECTED)
    private ElementLocator elementLocator;

    @Getter(AccessLevel.PROTECTED)
    private String[] frames;

    @Getter(AccessLevel.PROTECTED)
    private Class<PAGE> collectionObjectClass;

    public AbstractCollection() {
    }

    public void pushArguments(final String collectionName, final int waitTimeOut, final ElementLocator elementLocator, final String[] frames, final Class<PAGE> collectionObjectClass) {
        this.collectionName = collectionName;
        this.waitTimeOut = waitTimeOut;
        this.elementLocator = elementLocator;
        this.frames = frames;
        this.collectionObjectClass = collectionObjectClass;
    }

    @Override
    public JSONArray exportToJson() throws JSONException {
        JSONArray jsonArray = new JSONArray();
        Iterator<PAGE> iter = iterator();
        while (iter.hasNext()) {
            PAGE page = iter.next();
            jsonArray.put(page.exportToJson());
        }
        return jsonArray;
    }

}
