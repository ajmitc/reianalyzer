package rei.passive.market;

import java.util.ArrayList;
import java.util.List;
import rei.passive.Rating;

/**
 *
 * @author aaron.mitchell
 */
public class Market {
    private String name;    // neighborhood name
    private String metro;   // Closest Metro Area

    private List<String> labels = new ArrayList<>();    // List of labels used for searching
    private List<CensusData> censusData = new ArrayList<>();

    private Rating rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMetro() {
        return metro;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<CensusData> getCensusData() {
        return censusData;
    }

    public void setCensusData(List<CensusData> censusData) {
        this.censusData = censusData;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    
    
}
