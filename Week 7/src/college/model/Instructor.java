package college.model;


public class Instructor extends Student{
    boolean conduct= false;
    @Override 
    public void describerole()
    {
        System.out.println("I am a Instructor");
    }
    public Instructor(String name)
    {
        super(name);
    }
    public boolean conductsClass()
    {
        conduct = true;
        return conduct;
    }
}
