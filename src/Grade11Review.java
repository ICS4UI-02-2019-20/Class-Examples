
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class Grade11Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Ask the user for their name
        System.out.println("Please enter your name");
        String userName = input.nextLine();
        // say hello to the user
        System.out.println("Hello " + userName);
        
        // Calculate the users age
        System.out.println("What year were you born");
        int birthYear = input.nextInt();
        // check for a valid year
        // loop if the year is less than 0 or greater than 2020
        while(birthYear < 0 || birthYear > 2020){
            // ask them again
            System.out.println("Please try again");
            birthYear = input.nextInt();
        }
        
        int age = 2020 - birthYear;
        // +  addition
        // -  subtraction
        // *  multiplication
        // /  division
        // %  modulo (remainder)
        System.out.println("You are " + age + " years old");
        
        // check if they can vote
        if(age >= 18){
            System.out.println("You can vote!");
        }else if(age < 18 && age > 12){
            System.out.println("You are a teenager");
        }else{
            System.out.println("You're just a baby");
        }
        
        
        // create an array to store 5 integers
        int[] favNumbers = new int[5];
        //get 5 numbers from the user
        System.out.println("Please input your 5 favourite integers");
        for(int i = 0; i < favNumbers.length; i = i + 1){
            favNumbers[i] = input.nextInt();
        }
        
    }
    
}
