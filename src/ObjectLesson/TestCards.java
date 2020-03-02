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
    }
    
}
