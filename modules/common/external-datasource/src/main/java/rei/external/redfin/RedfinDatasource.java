package rei.external.redfin;

import rei.common.PropertyAddress;
import rei.common.PropertyInfo;

/**
 * This class is responsible for retrieving property listing data from Redfin
 */
public class RedfinDatasource {
    private static final String SOURCE_ID = "Redfin";

    public static PropertyInfo getPropertyInfo(PropertyAddress address){
        PropertyInfo propertyInfo = new PropertyInfo(SOURCE_ID);
        // TODO Search Redfin for this property and fill in info
        return propertyInfo;
    }

    private RedfinDatasource(){}
}
