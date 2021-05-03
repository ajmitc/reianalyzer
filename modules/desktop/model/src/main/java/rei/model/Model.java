package rei.model;

import rei.common.PropertyData;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<PropertyData> propertyList = new ArrayList<>();

    public Model(){

    }

    public List<PropertyData> getPropertyList() {
        return propertyList;
    }
}
