/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class MyArrayList {
    
    // this is an array that I will use to store our number
    // we will need to expand this if we run out of room!
    private int[] numbers;
    
    // We need to keep track of how many items are stored
    // remember, our array isn't always full!
    private int numItems;
    
    /**
     * Creates an empty array list: This is the constructor
     */
    public MyArrayList(){
        // initialize the array with 10 spots
        this.numbers = new int[10];
        // we have nothing stored to start
        this.numItems = 0;
    }
    
    
    /**
     * Adds a new item to the end of the list
     * @param value the number to add to the end of the list 
     */
    public void add(int value){
        // is there room in our array to put the item?
        // we can check how many items vs our length
        if(this.numItems == this.numbers.length){
            // no room so we need to make the array bigger... by making a new array!
            // we will make the array double the size it was
            int newSize = this.numbers.length * 2;
            int[] newArray = new int[newSize];
            
            // copy everything using a for loop
            for(int i = 0; i < this.numbers.length; i++){
                newArray[i] = this.numbers[i];
            }
            
            // set the tracked array to be the new array
            this.numbers = newArray;
        }
        
        // we have room so add the new item to the end of the array
        // because arrays index starting at 0, numItems is ALWAYS the first empty spot
        this.numbers[this.numItems] = value;
        // increase the number of items
        this.numItems++;
    }
    
    
    /**
     * Puts a new item into the array at a given location
     * @param index where do you want the value put
     * @param value the number you are putting into the list
     */
    public void add(int index, int value){
        // is there room in our array to put the item?
        // we can check how many items vs our length
        if(this.numItems == this.numbers.length){
            // no room so we need to make the array bigger... by making a new array!
            // we will make the array double the size it was
            int newSize = this.numbers.length * 2;
            int[] newArray = new int[newSize];
            
            // copy everything using a for loop
            for(int i = 0; i < this.numbers.length; i++){
                newArray[i] = this.numbers[i];
            }
            
            // set the tracked array to be the new array
            this.numbers = newArray;
        }
        
        // if we are not at the end of the array, we need to shuffle things down
        // starting at the end, we will move everything down one spot until we get there
        // because arrays index starting at 0, numItems is ALWAYS the first empty spot
        for(int i = this.numItems; i > index; i--){
            this.numbers[i] = this.numbers[i-1];
        }
        
        // we have room so add the new item to the end of the array
        this.numbers[index] = value;
        // increase the number of items
        this.numItems++;
    }
    
    
    /**
     * Removes an item at a given index and gives to to the user
     * @param index the index you wish to remove an item from
     * @return the number that is removed from the list
     */
    public int remove(int index) throws Exception{
        // is it in a valid position?
        if(index < this.numItems){
            // store the value we will need to return
            int number = this.numbers[index];
            // shuffle everything down so we don't leave an empty spot
            for(int i = index; i < this.numItems; i++){
                this.numbers[i] = this.numbers[i+1];
            }
            // decrease the number of items
            this.numItems--;
            // give the value back
            return number;
        }else{
            // not a valid position, so I will throw an error
            throw new Exception("Index out of bounds excepetion");
        }
    }
    
    /**
     * Returns the value from the location specified
     * @param index the index you would like the value from
     * @return the value at the given index
     */
    public int get(int index){
        // return the value from the array
        return this.numbers[index];
    }
    
    
    /**
     * Returns the index of a given value. If none are found, returns -1
     * @param value the value you are looking for in the list
     * @return the index of the item if it exists. -1 if not found
     */
    public int indexOf(int value){
        // go through each element trying to find it
        for(int i = 0; i < this.numItems; i++){
            // see if it is the value we are looking for
            if(this.numbers[i] == value){
                // let them know where it is
                return i;
            }
        }
        // we have gone through and haven't found it
        return -1;
    }
    
    /**
     * Returns the size of the list
     * @return the number of items in the list
     */
    public int size(){
        return this.numItems;
    }
    
}
