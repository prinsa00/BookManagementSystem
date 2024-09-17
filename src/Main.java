import modules.Book;
import modules.BookOrders;
import modules.Genre;
import modules.Order;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Genre g1 = new Genre("Fiction","Best fiction");
        Genre g2 = new Genre("Biography","Best biography");

//        System.out.println(g1.getDescription());
//        g1.setDescription("This is my fiction");
//        System.out.println(g1.getDescription());

        Book b1 = new Book("Ready Go",1234,"Test",false,g1);
        Book b2 = new Book("Set Two",6789,"John",false,g2);

        BookOrders bo1 = new BookOrders(9,b1);
        BookOrders bo2 = new BookOrders(13,b2);

        ArrayList<BookOrders> bookOrdersArrayList = new ArrayList<>();
        bookOrdersArrayList.add(bo1);
        bookOrdersArrayList.add(bo2);

        Order o1 = new Order(34,bookOrdersArrayList);




    }
}