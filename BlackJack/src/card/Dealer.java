package card;
import java.util.Scanner;
/**
 * @author Jack Kasbeer
 * Assignment #6
 * Dealer is the driving factor behind dealing with
 * Hands
 */
public class Dealer{
    private Player player;
    private Shoe shoe;
    private Hand dealerHand;
    
    private final static int STAND = 0;
    private final static int HIT = 1;
    private final static int DOUBLEDOWN = 2;
    
    /**
     * Constructs a Dealer with a Shoe, a Hand, and a Player
     * Also shuffles the Shoe 7 times
     * @param p  new Player to play against
     */
    public Dealer(Player p){
        shoe = new Shoe(4);
        for (i = 0; i < 8; i++){
            shoe.shuffle();
        }
        dealerHand = new Hand();
        player = p;
    }
    
    /**
     * Accessor for the Dealer's Hand
     * @return dealerHand  the Cards in the Dealer's Hand
     */
    public Hand getDealerCards(){
        return dealerHand;
    }
    
    /**
     * Dealer deals an additional Card to the Player
     */
    public void hit(){
        player.hit(shoe.getNextCard());
    }
    
    /**
     * where does the dealer hit?
     * Dealer deals himself an additional Card
     */
    private void dealerHit(){
        dealerHand.addCard(shoe.getNextCard());
    }
    
    /**
     * Plays out the Dealer's Hand until he has 
     * a value of at least 17
     */
    public void playDealerHand(){
        while (dealerHand.getValue() < 17){
            checkForDealerBust();
            dealerHit();
        }
    }
    
    /**
     * Deals a Card to the Player, then to the Dealer,
     * then to the Player, then to the Dealer
     */
    public void start(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please place a bet:");
        double currentBet = 0.0;
        try {
            currentBet = in.nextDouble();
            if (currentBet > player.getBank()){
                System.out.println("Insufficient funds for this bet.");
                start();
                return;
            }
            else if (currentBet < 0){
                System.out.println("Cannot place a negative bet.");
                start();
                return;
            }
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Please input a valid number.");
            start();
            return;
        }
        
        player.placeBet(currentBet);
        
        hit();
        hit();
        dealerHit();
        dealerHit();
        
        System.out.println("Dealer is showing:\n" + dealerHand.get(0));
        System.out.println("\n" + "Your Cards:\n" + player.getHand());
        
        checkForBlackJack();
        
        evaluateWinner();
    }
    
    /**
     * Method to determine if the user would like to play again
     */
    public void playAgain(){
        System.out.println("Would you like to play again? 1 for YES, 2 for NO.");
        Scanner play = new Scanner(System.in);
        int again = 0;
        try{
            again = play.nextInt();
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Please input a valid integer.\n");
            playAgain();
            return;
        }
        
        if (again == 1){
            player.getHand().emptyHand();
            dealerHand.emptyHand();
            start();
        }
        else if (again == 2){
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
        else{
            System.out.println("Please enter a valid integer.\n");
            playAgain();
        }
    }
    
    /**
     * Checks to see if either the Dealer or the Player has BlackJack
     */
    public void checkForBlackJack(){
        if (player.getHand().hasBlackJack()){
           
           System.out.println("You have BlackJack!\n");
           player.updateBank(1.5);
           System.out.println("Your current bank roll: " + player.getBank());
           
           playAgain();
           
       }
       else if (dealerHand.hasBlackJack()){
           
           System.out.println("Dealer has BlackJack!\n");
           player.updateBank(-1);
           System.out.println("Your current bank roll: " + player.getBank());
           
           playAgain();
       }
    }
    
    /**
     * Checks to see if Player has a Busted Hand
     */
    public void checkForBust(){
        if (player.getHand().isBust()){
            player.updateBank(-1);
            System.out.println("Bust!\n");
            System.out.println("Your current bank roll: " + player.getBank());
            playAgain();
        }
    }
    
    /**
     * Checks for a Dealer bust
     */
    public void checkForDealerBust(){
        if (dealerHand.getValue() > 21){
            player.updateBank(1);
            System.out.println("Dealer Bust!\n");
            System.out.println("Your current bank roll: " + player.getBank());
            playAgain();
        }
    }
    
    /**
     * Checks to see if a Hand has a Five Card Charlie
     */
    public void checkForFiveCardCharlie(){
        if (player.getHand().hasFiveCardCharlie()){
            player.updateBank(1);
            System.out.println("Five Card Charlie\nYou win!");
            System.out.println("Your current bank roll: " + player.getBank());
            
            playAgain();
        }
    }
    
    /**
     * Checks for a standard win or loss based solely on value
     * of the Hand (if no one has BlackJack, a FFC, or is busted)
     */
    public void checkForStandardWin(){
        if (player.getHand().getValue() > dealerHand.getValue() && player.getHand().getValue() <= 21){
            player.updateBank(1);
            System.out.println("You win!\n");
            System.out.println("Your current bank roll: " + player.getBank());
               
            playAgain();
        }
        else if (player.getHand().getValue() < dealerHand.getValue() && dealerHand.getValue() <= 21){
            player.updateBank(-1);
            System.out.println("Dealer wins!\n");
            System.out.println("Your current bank roll: " + player.getBank());
               
            playAgain();
        }
    }
    
    /**
     * Checks to see if the Player or Dealer has 21
     */
    public void checkFor21(){
        if (player.getHand().hasTwentyOne()){
            player.updateBank(1);
            System.out.println("You win!\n");
            System.out.println("Your current bank roll: " + player.getBank());
            
            playAgain();
        }
        else if (dealerHand.hasTwentyOne()){
            player.updateBank(-1);
            System.out.println("Dealer wins!\n");
            System.out.println("Your current bank roll: " + player.getBank());
            
            playAgain();
        }
    }
    
    /**
     * Evaluates the winner of the hand
     */
    public void evaluateWinner(){
        int action = player.nextAction();
           
        while (action != STAND && (player.getHand().isBust() == false)){
            if (action == HIT){
                 hit();
                   
                 System.out.println("YOUR HAND: \n" + player.getHand());
                 
                 checkForBust();
                 evaluateWinner();
                 return;
            }
            else if (action == DOUBLEDOWN && player.getHand().getNumberOfCards() == 2){
                hit();
                playDealerHand();
                player.changeBet(2);
                if (player.getHand().getValue() > dealerHand.getValue() && player.getHand().isBust() == false){
                    player.updateBank(1);
                       
                    System.out.println("YOUR HAND:\n" + player.getHand());
                    System.out.println("DEALER'S HAND:\n" + dealerHand);
                       
                    System.out.println("You win!\n");
                    System.out.println("Your current bank roll: " + player.getBank());
                       
                    playAgain();
                    return;
                }
                else{
                    player.updateBank(-1);
                       
                    System.out.println("YOUR HAND:\n" + player.getHand());
                    System.out.println("\nDEALER'S HAND:\n" + dealerHand);
                       
                    System.out.println("Dealer wins!\n");
                    System.out.println("Your current bank roll: " + player.getBank());
                       
                    playAgain();
                    return;
                }
            }
            else
                System.out.println("Cannot double down."); evaluateWinner(); 
        }
        playDealerHand(); 
        dealerHand.getValue();
        System.out.println("YOUR HAND:\n" + player.getHand());
        System.out.println("DEALER'S HAND:\n" + dealerHand);
           
        checkForBust();
        checkFor21();
        checkForFiveCardCharlie();
        checkForStandardWin();
        checkForDealerBust();
    }
}