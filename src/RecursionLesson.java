/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class RecursionLesson {

    // gives the sum of the elements of an array of a given length
    public static int arraySum(int[] a, int length){
        // base case: no more elements in the array
        if(length == 0){
            return 0;
        }else{
            // sum of the last element plus the sum of remaining elements
            return a[length-1] + arraySum(a,length-1);
        }
    }
    
    // factorial recursive solution
    public static int factorial(int n){
        // base case: 0! = 1
        if(n == 0){
            return 1;
        }else{
            // recusive call: n * fact(n-1)
            return n * factorial(n-1);
        }
    }
    
    // recursive Fibonacci Solution
    public static int fibRecursion(int n){
        // base case: n = 0 or 1  -> 1
        if(n == 0 || n == 1){
            return 1;
        }else{
            // recursive call: fib(n-1) + fib(n-2)
            return fibRecursion(n-1) + fibRecursion(n-2);
        }
    }
    
    // non-recursive Fibonacci Solution
    public static int fibLoop(int n){
        // make an array with 2 spots
        int[] nums = new int[2];
        // fill them with 1
        nums[0] = 1;
        nums[1] = 1;
        // calculate the numbers
        for(int i = 2; i <= n; i++){
            // clever use of mod to determine spot
            nums[i%2] = nums[0] + nums[1];
        }
        // give back the answer
        return nums[n%2];
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ans = fibLoop(55);
        System.out.println(ans);
    }
    
}
