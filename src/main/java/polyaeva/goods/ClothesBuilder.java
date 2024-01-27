package polyaeva.goods;

public final class ClothesBuilder {

    private String id;
    private String description;
    private Double price;
    private String brand;
    private Integer quantity;

    private Season season;
    private Sex sex;
    private String age;


    public ClothesBuilder setSeason(Season season) {
        this.season = season;
        return this;
    }

    public ClothesBuilder setSex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public ClothesBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public ClothesBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public ClothesBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public ClothesBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    public ClothesBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ClothesBuilder setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }


    public Clothes build() {
        if (id == null || description == null || price == null || brand == null || quantity == null || season == null || sex == null || age == null) {

            throw new IllegalStateException("not enough data!");
        }

        return new Clothes(this.id,this.description, this.price, this.brand, this.quantity, this.season, this.sex, this.age);
    }

}
