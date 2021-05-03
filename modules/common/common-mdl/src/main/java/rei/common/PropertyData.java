package rei.common;

import java.util.ArrayList;
import java.util.List;

public class PropertyData {
    private PropertyAddress address;
    private List<PropertyInfo> propertyInfo = new ArrayList<>();

    public PropertyData(){

    }

    public PropertyData(PropertyAddress address){
        this.address = address;
    }

    public List<PropertyInfo> getPropertyInfo() {
        return propertyInfo;
    }

    public PropertyAddress getAddress() {
        return address;
    }

    public void setAddress(PropertyAddress address) {
        this.address = address;
    }
}
