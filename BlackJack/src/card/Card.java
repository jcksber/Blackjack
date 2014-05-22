package card;

import java.awt.Image;

/**
 * @author Jack Kasbeer
 * Assignment #2
 * The most basic part of BlackJack, the Card
 * Class 
 */
public class Card{
    private int numericValue;
    private String suit;
    private String rank;
    private Image cardImage;
    
    /**
     * Creates a new Card object that has a 
     * numericValue of 0 and a blank suit and rank.
     */
    public Card(){
        numericValue = 0;
        suit = "";
        rank = "";
    }
   
    /**
     * Creates a new Card object that has more potential
     * than a blank Card object
     * @param value  integer value of a given Card
     * @param s  suit of the Card
     * @param r  rank of the Card
     */
    public Card(int value, String s, String r){
        numericValue = value;
        suit = s;
        rank = r;
    }
    
    /**
     * Accessor for numericValue
     * @return numericValue  integer value of the Card
     */
    public int getNumericValue(){
        return numericValue;
    }
    
    /**
     * Accessor for the suit
     * @return suit  the suit of the Card
     */
    public String getSuit(){
        return suit;
    }
    
    /**
     * Accessor for the rank
     * @return rank  the rank of the Card
     */
    public String getRank(){
        return rank;
    }
    
    /**
     * Accessor for the Image of the Card
     * @return cardImage  picture of the Card
     */
    public Image getImage(){
        return cardImage;
    }
    
    /**
     * Mutator to change the value of the Card if it's an Ace.
     * @param valueIsOne  whether or not the value of the current Card is one
     * @return true or false  changes the value of the Ace to 1 if true, 11 if false
     */
    public void changeAceValue(boolean valueIsOne){
        if (valueIsOne == true && getNumericValue() == 1){
            numericValue = 11;
        }
        else{
            if (getNumericValue() == 11)
                numericValue = 1;
        }
    }
      
    /**
     * Displays all necessary qualities of a Card:
     * Suit, Rank, and Numeric Value
     * @return c  String of qualities
     *@Override
     */
    public String toString(){
        String c =  "\nRank: " + getRank() + "\nSuit: " + getSuit()
                + "\nNumeric Value: " + getNumericValue() + "\n";
        return c;
    }
}