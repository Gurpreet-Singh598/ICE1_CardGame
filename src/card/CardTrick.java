/** Modifier: Gurpreet Singh
* student number: 991811654
* date:17-09-2025

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package card;

import java.util.Random;
import java.util.Scanner;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
       Card[] magicHand = new Card[7];
       Random rand = new Random();

for (int i = 0; i < magicHand.length; i++) 
{
    Card c = new Card();
    c.setValue(rand.nextInt(13) + 1);       // 1–13
    c.setSuit(Card.SUITS[rand.nextInt(4)]); // 0-3
    magicHand[i] = c;
}
        
        // Ask user to pick a card
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = input.nextInt();
        System.out.print("Enter a card suit (Clubs, Diamonds, Hearts, Spades): ");
        String userSuit = input.next();

        boolean found = false;
        
        // user's card in magicHand
        for (Card c : magicHand) {
            if (c.getValue() == userValue && c.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("You win Your card is in the magic hand");
        } else {
            System.out.println(" your card is not in the magic hand.");
        }
        
        // Lucky card 
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        
        // Check lucky card is in magic hand
        boolean luckyFound = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())) {
                luckyFound = true;
                break;
            }
        }
        
        if (luckyFound) {
            System.out.println("Lucky card is in the magic hand!");
        } else {
            System.out.println("Lucky card is NOT in the magic hand.");
        }
    }
    
}
