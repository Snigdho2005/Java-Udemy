abstract class Super
{
    public Super()
    {
        System.out.println("Super Class Constructor");
    }
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    abstract public void meth2();
}

class Sub extends Super
{
    public void meth2()
    {
        System.out.println("Meth2 of Sub");
    }
}

public class AbstractExample {
    
    public static void main(String[] args)
    {
        Super s = new Sub();
        s.meth1();
        s.meth2();
    }
}
