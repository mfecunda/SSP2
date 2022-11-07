package one;

/**
 * A Card object has a name and a few methods to get the name
 * and format the card.  It never expires.
 */
public class Card {
    /** Name of this card. Potentially null. */
    private String name;

    /**
     * Constructs a Card object with empty string name.
     */
    public Card() {
        this.name = "";
    }

    /**
     * Constructs a Card object with given name
     *
     * @param name1 the given name
     */
    public Card(String name1) {
        this.name = name1;
    }

    /**
     * Accessor method for the name
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Tests whether the card is expired.
     *
     * @return false, since this type of card is never expired
     */
    public boolean isExpired() {
        return false;
    }

    /**
     * Gives a String format for the card
     *
     * @return the formatted String representing this card
     */
    public String format() {
        return "Name: " + this.name;
    }

    /**
     * Returns a String representation of instance variables
     * Note the fancy way of getting the name of the class.  Here
     * we know the class name is Card, but when subclasses run this
     * method we want the subclass name.
     *
     * @return string denoting the object
     */
    @Override
    public String toString() {
        return this.getClass().getName() + "[name = " + this.name + "]";
    }

    /**
     * Returns true if two cards have the same name and class.
     * Returns false if one card is null or not same class.
     * Note the fancy way of checking the name of the class.  Here
     * we know that the class is Card, but when subclasses run this
     * method we want the subclass.
     *
     * @return true if the two objects are same type and have same
     * instance variable values
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) { return false; }
        if (!this.getClass().equals(other.getClass())) { return false; }
        Card card = (Card) other;
        return this.name.equals(card.name);
    }
}
