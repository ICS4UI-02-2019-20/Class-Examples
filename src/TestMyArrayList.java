/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class TestMyArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // create a blank list
        MyArrayList list = new MyArrayList();
        // add a few items to the end
        list.add(7);
        list.add(13);
        list.add(-152);
        // should print out 7, 13, -152 in that order
        for(int i = 0; i < list.size(); i++){
            int number = list.get(i);
            System.out.println(number);
        }
        
        // remove index 1 - the 13
        int removed = list.remove(1);
        System.out.println("removed: " + removed);
        
        // print out the list to ensure it is correctly removed
        for(int i = 0; i < list.size(); i++){
            int number = list.get(i);
            System.out.println(number);
        }
        
        // add something back in to position 1
        list.add(1, 13);
        // print out the list to ensure it is correctly added: 7, 13, -152
        for(int i = 0; i < list.size(); i++){
            int number = list.get(i);
            System.out.println(number);
        }
    }
    
}
