public class StudentRecord
{
    private String name;
    private String studentId;
    private int mark;
    public StudentRecord(String a,String b,int d){
        name = a;
        studentId = b;
        if(d<100 && d>0){
            mark = d;
        }
    }
    String getname()
    {
        return name;
    }
    int getmarks()
    {
        return mark;
    }
    String getstudentID()
    {
        return studentId;
    }
    void setName(String name){
        this.name = name;
    }
    void setStudentID(String studentId){
        this.studentId = studentId;
    }
    boolean setMarks(int mark){
        if(mark<=100 && mark>=0){
            this.mark = mark;
            return true;
        }
        else{
            return false;
        }
    }
    boolean hasPassed()
    {
        if(mark>35)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    String getClassification()
    {
        if(mark>90)
        {
            return "A Grade";
        }
        else if(mark>80)
        {
            return "B Grade";
        }
        else if(mark>70)
        {
            return "C Grade";
        }
        else{
            return "D Grade";
        }
    }

    public String toString()
    {
        return "Student Details-> Name :"+name+'\n'+"Student ID : "+studentId;
    }
}
