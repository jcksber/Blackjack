package card;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Jack Kasbeer
 * Assignment #4
 * A holding mechanism for multiple decks 
 * (specific to BlackJack)
 */
public class Shoe{
    private ArrayList<Card> shoe;
    private int decks = 0;
    
    /**
     * Constructs a Shoe with an empty ArrayList
     * of Cards
     */
    public Shoe(){
        shoe = new ArrayList<Card>();
    }
    
    /**
     * Constructs a Shoe with a filled ArrayList
     * of Cards, which is determined by the number 
     * of Decks added by the parameter
     * @param numberOfDecks  number of Decks to add to the Shoe
     */
    public Shoe(int numberOfDecks){
        shoe = new ArrayList<Card>();
        decks += numberOfDecks;
        
        for (int i = 0; i < numberOfDecks; i++){
            Deck deck = new Deck();
            for (int j = 0; j < 52; j++){
                shoe.add(deck.getCard(j));
            }
        }
    }
    
    /**
     * Mutator to add a Deck to the existing Shoe
     * @param c  Deck to add
     */
    public void addDeck(Deck d){
        for (int i = 0; i < 52; i++){
            shoe.add(d.getCard(i));
        }
        decks++;
    }
    
    /**
     * Mutator to add a given number of Decks to
     * an existing Shoe
     * @param numberOfDecks  number of Decks to add 
     */
    public void addDecks(int numberOfDecks){
        for (int i = 0; i < numberOfDecks; i++){
            Deck deck = new Deck();
            for (int j = 0; j < 52; j++){
                shoe.add(deck.getCard(j));
            }
        }
        decks += numberOfDecks;
    }
    
    /**
     * Accessor for a certain Card number within
     * the Shoe
     * @param cardNumber  Card number in the Shoe that you wish to obtain
     * @return c  Card at the cardNumber position
     */
    public Card getCard(int cardNumber){
        Card c = shoe.get(cardNumber - 1);
        return c;
    }
    
    /**
     * Accessor for the top Card on the Shoe
     * @return c  the top Card of the Shoe
     */
    public Card getNextCard(){
        Card c = shoe.get(0);
        shoe.remove(0);
        return c;
    }
    
    /**
     * Shuffles the Cards in the Shoe randomly
     */
    public void shuffle(){
        ArrayList<Card> temp = new ArrayList<Card>();
        int shoeSizeFinal = decks * 52;
        
        for (int i = shoeSizeFinal; i > 0; i--){
            Random gen = new Random();
            int random = gen.nextInt(i);
            
            Card c = shoe.get(random);
            temp.add(c);
            shoe.remove(random);
        }
        shoe = temp;
    }
    
    /**
     * Resets the Shoe by creating a new one (old cards
     * added back in)
     */
    public void reset(){
        Shoe s = new Shoe(decks);
        shuffle();
    }
    
    /**
     * Displays every Card in the Shoe based on 
     * the Card toString() method
     * @return s  compilation of Shoe Cards
     * @Override
     */
    public String toString(){
        String s = shoe.toString() + "\n\n" + shoe.size();
        return s;
    }
}