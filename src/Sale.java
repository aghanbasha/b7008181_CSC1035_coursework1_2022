public class Sale {
    private String house_number;
    private String postcode;
    private String value;
    private String date;

    public Sale(String house_number, String postcode, String value, String date) {
        this.house_number = house_number;
        this.postcode = postcode;
        this.value = value;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "house_number='" + house_number + '\'' +
                ", postcode='" + postcode + '\'' +
                ", value='" + value + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getHouse_number() {
        return house_number;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }
}
