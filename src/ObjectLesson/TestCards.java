/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectLesson;

/**
 *
 * @author lamon
 */
public class TestCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 0 - Clubs
        // 1 - Diamonds
        // 2 - Hearts
        // 3 - Spades
        
        // 7 of hearts
        Card c1 = new Card(7, 2);
        // 3 of spades
        Card c2 = new Card(3,3);
        
        System.out.println(c1.isFaceUp());
        System.out.println(c2.isFaceUp());
        c1.flipCard();
        System.out.println(c1.isFaceUp());
        System.out.println(c2.isFaceUp());
        System.out.println("");
        System.out.println("");
        DeckOfCards d1 = new DeckOfCards();
        DeckOfCards d2 = new DeckOfCards();
        d2.shuffle();
        // burn first card
        d1.dealCard();
        d2.dealCard();
        // grab card 2
        Card card1 = d1.dealCard();
        Card card2 = d2.dealCard();
        System.out.println("Rank: C1 - " + card1.getRank());
        System.out.println("Rank: C2 - " + card2.getRank());
    }
    
}
