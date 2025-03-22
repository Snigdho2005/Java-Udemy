/*
class Outer
{
    public void display()
    {
        class Inner
        {
            public void show()
            {
                System.out.println("Hello");
            }
        }

        Inner i = new Inner();
        i.show();
        // new Inner().show();
    }
}
*/

abstract class My
{
    abstract public void show();
}

class Outer
{
    public void display()
    {
        My m = new My()
        {
            public void show()
            {
                System.out.println("Hello");
            }
        };
        m.show();
    }
}

public class localinner 
{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        o.display();
    }
}
