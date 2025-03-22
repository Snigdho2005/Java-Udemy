class Cylinder
{
    private double radius;
    private double height;

    public Cylinder()
    {
        radius=1;
        height=1;
    }
    public Cylinder(double r)
    {
        setRadius(r);
        height=1;
    }
    public Cylinder(double r,double h)
    {
        setRadius(r);
        setHeight(h);
    }
    public double getRadius()
    {
        return radius;
    }
    public double getHeight()
    {
        return height;
    }
    public void setRadius(double r)
    {
        if(r>=0)
        {
            radius=r;
        }
        else
        {
            radius=0;
        }
    }
    public void setHeight(double h)
    {
        if(h>=0)
        {
            height=h;
        }
        else
        {
            height=0;
        }
    }
    public void setDimensions(double r,double h)
    {
        setRadius(r);
        setHeight(h);
    }
    public double Volume()
    {
        return Math.PI*radius*radius*height;
    }
    public double TotalSurfaceArea()
    {
        return 2*Math.PI*radius*(radius+height);
    }
}
public class CylinderConstructor
{
    public static void main(String[] args)
    {
       Cylinder c=new Cylinder();
       Cylinder c1=new Cylinder(10);
       Cylinder c2=new Cylinder(10,5);

       System.out.println("Volume of C: "+c.Volume());
       System.out.println("Total Surface Area of C: "+c.TotalSurfaceArea());
   
       System.out.println("Volume of C1: "+c1.Volume());
       System.out.println("Total Surface Area of C1: "+c1.TotalSurfaceArea());

       System.out.println("Volume of C2: "+c2.Volume());
       System.out.println("Total Surface Area of C2: "+c2.TotalSurfaceArea());

    }

}