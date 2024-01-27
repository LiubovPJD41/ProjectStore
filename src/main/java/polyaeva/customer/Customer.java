package polyaeva.customer;

import polyaeva.Identifiable;
import polyaeva.order.Order;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Identifiable {
    private final String name;
    private final String surname;
    private final String userName;
    private final List <Order> lastPurchase = new ArrayList<>();

    public Customer(String name, String surname, String userName) {
        this.name = name;
        this.surname = surname;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserName() {
        return userName;
    }

    public List<Order> getLastPurchase() {
        return lastPurchase;
    }
    public void addOrder(Order order){
        lastPurchase.add(order);
    }

    @Override
    public String getId() {
        return this.getUserName();
    }
}
