package polyaeva.cart;

import polyaeva.Identifiable;
import polyaeva.customer.Customer;
import polyaeva.goods.Products;

import java.util.HashMap;

public class Cart {
    private final Customer person;
    private final HashMap<String, ProductInCart> cartWithPurchases = new HashMap<>();

    public Cart(Customer person) {
        this.person = person;
    }

    public void addProductToCart(Products product, Integer quantity) {
        if (quantity > product.getQuantity()) {
            throw new IllegalStateException("Запрашиваемое количество продукта больше, чем есть на складе");
        }
        product.decreaseQuantity(quantity);
        cartWithPurchases.put(product.getId(), new ProductInCart(product, quantity));
    }

    public void removeProductFromCart(Identifiable product) {
        cartWithPurchases.remove(product.getId(), product);
    }

   public HashMap<String, ProductInCart> showPurchases(){
       return cartWithPurchases;
    }
    public Double totalPurchaseAmount(){
        Double result = null;
        for (ProductInCart product : this.cartWithPurchases.values() ){
        result += product.calculationPrice();

        }

        return result ;
    }

}
