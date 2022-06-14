package rei.passive;

/**
 *
 * @author aaron.mitchell
 */
public class FundingSource {
    private String name;
    private Float totalAmount;    
    private Float percentOfTotalFunding;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Float getPercentOfTotalFunding() {
        return percentOfTotalFunding;
    }

    public void setPercentOfTotalFunding(Float percentOfTotalFunding) {
        this.percentOfTotalFunding = percentOfTotalFunding;
    }


}
