/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** define card value and suits
 * 
 *
 * @author sivagamasrinivasan
 */
public class Card 
{
    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13
    
    public static final String [] SUITS = {"1: Hearts", "2: Diamonds", "3: Spades", "4: Clubs"};
    
   
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
   
    public String ToString(){
        return getValue() + "" + getSuit();
    }
   //number
    
    //method for suits
    
}
