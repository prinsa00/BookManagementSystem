package modules;

import java.util.ArrayList;

public class Order {

    int orderId;
    ArrayList<BookOrders> bookOrders;

    public Order(int orderId, ArrayList<BookOrders> bookOrders) {
        this.orderId = orderId;
        this.bookOrders = bookOrders;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<BookOrders> getBookOrders() {
        return bookOrders;
    }

    public void setBookOrders(ArrayList<BookOrders> bookOrders) {
        this.bookOrders = bookOrders;
    }

    public void getBill9(int discount,boolean vat){
        int total = 0;

        for(BookOrders bookOrder : this.bookOrders){
            int qty = bookOrder.quantity;
            int price = bookOrder.book.price;

            total += qty * price;
        }

        if(discount > 0){

        }
    }
}
