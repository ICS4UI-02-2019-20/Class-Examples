/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractionLesson;

/**
 *
 * @author lamon
 */
public abstract class Vehicle {
    
    private String model;
    
    public Vehicle(String model){
        this.model = model;
    }
    
    public void honkHorn(){
        System.out.println("honk honk");
    }
    
    public abstract void moveForward();
    
}
