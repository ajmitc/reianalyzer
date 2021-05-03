package rei.common;

/**
 * Represents information about a single property from a single datasource (ie. Redfin, Zillow, etc).
 *
 * Information can be conflicting from different sources, so we track the data received from each source.
 */
public class PropertyInfo {
    private String sourceId;
    private String url;

    private double listingPrice;
    private int numUnits;
    private double grossMonthlyRent;

    public PropertyInfo(String sourceId){
        this.sourceId = sourceId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getListingPrice() {
        return listingPrice;
    }

    public void setListingPrice(double listingPrice) {
        this.listingPrice = listingPrice;
    }

    public int getNumUnits() {
        return numUnits;
    }

    public void setNumUnits(int numUnits) {
        this.numUnits = numUnits;
    }

    public double getGrossMonthlyRent() {
        return grossMonthlyRent;
    }

    public void setGrossMonthlyRent(double grossMonthlyRent) {
        this.grossMonthlyRent = grossMonthlyRent;
    }
}
