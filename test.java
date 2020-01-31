import java.util.ArrayList;
public class test {
    public static void main(String [] args){
        Deck master = new Deck();
        Deck player1 = new Deck();
        Deck player2 = new Deck();
        master.generateDeck();
        master.shuffle();
        master.deal( player1 , player2 );



    }
}
