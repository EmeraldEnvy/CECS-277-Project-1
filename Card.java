public class Card {
    private String suit;
    private int value;

    /**
     * Default constructor for card
     * @param v value of card
     * @param s suit
     */
    public Card( int v , String s){
        suit = s;
        value = v;
    }

    /**
     * Get suit
     * @return suit
     */
    public String getSuit(){
        return suit;
    }

    /**
     * Get value
     * @return value
     */
    public int getValue(){
        return value;
    }

    /**
     * String representation of card
     * @return string
     */
    @Override
    public String toString(){
        if ( value == 1 ){
            return "Ace of " + suit;
        }
        if ( value == 11 ){
            return "Jack of " + suit;
        }
        if ( value == 12 ){
            return "Queen of " + suit;
        }
        if ( value == 13 ){
            return "King of " + suit;
        }
        else {
            return value + " of " + suit;
        }
    }
}
