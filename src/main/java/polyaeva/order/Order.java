package polyaeva.order;

import polyaeva.cart.Cart;
import polyaeva.customer.Customer;

public class Order {
    private final Customer buyer;
    private final Cart receipt;
    private OrderStatus orderStatus;

    public Order(Customer buyer, Cart receipt, OrderStatus orderStatus) {
        this.buyer = buyer;
        this.receipt = receipt;
        this.orderStatus = orderStatus;
    }

    public Customer getBuyer() {
        return buyer;
    }

    public Cart getReceipt() {
        return receipt;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setStatus (OrderStatus status){
        this.orderStatus = status;
    }

   public void created(){
        this.setStatus(OrderStatus.CREATED);
   }
   public void assembly(){
        this.setStatus(OrderStatus.ASSEMBLY);
   }
   public void paid(){
        this.setStatus(OrderStatus.PAID);
    }
    public void delivery(){
        this.setStatus(OrderStatus.DELIVERY);
    }
    public void completed(){
        this.setStatus(OrderStatus.COMPLETED);
    }
}
