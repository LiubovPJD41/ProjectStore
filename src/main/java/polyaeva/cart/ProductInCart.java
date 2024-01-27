package polyaeva.cart;

import polyaeva.goods.Products;

public class ProductInCart {
    private final Products item;
    private final Integer amount;

    public ProductInCart(Products item, Integer amount) {
        this.item = item;
        this.amount = amount;
    }

    public Products getItem() {
        return item;
    }

    public Integer getAmount() {
        return amount;
    }

    public Double calculationPrice() {
        return this.item.getPrice() * amount;
    }
}
