package rei.external.zillow;

import rei.common.PropertyAddress;
import rei.common.PropertyInfo;

/**
 * This class is responsible for retrieving property listing data from Zillow
 */
public class ZillowDatasource {
    private static final String SOURCE_ID = "Zillow";

    public static PropertyInfo getPropertyInfo(PropertyAddress address){
        PropertyInfo propertyInfo = new PropertyInfo(SOURCE_ID);
        // TODO Search Zillow for this property and fill in info
        return propertyInfo;
    }

    private ZillowDatasource(){}
}
