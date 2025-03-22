class Super 
{
    public void display()
    {
        System.out.println("Super Class Display");
    }
}

class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub Class Display");
    }
}

public class Overriding {
    public static void main(String[] args)
    {
        /*
        Super sup = new Super();
        sup.display();

        Sub sub = new Sub();
        sub.display();
        */

        Super sup = new Sub();  // Dynamic Method Dispatch
        sup.display();
    }
}
