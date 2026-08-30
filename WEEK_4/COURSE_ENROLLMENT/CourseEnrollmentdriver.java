public class CourseEnrollmentdriver
{
    public static void main(String[] args) throws Exception 
{
        CourseEnrollment c1 = new CourseEnrollment();
        System.out.println(c1.enroll());
        System.out.println(c1.getAvailableSeats());
        System.out.println(c1.withdraw());
    }
}
