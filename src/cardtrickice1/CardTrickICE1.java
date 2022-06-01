/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.*;
/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int value;
        String suit;
        boolean result = false;
        
        Scanner input = new Scanner(System.in);
        Card[] cardonhand =new Card[7];
        Random rn = new Random();
        Card ct = new Card();
        Card ucard = new Card();

        for(int i=0; i<cardonhand.length; i++){
            ct.setValue(rn.nextInt(13)+1);
            ct.setSuit(Card.SUITS[rn.nextInt(4)]);
            cardonhand[i] = ct;
        }

        System.out.println("Please choose the suit:");
        System.out.println(Arrays.toString(Card.SUITS));
        suit = input.next();
        ucard.setSuit(suit);

        System.out.println("Enter the value of the card between 1 to 13 :");
        value = input.nextInt();
        ucard.setValue(value);

        for(int i=0; i<cardonhand.length; i++){
            
            if(cardonhand[i].getValue() == ucard.getValue() && cardonhand[i].getSuit().equals(ucard.getSuit())){
                result = true;
                break;
            }
        }

        if(result == true){
            System.out.println("Match found!!");
        }else{
            System.out.println("Sorry match not found!!");
        } 
    }
    
}
