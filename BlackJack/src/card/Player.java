package card;
import java.util.Scanner;

/**
 * @author Jack Kasbeer
 * Assignment #6
 * The Player in BlackJack that is not a Dealer (the user)
 */
public class Player{
    private String name;
    private double bet;
    private double bank;
    private Hand myHand;
    
    private final static int STAND = 0;
    private final static int HIT = 1;
    private final static int DOUBLEDOWN = 2;
    
    /**
     * Creates a new Player with a blank name, an empty Hand,
     * a given account balance, and a starting bet of 0
     * @param bankRoll  amount of money to start with
     */
    public Player(double bankRoll){
        name = "";
        bet = 0.0;
        myHand = new Hand();
        bank = bankRoll;
    }
    
    /**
     * Mutator to make a new bet
     * @param b  bet value
     */
    public void placeBet(double b){
        bet = b;
    }
    
    /**
     * Mutator to change your bet (for doubling down)
     * @param betMultiplier  how much to change the bet by 
     * for the current hand
     */
    public void changeBet(double betMultiplier){
        bet *= betMultiplier;
    }
    
    /**
     * Mutator for the amount of money in the Player's 
     * bank account
     * @param betMultiplier  how much the bet is multiplied by and then
     * added to the bank
     */
    public void updateBank(double betMultiplier){
        bank += (bet * betMultiplier);
    }
    
    /**
     * Determines what the Player would like to do next
     * @return action  STAY = 0, HIT = 1, DOUBLEDOWN = 2;
     */
    public int nextAction(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like to hit(1), stay(2), or double down(3)?");
        int action = -1;
        try{ 
           action = reader.nextInt();
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Please input a valid integer.");
            action = nextAction();
        }
        if (action == 1){
            return HIT;
        }
        else if (action == 2){
            return STAND;
        }
        else if (action == 3){
            return DOUBLEDOWN;
        }
        else
            return -1;
    }
    
    /**
     * Player takes another Card and adds it to the Hand
     * @param c  next Card in the shoe
     */
    public void hit(Card c){
        myHand.addCard(c);
    }
    
    /**
     * Accessor for the current bet
     * @return bet  current bet
     */
    public double getBet(){
        return bet;
    }
    
    /**
     * Accessor for the Player's Hand
     * @return myHand  Player's Hand
     */
    public Hand getHand(){
        return myHand;
    }
    
    /**
     * Accessor for the current bank roll of the Player
     * @return bank  current bank roll
     */
    public double getBank(){
        return bank;
    }
}