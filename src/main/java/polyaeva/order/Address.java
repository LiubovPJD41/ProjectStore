package polyaeva.order;

public class Address {
    private final String city;
    private final String street;
    private final String house;
    private final Integer flat;
    private final String postcode;

    public Address(String city, String street, String house, Integer flat, String postcode) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public Integer getFlat() {
        return flat;
    }

    public String getPostcode() {
        return postcode;
    }

}
