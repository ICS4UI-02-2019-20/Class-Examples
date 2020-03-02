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
public class Card {
    // class variables/instance variables
    private int rank;
    private int suit;
    private boolean isFaceUp;
    
    // Constructor:
    // a method used to create an instance of the class
    // and set its class variables
    public Card(int rank, int suit){
        // initiallize all of the variables
        this.rank = rank;
        this.suit = suit;
        this.isFaceUp = false;
    }
    
    // Mutator method / setters:
    // a method that makes changes to the class variables
    
    // flip the card 
    public void flipCard(){
        // if it is already up, make it down and vice-a-versa
        if(this.isFaceUp){
           this.isFaceUp = false; 
        }else{
            this.isFaceUp = true;
        }
    }
    // accessor methods / getters:
    // used to get access to the value of a class variable
    public int getRank(){
        return this.rank;
    }
    
    public int getSuit(){
        return this.suit;
    }
    
    public boolean isFaceUp(){
        return this.isFaceUp;
    }
}
