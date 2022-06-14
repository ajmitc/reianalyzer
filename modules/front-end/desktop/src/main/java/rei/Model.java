package rei;

import rei.common.PropertyData;
import rei.passive.Deal;

import java.util.ArrayList;
import java.util.List;
import rei.passive.Sponsor;
import rei.passive.market.Market;

public class Model {
    // Active REI
    private List<PropertyData> propertyList = new ArrayList<>();

    // Passive REI
    private List<Deal>    passiveDeals = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();
    private List<Market>  markets = new ArrayList<>();

    public Model(){

    }

    public List<PropertyData> getPropertyList() {
        return propertyList;
    }

    public List<Deal> getPassiveDeals() {
        return passiveDeals;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Market> getMarkets() {
        return markets;
    }
}
