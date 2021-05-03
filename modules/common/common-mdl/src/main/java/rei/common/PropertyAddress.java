package rei.common;

public class PropertyAddress {
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String unitId;

    public PropertyAddress(){

    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String toString(boolean singleLine){
        StringBuilder sb = new StringBuilder();
        sb.append(address1);
        if (address2 != null && !address2.isEmpty()) {
            sb.append(singleLine? ", ": "\n");
            sb.append(address2);
        }
        sb.append(singleLine? ", ": "\n");
        sb.append(city);
        sb.append(", ");
        sb.append(state);
        sb.append(" ");
        sb.append(zipcode);
        return sb.toString();
    }

    public String toString(){
        return toString(false);
    }
}
