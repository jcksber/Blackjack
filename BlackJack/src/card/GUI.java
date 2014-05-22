package card;
import java.util.Scanner;

/**
 * @author Jack Kasbeer
 * @version 1.0
 * Graphical User Interface for BlackJack
 */
public class GUI{
    public static void main(String[] args){
        System.out.println("Welcome to Jack Kasbeer's BlackJack!");
        
        Scanner reader2 = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = "";
        try{
            name = reader2.nextLine();
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Please, give me your real name...\n");
            main(args);
            return;
        }
        System.out.println("Welcome to BlackJack, " + name + "!");
        Scanner reader = new Scanner(System.in);
        System.out.println("How much money would you like to start with?");
        double bank = reader.nextDouble();
        while (bank <= 0){
            System.out.println("Cannot start with this amount of money.");
        }
        
        Player player = new Player(bank);
        Dealer dealer = new Dealer(player);
        
        dealer.start();
    }
}