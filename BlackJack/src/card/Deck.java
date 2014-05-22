package card;
import java.util.ArrayList;


/**
 * @author Jack Kasbeer
 * Assignment #3
 * Creates a full deck of 52 Cards (4 of each Card Ace-King)
 */
public class Deck{
    private ArrayList<Card> cards;
    
    /**
     * Constructs a Deck of 52 Cards by filling
     * the cards ArrayList<Card>
     */
    public Deck(){
        cards = new ArrayList<Card>();
        String suit = "";
        String rank = "";
        int numericValue = 0;
        for (int i = 0; i <=3; i++){
            if (i == 0)
                suit = "Spades";
            else if (i == 1)
                suit = "Hearts";
            else if (i == 2)
                suit = "Clubs";
            else if (i == 3)
                suit = "Diamonds";
            else 
                suit = "ERROR";
            for (int j = 2; j <= 14; j++){
                if (j < 10){
                    if (j == 2)
                        rank = "Two";
                    else if (j == 3)
                        rank = "Three";
                    else if (j == 4)
                        rank = "Four";
                    else if (j == 5)
                        rank = "Five";
                    else if (j == 6)
                        rank = "Six";
                    else if (j == 7)
                        rank = "Seven";
                    else if (j == 8)
                        rank = "Eight";
                    else if (j == 9)
                        rank = "Nine";
                    else 
                        rank = "ERROR";
                    
                    cards.add(new Card(j,suit,rank));     
                }
                else if (j >= 10 && j <= 13){
                    if (j == 10)
                        rank = "Ten";
                    else if (j == 11)
                        rank = "Jack";
                    else if (j == 12)
                        rank = "Queen";
                    else if (j == 13)
                        rank = "King";
                    else 
                        rank = "ERROR";
                    
                    cards.add(new Card(10,suit,rank));
                }
                else if (j == 14){
                    rank = "Ace";
                    cards.add(new Card(11,suit,rank));
                }
                    
            }
        }
    }
    /**
     * Accessor for a given Card in the Deck
     * Precondition: Deck contains cards
     * @return card  parameterized Card you're searching for
     */
    public Card getCard(int cardNumberPosition){
        if (!cards.isEmpty())
            return cards.get(cardNumberPosition);
        else
            return null;
    }
    
    public int getNumberOfCards(){
        return cards.size();
    }
    
    /**
     * Displays the full Deck of 52 Cards with the 
     * Card toString()
     * @return d  every Card in the Deck
     */
    @Override
    public String toString(){
        String d = cards.toString();
        return d;
    }
}