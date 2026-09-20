package college.model;
import college.util.*;
public class Student extends Person{
    private  String name;
    private int mark;
    boolean issubmit = false;
    @Override 
    public void describerole()
    {
        System.out.println("I am a student");
    }
    public boolean submitAssignment()
    {
        issubmit = true;
        return issubmit;
    }
    public Student(String name)
    {
        this.name = TextUtils.normalizeName(name);
    }
    public void setMark(int mark) throws InvalidStudentDataException {

    if (mark < 0 || mark > 100) {
        throw new InvalidStudentDataException(
            "Mark must be between 0 and 100"
        );
    
    }
    this.mark = mark;
}
}
