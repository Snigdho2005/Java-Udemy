import java.lang.invoke.LambdaConversionException;

@FunctionalInterface
interface MyLambda
{
    public void display();
}

/*
class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello World");
    }
}
*/

/*
public class lambdademo 
{
    public static void main(String[] args)
    {
        MyLambda m = new MyLambda()
        {
            public void display()
            {
                System.out.println("Hello World");
            }
        };

        m.display();
    }
}
*/

public class lambdademo 
{
    public static void main(String[] args)
    {
        MyLambda m= ()->{System.out.println("Hello World");};
        m.display();
    }
}

