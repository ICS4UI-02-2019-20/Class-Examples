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
public class TestPeopl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("Dave");
        p.introduceSelf();
        
        Student s = new Student("Steve", 11);
        System.out.println(s.getGrade());
        s.introduceSelf();
        
        Teacher t = new Teacher("Lamont", "2703");
        System.out.println(t.getHomeroom());
        t.introduceSelf();
        
        System.out.println("");
        System.out.println("");
        
        // polymorphism 
        Person[] people = new Person[3];
        people[0] = p;
        people[1] = s;
        people[2] = t;
        
        for(int i = 0; i < people.length; i++){
            people[i].introduceSelf();
            
            // check if this person is actually a Student
            if(people[i] instanceof Student){
                // cast them back as a student
                Student tempStudent = (Student)people[i];
                System.out.println("Grade: " + tempStudent.getGrade());
            }
            
        }
    }
    
}
