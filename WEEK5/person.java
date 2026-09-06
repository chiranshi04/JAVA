public abstract class Person
{
    private String name;
    private int age;

public Person(String name, int age)
{
        this.name = name;
        this.age = age;
    }

    public String getName() 
{
        return name;
    }

    public int getAge()
{
        return age;
    }
    public abstract String getRole();
public String toString()
{
        return "Name: " + name + ", Age: " + age + ", Role: " + getRole();
    }   
}
 class Student extends Person
{
    private int[] grades;
    public Student(String name, int age, int[] grades)
{
        super(name, age);
        this.grades = grades;
    }
    public int[] getGrades() 
{
        return grades;
    }
    public String getRole()
{
        return "Student";
    }
}
 class Instructor extends Person{
    private String subject;
    public Instructor(String name, int age, String subject) 
{
        super(name, age);
        this.subject = subject;
    }
    public String getSubject()
{
        return subject;
    }
    public String getRole() 
{
        return "Instructor";
    }
}
