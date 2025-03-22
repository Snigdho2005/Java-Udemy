class Rectangle
{
    int length;
    int breadth;
    int x = 10;

    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    void display()
    {
        System.out.println("Length :"+this.length);
        System.out.println("Breadth :"+this.breadth);
    }
}

class Cuboid extends Rectangle
{
    int height;
    int x = 20;

    Cuboid(int length, int breadth, int height)
    {
        super(length, breadth);
        this.height = height;
    }

    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class ThisSuper {
    public static void main(String[] args)
    {
        /* 
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(30, 40);
        r1.display();
        r2.display();
        */
        
        Cuboid c1 = new Cuboid(10, 20, 30);
        c1.display();

    }
}
