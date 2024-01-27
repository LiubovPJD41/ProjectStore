package polyaeva.goods;

public class Clothes extends Products {
    private final Season season;
    private final Sex sex;
    private final String size;


    public Clothes(String id, String description, Double price, String brand, Integer quantity, Season season, Sex sex, String size) {
        super(id, description, price, brand, quantity);
        this.season = season;
        this.sex = sex;
        this.size = size;
    }
}




