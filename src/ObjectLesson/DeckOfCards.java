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
public class DeckOfCards {

    private int numCards;
    private Card[] cards;

    public DeckOfCards() {
        // set the number of cards
        this.numCards = 52;
        // initialize the array
        this.cards = new Card[this.numCards];

        // go through all cards
        for (int i = 0; i < this.numCards; i++) {
            // calculate the suit
            int suit = i / 13;
            // calculate rank
            int rank = (i % 13) + 1;
            // make a card and put it in the deck
            Card c = new Card(rank, suit);
            this.cards[i] = c;
        }

    }
    
    // deal out a card
    public Card dealCard() {
        // get the top card in the deck
        Card c = this.cards[this.numCards - 1];
        // decrease the number of cards
        this.numCards = this.numCards - 1;
        // give it out
        return c;
    }
    
    // ask how many cards are left
    public int numCardsLefts(){
        return this.numCards;
    }
    
    // shuffle the deck
    public void shuffle(){
      //go through each card
      for(int i = 0; i < this.numCards; i++){
          // get a random spot after this card
          // Math.random()*(max - min -1) + min
          int randSpot = (int)(Math.random()*(this.numCards - i - 1) + i);
          // swap the cards
          Card temp = this.cards[i];
          this.cards[i] = this.cards[randSpot];
          this.cards[randSpot] = temp;
      }
    }
}
