package polyaeva.goods;

public final class BedClothesBuilder {

    private String id;
    private String description;
    private Double price;
    private String brand;
    private Integer quantity;

    private String material;
    private String size;
    private String view;


    public BedClothesBuilder setMaterial(String material) {
        this.material = material;
        return this;
    }

    public BedClothesBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public BedClothesBuilder setView(String view) {
        this.view = view;
        return this;
    }

    public BedClothesBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public BedClothesBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public BedClothesBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    public BedClothesBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public BedClothesBuilder setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }


    public BedClothes build() {
        if (id == null || description == null || price == null || brand == null || quantity == null || material == null || size == null || view == null) {

            throw new IllegalStateException("not enough data!");
        }

        return new BedClothes(this.id, this.description, this.price, this.brand, this.quantity, this.material, this.size, this.view);
    }

}
