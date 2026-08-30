public class StudentDriver 
{
    public static void main(String[] args) throws Exception 
  {
        StudentRecord first = new StudentRecord("First","258",85);
        StudentRecord second = new StudentRecord("Second","56",100);
        StudentRecord third = new StudentRecord("Third","56",96);
        StudentRecord fourth = new StudentRecord("Fourth","96",63);
        first.setMarks(49);
        second.setMarks(79);
        third.setMarks(80);
        fourth.setMarks(50);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
