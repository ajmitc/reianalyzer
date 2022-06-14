package rei.passive;

/**
 *
 * @author aaron.mitchell
 */
public class WaterfallEntry {
    private int tier;
    private Float hurdle;
    private String type;
    private Float lpPortion;
    private Float gpPortion;

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public Float getHurdle() {
        return hurdle;
    }

    public void setHurdle(Float hurdle) {
        this.hurdle = hurdle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getLpPortion() {
        return lpPortion;
    }

    public void setLpPortion(Float lpPortion) {
        this.lpPortion = lpPortion;
    }

    public Float getGpPortion() {
        return gpPortion;
    }

    public void setGpPortion(Float gpPortion) {
        this.gpPortion = gpPortion;
    }

    
}
