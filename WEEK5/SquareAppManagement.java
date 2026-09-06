abstract public class Shape
{
    
    private String colour;
    abstract double perimeter();
    abstract double area();
    Shape(String colour)
    {
        this.colour = colour;
    }
    void setcolour(String colour)
    {
        this.colour = colour;
    }
    String getcolour()
    {
        return colour;
    }
    
    @Override
    public String toString()
    {
    return "Area : " + area()
         + "\nPerimeter : " + perimeter()
         + "\nColour : " + getcolour(); 
    }
}
class Square extends Shape
{
    private double side;

    //Constructors
    Square(double side,String colour)
    {
        super(colour);
        if(side>0)
        this.side =side;
    }
    Square()
    {
        super("Unknown");
        this.side = 0;
    }
    //Setters
    void setSide(double side)
    {
        if(side>0)
        this.side = side;
    }

    //Methods
    
    double perimeter()
    {
        return (4*side);
    }
    
    double area()
    {
        return (side*side);
    }
    
}
class Rectangle extends  Shape
{
    private double length;
    private double breadth;

    //Constructors
    Rectangle(double length,double breadth,String colour)
    {
        super(colour);
        if(length>0 && breadth>0)
        {

            this.length = length;
            this.breadth = breadth;
        }
    }
    Rectangle(double length,String colour)
    {
        super(colour);
        if(length>0)
        {

            this.length = length;
            this.breadth =0;
        }
    }
    Rectangle()
    {
        super("Unknown");
        this.length=0;
        this.breadth=0;
    }

    //setters
    void setlength(double length)
    {
        if(length>0)
        this.length = length;
    }
    void setbreadth(double breadth)
    {
        if(breadth>0)
        this.breadth = breadth;
    }

    //Methods
   
    double area()
    {
        return  length*breadth;
    }
    @Override
    double perimeter()
    {
        return (2*(length+breadth));
    }
}
class Circle extends Shape
{
    private double radius;
    
    //Constuctor
    Circle(double radius,String colour)
    {
        super(colour);
        if(radius>0)
        this.radius = radius;
    }
    Circle()
    {
        super("Red");
        this.radius =0;
    }

    //Setters
    void setradius(double radius)
    {
        if(radius>0)
        this.radius = radius;
    }

    //Methods
   
    double perimeter()
    {
        return (2*Math.PI*radius);
    }
  
    double area()
    {
        return (Math.PI*radius*radius);
    }

}




