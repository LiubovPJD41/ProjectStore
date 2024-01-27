package polyaeva.goods;

import polyaeva.Identifiable;

import java.util.Objects;

public class Products implements Identifiable {
    private final String id;
    private final String description;
    private final double price;
    private final String brand;
    private int quantity;


    public Products(String id, String description, double price, String brand, int quantity) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
    }

    public void decreaseQuantity(int amount) {
        this.quantity -= amount;
    }


    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Double.compare(price, products.price) == 0 && quantity == products.quantity && Objects.equals(id, products.id) && Objects.equals(description, products.description) && Objects.equals(brand, products.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", prise=" + price +
                ", brand='" + brand + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public String getId() {
        return id;
    }
}

