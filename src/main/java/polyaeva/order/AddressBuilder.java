package polyaeva.order;

import polyaeva.goods.Clothes;
import polyaeva.goods.ClothesBuilder;
import polyaeva.goods.Season;

public class AddressBuilder {
    private  String city;
    private  String street;
    private String house;
    private Integer flat;
    private String postcode;

    public AddressBuilder setCity(String city) {
        this.city = city;
        return this;
    }
    public AddressBuilder setStreet(String street) {
        this.street = street;
        return this;
    }
    public AddressBuilder setHouse(String house) {
        this.house = house;
        return this;
    }
    public AddressBuilder setFlat(Integer flat) {
        this.flat = flat;
        return this;
    }
    public AddressBuilder setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public Address build() {
        if (city == null || street == null || house == null || flat== null || postcode == null) {
            //System.out.println(city);
           // System.out.println(street);
           // System.out.println(house);
           // System.out.println(flat);
           // System.out.println(postcode);
            throw new IllegalStateException("not enough data!");
        }

        return new Address(this.city,this.street, this.house, this.flat, this.postcode);
    }

}
