public class RectangleModel 
{
    private double width;
    private double height;
    public RectangleModel()
    {
        this (1,1);
    }
    public RectangleModel(double a)
    {
            this(a,a);
        
    }
    public RectangleModel(double a,double b)
    {
        if(a>=0  && b>=0)
        {
            height =b;
            width =a ;
        }
    }
   
    public String toString() 
  {
        return "RectangleModel [width=" + width + ", height=" + height + ", Area=" + getArea() + "]";
    }
    public double getArea()
    {
        return width*height;
    }
    public double getPerimeter()
    {
        return width*height;
    }
    public boolean isSquare()
    {
        return (width==height)?(true):( false);
    }
    public void scale(double factor)
    {
        width = width*factor;
        height = height*factor;
    }
    
}
