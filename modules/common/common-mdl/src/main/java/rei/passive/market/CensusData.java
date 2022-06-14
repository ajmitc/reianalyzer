package rei.passive.market;

import java.time.ZonedDateTime;

/**
 *
 * @author aaron.mitchell
 */
public class CensusData {
    private Market market;
    private ZonedDateTime date;

    private Float employmentRate;    
    private Float populationGrowth;    
    private Float rentGrowth;    
    private Float vacancyRate;    
    private Trend avgRentsTrend5yr;    
    private Trend buildingPermitsTrend5yr;    

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public Float getEmploymentRate() {
        return employmentRate;
    }

    public void setEmploymentRate(Float employmentRate) {
        this.employmentRate = employmentRate;
    }

    public Float getPopulationGrowth() {
        return populationGrowth;
    }

    public void setPopulationGrowth(Float populationGrowth) {
        this.populationGrowth = populationGrowth;
    }

    public Float getRentGrowth() {
        return rentGrowth;
    }

    public void setRentGrowth(Float rentGrowth) {
        this.rentGrowth = rentGrowth;
    }

    public Float getVacancyRate() {
        return vacancyRate;
    }

    public void setVacancyRate(Float vacancyRate) {
        this.vacancyRate = vacancyRate;
    }

    public Trend getAvgRentsTrend5yr() {
        return avgRentsTrend5yr;
    }

    public void setAvgRentsTrend5yr(Trend avgRentsTrend5yr) {
        this.avgRentsTrend5yr = avgRentsTrend5yr;
    }

    public Trend getBuildingPermitsTrend5yr() {
        return buildingPermitsTrend5yr;
    }

    public void setBuildingPermitsTrend5yr(Trend buildingPermitsTrend5yr) {
        this.buildingPermitsTrend5yr = buildingPermitsTrend5yr;
    }

    
}
