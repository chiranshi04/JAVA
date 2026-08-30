public class CourseEnrollment
{
    private String code;
    private String title;
    private int capacity;
    private int enrolled_count=0;
    public CourseEnrollment()
    {
        this("XXX","NoTitle",0,0);
    }
    public CourseEnrollment(String code,int capacity)
    {
        this(code,"NoTitle",capacity,0);
    }
    public CourseEnrollment(String code,String title,int capacity,int enrolled_count)
    {
        this.code = code;
        this.title = title;
        this.capacity = capacity;
        this.enrolled_count = enrolled_count;
    }
    public boolean enroll()
    {
        if ((capacity-enrolled_count)>=1)
        {
            enrolled_count++;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean withdraw()
    {
        enrolled_count--;
        return true;
    }
    public boolean isFull()
    {
        if(enrolled_count == capacity)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public int getAvailableSeats()
    {
        return (enrolled_count-capacity);
    }
    @Override
    public String toString()
    {
        return "Code : "+code+'\n'+"Title : "+title+"Capacity : "+capacity+'\n'+"Enrolled count : "+enrolled_count;
    }
}
