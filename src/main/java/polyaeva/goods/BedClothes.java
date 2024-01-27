package polyaeva.goods;

public class BedClothes extends Products {
    private final String material;
    private final String size;
    private final String view;


    public BedClothes(String id, String description, double price, String brand, int quantity, String material, String size, String view) {
        super(id, description, price, brand, quantity);
        this.material = material;
        this.size = size;
        this.view = view;
    }
}

