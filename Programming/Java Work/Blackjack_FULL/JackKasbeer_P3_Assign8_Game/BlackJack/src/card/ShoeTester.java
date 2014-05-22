package card;
/**
 * @author Jack Kasbeer
 * Assignment #4
 * Tests the methods of the Shoe
 */
public class ShoeTester{
    public static void main(String[] args){
        Shoe s = new Shoe();
        Deck d = new Deck();
        s.addDeck(d);
        s.shuffle();
        //System.out.println(s);
        //Shuffles randomly-- check
        
        Deck d2 = new Deck();
        s.addDeck(d2);
        //System.out.println(s);
        //Displays two decks-- check
        
        Shoe shoe = new Shoe(4);
        shoe.shuffle();
        //System.out.println(shoe);
        //Displays a shuffled 4 deck shoe-- check
        
        shoe.reset();
        //System.out.println(shoe);
        //Resets the shoe-- check
        
        s.addDecks(2);
        System.out.println(s);
    }
}