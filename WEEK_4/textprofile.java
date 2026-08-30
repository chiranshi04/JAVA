public class TextProfile
{
    private String name;
    private int age;
    private double height;
    public TextProfile(String name, int age,double height)
    {
        if (name==null)
        {
            System.out.println("Name cant be null");
            return;
        }
        else if (age<=0)
        {
            System.out.println("Age cant be this");
            return;
        }
        else if (height<=0)
        {
            System.out.println("Height cant be this");
            return;
        }
        else
        {
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "TextProfile [name=" + name + ", age=" + age + ", height=" + height + "]";
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
