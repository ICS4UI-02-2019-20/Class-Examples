/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceLesson;

/**
 *
 * @author lamon
 */
public class Teacher extends Person {
    
    private String homeroom;
    
    public Teacher(String name, String homeroom){
        super(name);
        this.homeroom = homeroom;
    }
    
    public String getHomeroom(){
        return this.homeroom;
    }
    
    @Override
    public void introduceSelf(){
        System.out.println("Hi. My name is " + this.getName() + ". I am a teacher");
    }
}
