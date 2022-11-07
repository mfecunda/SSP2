import java.util.Arrays;

public class SmartshelfTest {
    public static void main(String[] args) {
    /**
        Smartshelf shelf = new Smartshelf();
        shelf.add(new Item("Clock", 400));
        shelf.add(new Item("Newspaper", 20));
        System.out.println(shelf.numberOfItems());
        shelf.add(new Item("Pen", 35));
        System.out.println(shelf.numberOfItems());
        System.out.println(shelf);
        */

        Smartshelf shelf = new Smartshelf();
        shelf.add(new Item("Soda", 400));
        shelf.add(null);
        System.out.println(shelf.numberOfItems());


    }

}
