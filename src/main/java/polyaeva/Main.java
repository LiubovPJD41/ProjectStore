package polyaeva;

import polyaeva.cart.Cart;
import polyaeva.catalog.Catalog;
import polyaeva.customer.Customer;
import polyaeva.goods.*;
import polyaeva.order.Address;
import polyaeva.order.AddressBuilder;
import polyaeva.order.Order;
import polyaeva.order.OrderStatus;



public class Main {
    public static void main(String[] args) {
        Catalog catalog = Catalog.getCatalog();
        Customer customer = new Customer("liubov", "Polyaeva", "sky");
        // Clothes dress = new Clothes("D345ku", "Long sleeve, long skirt", 424, "Zara", 3, Season.WINTER, Sex.FEMALE, "8-14");
        // Curtains room = new Curtains("RO678", "lambrigen", 243, "Zara", 6, Type.NIGHT, "2.1-2.3");
        //BedClothes FullSet = new BedClothes("FS789", "Full", 125, "Zara", 3, "linen", "kingsize", "full");

        Clothes dress = new ClothesBuilder()
                .setId("D345ku")
                .setDescription("Long sleeve, long skirt")
                .setPrice(424.00)
                .setBrand("Zara")
                .setQuantity(3)
                .setSeason(Season.WINTER)
                .setSex(Sex.FEMALE)
                .setAge("8-14")
                .build();

        BedClothes fullSet = new BedClothesBuilder()
                .setId("FS789")
                .setDescription("Full")
                .setPrice(125.00)
                .setBrand("Zara")
                .setQuantity(3)
                .setMaterial("linen")
                .setSize("Kingsize")
                .setView("Full")
                .build();

        Curtains room = new CurtainsBuilder()
                .setId("R0678")
                .setDescription("lambrigen")
                .setPrice(243.00)
                .setBrand("Zara")
                .setQuantity(6)
                .setType(Type.NIGHT)
                .setLength("2.1-2.3")
                .build();

        //  Address addressLP = new Address("Krasnodar", "Red street", "345", 76, "350 921");
        Address addressLP = new AddressBuilder()
                .setCity("Krasnodar")
                .setStreet("Red street")
                .setHouse("345")
                .setFlat(76)
                .setPostcode("350 921")
                .build();


        System.out.println(catalog.isEmpty());
        catalog.addToCatalog(dress);
        System.out.println(catalog.isEmpty());
        catalog.addToCatalog(room);
        catalog.addToCatalog(fullSet);

        System.out.println("Available products:  ");

        catalog.getStorage().forEach((id, products) ->
                //   System.out.println("Id product " + id + " Name of product " + products.getDescription()));

                System.out.printf("ID: %5s\tDescription: %5s\t%5d available\t%5.2f rubles \t%5s brand\n", id, products.getDescription(), products.getQuantity(), products.getPrice(), products.getBrand()));

        Cart cart = new Cart(customer);
        cart.addProductToCart(dress, 2);
        cart.addProductToCart(room, 1);

        Order order = new Order(customer, cart, OrderStatus.CREATED);

        System.out.println("Cart contents: ");
        cart.showPurchases().forEach((id, product) ->
                System.out.printf("id: %s, quantity in cart: %d, product: %s\n", id, product.getAmount(), product.getItem().toString()));

        System.out.println("Available products:  ");
        catalog.getStorage().forEach((id, products) ->
                //   System.out.println("Id product " + id + " Name of product " + products.getDescription()));

                System.out.printf("ID: %5s\tDescription: %5s\t%5d available\t%5.2f rubles \t%5s brand\n", id, products.getDescription(), products.getQuantity(), products.getPrice(), products.getBrand()));

        order.getOrderStatus();
        order.assembly();
        System.out.println(order.getOrderStatus());
        order.paid();
        System.out.println(order.getOrderStatus());
        order.delivery();
        System.out.println(order.getOrderStatus());
        order.completed();
        System.out.println(order.getOrderStatus());
    }
}