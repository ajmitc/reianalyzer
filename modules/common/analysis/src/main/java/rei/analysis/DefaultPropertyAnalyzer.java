package rei.analysis;

import rei.common.PropertyAddress;
import rei.common.PropertyData;
import rei.common.PropertyInfo;
import rei.external.redfin.RedfinDatasource;
import rei.external.zillow.ZillowDatasource;

/**
 * This class will analyze the viability of purchasing a property.
 *
 * It will pull property information from the internet, compute ROI and other factors and provide a report.
 */
public class DefaultPropertyAnalyzer implements PropertyAnalyzer{

    public PropertyAnalysisReport analyze(PropertyAddress address){
        PropertyData propertyData = new PropertyData(address);

        // Get listing data
        propertyData.getPropertyInfo().add(pullRedfinListing(address));
        propertyData.getPropertyInfo().add(pullZillowListing(address));

        PropertyAnalysisReport report = new PropertyAnalysisReport();
        report.setPropertyData(propertyData);

        return report;
    }

    private PropertyInfo pullRedfinListing(PropertyAddress address){
        return RedfinDatasource.getPropertyInfo(address);
    }

    private PropertyInfo pullZillowListing(PropertyAddress address){
        return ZillowDatasource.getPropertyInfo(address);
    }
}
