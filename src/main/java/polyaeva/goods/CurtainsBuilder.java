package polyaeva.goods;

public final class CurtainsBuilder {

    private String id;
    private String description;
    private Double price;
    private String brand;
    private Integer quantity;

    private Type type;
    private String length;



    public CurtainsBuilder setType(Type type) {
        this.type = type;
        return this;
    }

    public CurtainsBuilder setLength(String length) {
        this.length = length;
        return this;
    }

    public CurtainsBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public CurtainsBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public CurtainsBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    public CurtainsBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CurtainsBuilder setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }


    public Curtains build() {
        if (id == null || description == null || price == null || brand == null || quantity == null || type == null || length == null) {

            throw new IllegalStateException("not enough data!");
        }

        return new Curtains(this.id, this.description, this.price, this.brand, this.quantity, this.type, this.length);
    }

}

