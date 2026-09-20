package college.app;
import college.util.*;
import college.model.*;

import java.rmi.StubNotFoundException;
import java.util.Scanner;
public class Week7lab {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter your name : ");
        // String name = scan.nextLine();
        // String text = TextUtils.normalizeName(name);
        // System.out.println(text);
        Person[] pr = {
                        new Person(),
                        new Student("Himanshu"),
                        new Instructor("Rohan")
                        };
        pr[0].describerole();
        pr[1].describerole();
        pr[2].describerole();
        // pr[1].submitAssignment() this would cause the error because 
        // submitassignment is in the Student class but not in the
        // Student class,thus will cause the compile time issue
        // Instructor ins = (Instructor) pr[1]; (Will cause an runtime issue)
        if(pr[1] instanceof Student)
        {
            Student s = (Student) pr[1];
            try{
                s.setMark(150);
                System.out.println("The marks are valid");
            }
            catch(InvalidStudentDataException e)
            {
                System.out.println("Erro caught" + e.getMessage());
            }
            finally {
                System.out.println("Validation attempt complete");
            }
            
        }
        
    }
}
