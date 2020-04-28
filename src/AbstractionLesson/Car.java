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
public class Car extends Vehicle implements CruiseControl{
    
    private int year;
    private String make;
    
    public Car(int year, String make, String model){
        super(model);
        this.year = year;
        this.make = make;
            
        
    }
    


    @Override
    public void moveForward() {
        System.out.println("driving forward");
        
    }

    @Override
    public void setSpeed(int speed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void engage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void disengage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
