package card;
import java.util.ArrayList;

/**
 * @author Jack Kasbeer
 * Assignment #5
 * A Hand is what each player/dealer holds while playing 
 * BlackJack.
 * It contains their Cards, which are dealt to them.
 */
public class Hand{
    private ArrayList<Card> hand;
    /**
     * Creates an empty Hand with a value of 0 
     */
    public Hand(){
        hand = new ArrayList<Card>();
    }
    
    /**
     * Gets the value of the Hand 
     * @return value  total value of the Hand
     */
    public int getValue(){
        int value = 0;
        if (hand.size() > 0){
            if (hand.get(0).getNumericValue() == 11){
                for (int i = 1; i < hand.size(); i++){
                    if (hand.get(i).getNumericValue() == 11)
                        hand.get(i).changeAceValue(false);
                }
            }
            
            else if (getRawValue() > 21){
                for (Card c : hand){
                    if (c.getNumericValue() == 11)
                        c.changeAceValue(false);
                }
            }
      
            for (Card c : hand){
                value += c.getNumericValue();
            }
        }
        else
            value = 0;
        return value;
    }
    
    /**
     * Accessor for the size of the hand ArrayList
     * @return  size of the ArrayList
     */
    public int getNumberOfCards(){
        return hand.size();
    }
    
    /**
     * Adds a Card to the hand
     * @param c  Card to be added
     */
    public void addCard(Card c){
        hand.add(c);
    }
    
    /**
     * Gets the parameterized Card within the Hand
     * @param i  position in the ArrayList of the Card (spot in deck - 1)
     * @return Card  the Card at position i
     */
    public Card get(int i){
        return hand.get(i);
    }
    
    /**
     * Empties the Hand of all Cards
     */
    public void emptyHand(){
        hand.clear();
    }
    
    /**
     * Tests to see if the Hand is busted (has a value that's > 21)
     * @return bust  true = busted; false = playable hand
     */
    public boolean isBust(){
        boolean bust = false;
        if (getValue() > 21)
            bust = true;
        else
            bust = false;
        return bust;
    }
    
    /**
     * Tests to see if the Hand has BlackJack (Ace + Card of value 10)
     * @return jack  true = has BlackJack; false = doesn't have BlackJack
     */
    public boolean hasBlackJack(){
        boolean jack = false;
        
        if (hand.size() == 2){
                if ((hand.get(0).getNumericValue() == 11 && hand.get(1).getNumericValue() == 10) 
                        || (hand.get(0).getNumericValue() == 10 && hand.get(1).getNumericValue() == 11)){
                    jack = true;
                }  
        }
        else 
            jack = false;
        return jack;     
    }
    
    /**
     * Tests to see if the Hand has a Five Card Charlie (5 cards with a sum that's 
     * less than 21)
     * @return charlie  true = has FCC; false = doesn't have FCC
     */
    public boolean hasFiveCardCharlie(){
        boolean charlie = false;
        if (getValue() <= 21 && getNumberOfCards() >= 5)
            charlie = true;
        else 
            charlie = false;
        return charlie;
    }
    
    /**
     * Tests to see if a Hand has a value of 21
     * @return twentyOne  true = has 21; false = doesn't have 21
     */
    public boolean hasTwentyOne(){
        boolean twentyOne = false;
        if (getValue() == 21)
            twentyOne = true;
        else
            twentyOne = false;
        return twentyOne;
    }
    
    /**
     * Gets the "raw" value of the Hand (ace = 11)
     * @return rawValue  the value of the Hand given that an Ace has value 11
     */
    private int getRawValue(){
        int rawValue = 0;
        for (Card c : hand){
            rawValue += c.getNumericValue();
        }
        return rawValue;
    }
    
    /**
     * Displays each Card in the Hand based on the Card toString()
     * @return h  String of Cards
     * @Override
     */
    public String toString(){
        String h = "";
        for (Card c : hand){
            h += c.toString();
        }
        return h;
    }
}