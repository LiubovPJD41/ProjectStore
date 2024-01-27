package polyaeva.goods;

public class Curtains extends Products {
    private final Type type;
    private final String length;


    public Curtains(String id, String description, double price, String brand, int quantity, Type type, String length) {
        super(id, description, price, brand, quantity);
        this.type = type;
        this.length = length;

    }
}

