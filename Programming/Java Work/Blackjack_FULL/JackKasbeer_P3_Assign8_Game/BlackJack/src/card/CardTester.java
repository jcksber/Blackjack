package card;
/**
 * @author Jack Kasbeer
 * Tests the Card object sufficiently
 * Assignment #2
 */
public class CardTester{
    public static void main(String[] args){
        Card c = new Card(8,"clubs","eight");
        Card c2 = new Card(10,"hearts","jack");
        System.out.println(c);
        System.out.println(c2);
        
        Card c3 = new Card(1,"spades","ace");
        System.out.println(c3);
        
        c3.changeAceValue(true);
        System.out.println(c3);
        
        Card ace = new Card(11,"diamonds","ace");
        System.out.println(ace);
        
        ace.changeAceValue(false);
        System.out.println(ace);
    }
}