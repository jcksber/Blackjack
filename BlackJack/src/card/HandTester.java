package card;
/**
 * @author Jack Kasbeer
 * Assignment #5
 * Tests the methods in the Hand class
 */
public class HandTester{
    public static void main(String[] args){
        Hand h = new Hand();
        Hand h2 = new Hand();
        Hand h3 = new Hand();
        Hand h4 = new Hand();
        
        Card ace = new Card(11,"Spades","Ace");
        Card king = new Card(10,"Hearts","King");
        Card eight = new Card(8,"Clubs","Eight");
        Card ten = new Card(10,"Diamonds","Ten");
        Card five = new Card(5,"Spades","Five");
        
        h.addCard(ten);
        h.addCard(ace);
        h.addCard(eight);
        h.addCard(ace);
        
        System.out.println(h.getValue());
        
        //System.out.println(h);
        /*Prints: Rank: Ten
        Suit: Diamonds
        Numeric Value: 10

        Rank: Ace
        Suit: Spades
        Numeric Value: 11

        Rank: Eight
        Suit: Clubs
        Numeric Value: 8

        Rank: Ace
        Suit: Spades
        Numeric Value: 11
        * check
        */
        
        //System.out.println(h.getValue());
        //Prints 20-- check
        
        //System.out.println(h.getNumberOfCards());
        //Prints 4-- check
        
        h2.addCard(five);
        h2.addCard(eight);
        h2.addCard(king);
        //System.out.println(h2.getValue());
        //System.out.println(h2.isBust());
        //Prints 23 and true-- check
        
        //System.out.println(h2.hasBlackJack());
        //System.out.println(h2.hasFiveCardCharlie());
        //Prints false and false-- check
        
        h3.addCard(five);
        h3.addCard(five);
        h3.addCard(ace);
        h3.addCard(ace);
        h3.addCard(ace);
        
        //System.out.println(h3.hasFiveCardCharlie());
        //Prints true-- check
        
        h4.addCard(ace);
        h4.addCard(king);
        //System.out.println(h4.hasBlackJack());
        //Prints true-- check
        
    }
}