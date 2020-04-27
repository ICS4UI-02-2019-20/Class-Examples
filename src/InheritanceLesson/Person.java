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
public class Person {
    private String name;
    
    public Person(String name){
        this.name = name;
    }
    
    public void introduceSelf(){
        System.out.println("Hello. My name is " + this.name);
    }
    
    public String getName(){
        return this.name;
    }
}
