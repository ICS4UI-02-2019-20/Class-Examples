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
public class Student extends Person{
    
    private int grade;
    
    public Student(String name, int grade){
        // sends the name to the person class to deal with (calling the constructor for person)
        super(name);
        this.grade = grade;
    }
    
    public int getGrade(){
        return this.grade;
    }
    
}
