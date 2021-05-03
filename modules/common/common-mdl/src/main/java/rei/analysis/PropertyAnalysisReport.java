package rei.analysis;

import rei.common.PropertyData;

public class PropertyAnalysisReport {
    private PropertyData propertyData;
    private CashOnCashCalculator cashOnCashCalculator = new CashOnCashCalculator();

    public PropertyAnalysisReport(){}

    public PropertyData getPropertyData() {
        return propertyData;
    }

    public void setPropertyData(PropertyData propertyData) {
        this.propertyData = propertyData;
    }

    public CashOnCashCalculator getCashOnCashCalculator() {
        return cashOnCashCalculator;
    }
}
