

public class SmartshelfTest {
    public static void main(String[] args) {

        Smartshelf shelf = new Smartshelf();
        shelf.add(new Item("Clock", 400));
        shelf.add(new Item("Newspaper", 20));
        System.out.println(shelf.numberOfItems());
        shelf.add(new Item("Pen", 35));
        System.out.println(shelf.numberOfItems());
        shelf.add(new Item("Bicycle", 1200));
        System.out.println(shelf);

        System.out.println(shelf.totalWeightInGrammes());
        System.out.println(shelf.averageWeightInGrammes());
        System.out.println(shelf.greatestItem());
        System.out.println(shelf.makeNewSmartshelfWith(100));

/**
        Smartshelf shelf = new Smartshelf();
        shelf.add(new Item("Soda", 400));
        shelf.add(null);
        System.out.println(shelf.numberOfItems());
        */

    }

}
