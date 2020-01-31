import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;
    public Deck( ){
        ArrayList<Card> d = new ArrayList<Card>();
        deck = d;
    }

    public void generateDeck(){
        for ( int i = 1 ; i <= 13 ; i++ ) {
            Card c1 = new Card(i, "Diamonds");
            deck.add(c1);
            Card c2 = new Card(i, "Hearts");
            deck.add(c2);
            Card c3 = new Card(i, "Spades");
            deck.add(c3);
            Card c4 = new Card(i, "Clubs");
            deck.add(c4);
        }
    }

    public void addCard( Card c ){
        deck.add( c );
    }

    public void shuffle(){
        Random rand = new Random();
        for ( int i = 0 ; i < 1000 ; i++ ){
            int index1 = rand.nextInt( 52 );
            int index2 = rand.nextInt( 52 );
            Card hold = deck.get( index1 );
            deck.set( index1 , deck.get( index2 ) );
            deck.set( index2 , hold );
        }
    }

    public int size(){
        return deck.size();
    }

    public void deal( Deck player1 , Deck player2 ){
        int size = deck.size();
        for ( int i = 0 ; i < size/2 ; i++ ){
            player1.addCard( deck.remove( 0 ) );
            player2.addCard( deck.remove( 0 ) );
        }
    }

    public String toString(){
        String string = "";
        for ( int i = 0 ; i < deck.size() ; i++ ){
            string = string + deck.get( i ) + " , ";
        }
        return string;
    }

}
