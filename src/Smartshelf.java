import java.util.ArrayList;
import java.util.Arrays;

/**
 * A Smartshelf holds zero or more Items and can provide information about the
 * Items. One can add Items to a Smartshelf during its lifetime, empty the
 * Smartshelf, create a copy which contains Items only up to a certain weight,
 * and make various queries to the Smartshelf. (Thus, the number of Items that
 * will be stored by a Smartshelf object is not yet known when the new object
 * is created, and it may grow and shrink over the lifetime of a Smartshelf
 * object.)
 *
 * @author
 */
public class Smartshelf {
    private static ArrayList<Item> allItems;
    /**
     * Constructs a new Smartshelf without any Items.
     */
    public Smartshelf() {
        allItems = new ArrayList<>();
    }


    /**
     * Constructs a new Smartshelf containing the non-null Items in items.
     * The items array may be modified by the caller afterwards without
     * affecting this Smartshelf, and it will not be modified by this
     * constructor.
     *
     * @param items must not be null; non-null elements are added to the
     *  constructed Smartshelf
     */
    public Smartshelf(Item[] items) {

        if(items.length > 1){
            allItems = new ArrayList<>();
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null) {
                    allItems.add(items[i]);
                }
            }


        }




    }

    /* Modifiers */

    /**
     * Adds an Item e to this Smartshelf if e is not null; does not modify this
     * Smartshelf otherwise. Returns true if e is not null, false otherwise.
     *
     * @param e an item to be added to this Smartshelf
     * @return true if e is not null, false otherwise
     */
    public boolean add(Item e) {

        
        if (e != null ){
            allItems.add(e);
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Adds all non-null Items in items to this Smartshelf.
     *
     * @param items contains the Item objects to be added to
     *  this Smartshelf; must not be null (but may contain null)
     * @return true if at least one element of items is non-null;
     *  false otherwise
     */
    public boolean addAll(Item[] items) {

        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                allItems.add(items[i]);
            }
        }
        if (allItems.size() > 0) {
            return true;
        }

        return false;
    }
    /**
     * Empties this Smartshelf to a Smartshelf that contains 0 Items.
     */
    public void empty() {
        allItems = new ArrayList<>();
    }

    /**
     * Removes certain Items from this Smartshelf. Exactly those Items are kept
     * whose weight in grammes is less than or equal to the specified maximum
     * weight in grammes.
     *
     * @param maxItemWeightInGrammes the maximum weight in grammes for the
     *  Items that are kept
     */
    public void keepOnlyItemsWith(int maxItemWeightInGrammes) {
        ArrayList <Item>onlyNewItems = new ArrayList<>();
        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getWeightInGrammes()<= maxItemWeightInGrammes){
                onlyNewItems.add(allItems.get(i));
            }
        }
        allItems = onlyNewItems;
    }

    /* Accessors */

    /**
     * Returns the number of non-null Items in this Smartshelf.
     *
     * @return the number of non-null Items in this Smartshelf
     */
    public int numberOfItems() {
        return allItems.size();
    }

    /**
     * Returns the total weight of the Items in this Smartshelf.
     *
     * @return the total weight of the Items in this Smartshelf.
     */
    public int totalWeightInGrammes() {
        int averageWeight = 0;
        for (int i = 0; i <allItems.size() ; i++) {
            averageWeight += allItems.get(i).getWeightInGrammes();
        }
        return averageWeight;
    }

    /**
     * Returns the average weight in grammes of the (non-null) Items
     * in this Smartshelf. In case there is no Item in this Smartshelf,
     * -1.0 is returned.
     *
     * For example, if this Smartshelf has the contents
     *   new Item("clock", 400)
     * and
     *   new Item("textbook", 395),
     * the result is: 397.5
     *
     * @return the average length of the Items in this Smartshelf,
     *  or -1.0 if there is no such Item.
     */
    public double averageWeightInGrammes() {
        if(allItems.size() == 0){
            return -1;
        }
        int numberOfItems = allItems.size();
        double totalWeight = totalWeightInGrammes();
            return totalWeight/numberOfItems;
    }

    /**
     * Returns the greatest Item in this Smartshelf according to the
     * natural ordering of Item given by its compareTo method;
     * null if this Smartshelf does not contain any Item objects
     *
     * @return the greatest Item in this Smartshelf according to the
     *  natural ordering of Item given by its compareTo method;
     *  null if this Smartshelf does not contain any Item objects
     */
    public Item greatestItem() {
        Item largestItem = null;
        if(allItems.size() > 0) {
            largestItem = allItems.get(0);
            int weight = allItems.get(0).getWeightInGrammes();
            for (int i = 0; i < allItems.size(); i++) {
                if (allItems.get(i).getWeightInGrammes() > weight) {
                    largestItem = allItems.get(i);
                }
            }
        }
        // TO DO
        return largestItem;
    }

    /**
     * Returns a new Smartshelf with exactly those Items of this Smartshelf
     * whose weight is less than or equal to the specified method parameter.
     * Does not modify this Smartshelf.
     *
     * @param maxItemWeightInGrammes the maximum weight in grammes for the
     *  Items in the new Smartshelf
     * @return a new Smartshelf with exactly those Items of this Smartshelf
     *  whose weight is less than or equal to the specified method parameter
     */
    public Smartshelf makeNewSmartshelfWith(int maxItemWeightInGrammes) {
        ArrayList<Item >oldItems = allItems;
        Smartshelf newItems = new Smartshelf();

        for (int i = 0; i < oldItems.size(); i++) {
            if( maxItemWeightInGrammes >= oldItems.get(i).getWeightInGrammes()){
                newItems.add(oldItems.get(i));
            }

        }


        return newItems;
    }

    /**
     * Returns a string representation of this Smartshelf. The string
     * representation consists of a list of the Smartshelf's contents,
     * enclosed in square brackets ("[]"). Adjacent Items are
     * separated by the characters ", " (comma and space). Items are
     * converted to strings as by their toString() method. The
     * representation does not mention any null references.
     *
     * So for
     *
     * Item i1 = new Item("Pen", 15);
     * Item i2 = new Item("Letter", 20);
     * Item i3 = null;
     * Item[] items = { i1, i2, i3, i1 };
     * Smartshelf k = new Smartshelf(items);
     *
     * the call k.toString() will return one of the three following Strings:
     *
     * "[(Pen, 15g), (Pen, 15g), (Letter, 20g)]"
     * "[(Pen, 15g), (Letter, 20g), (Pen, 15g)]"
     * "[(Letter, 20g), (Pen, 15g), (Pen, 15g)]"
     *
     * @return a String representation of this Smartshelf
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        return Arrays.toString(allItems.toArray());
    }

    /* class methods */

    /**
     * Class method to return a Smartshelf with the highest total weight from an
     * array of Smartshelfs. If we have an array with a Smartshelf of 3000 grammes
     * and a Smartshelf with 4000 grammes, the Smartshelf with 4000 grammes is
     * returned.
     *
     * Entries of the array may be null, and your method should work also in
     * the presence of such entries. So if in the above example we had an
     * additional third array entry null, the result would be exactly the same.
     *
     * If there are several Smartshelfs with the same weight, it is up to the
     * method implementation to choose one of them as the result (i.e., the
     * choice is implementation-specific, and method users should not rely on
     * any particular behaviour).
     *
     * @param Smartshelfs must not be null, but may contain null
     * @return one of the Smartshelfs with the highest total weight among all
     *  Smartshelfs in the parameter array; null if there is no non-null
     *  reference in Smartshelfs
     */
    public static Smartshelf heaviestSmartshelf(Smartshelf[] Smartshelfs) {

             for (Smartshelf shelf : Smartshelfs) {

                     System.out.println(shelf.toString());


             }






        return null;
    }
}
