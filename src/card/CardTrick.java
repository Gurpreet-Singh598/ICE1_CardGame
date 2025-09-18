/** Modifier: Gurpreet Singh
* student number: 991811654
* date:17-09-2025

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package card;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then searches the array of cards for a hard-coded lucky card.
 * To be used as starting code in ICE 1
 * 
 * Modifier: Your Name
 * Student Number: XXXXXXX
 * Date Modified: 2025-09-18
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        // Step 1: create a magic hand of 7 cards with random values
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);       // values 1–13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // suits from Card.SUITS
            magicHand[i] = c;
        }

        // Step 2: create a hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(2);       // <-- you can change this if you like
        luckyCard.setSuit("Clubs");  // <-- you can change this too

        // Step 3: check if luckyCard is in magicHand
        boolean luckyFound = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() && 
                c.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                luckyFound = true;
                break;
            }
        }

        // Step 4: print result
        if (luckyFound) {
            System.out.println("You WIN! The lucky card " 
                               + luckyCard.getValue() + " of " 
                               + luckyCard.getSuit() + " is in the magic hand.");
        } else {
            System.out.println("Sorry, you lose. The lucky card " 
                               + luckyCard.getValue() + " of " 
                               + luckyCard.getSuit() + " is NOT in the magic hand.");
        }
    }
}

    

