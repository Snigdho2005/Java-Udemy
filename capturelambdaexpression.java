interface MyLambda
{
    public void display();
}

class Demo
{
    int temp=10;

    public void method1()
    {
        final int count=0;

        MyLambda ml=()->{
            System.out.println("Hi");
            //System.out.println("Bye"+count);
            System.out.println("Bye "+(++temp));
        };

        ml.display();
    }
}

public class capturelambdaexpression 
{
    public static void main(String[] args)
    {
       Demo d1 = new Demo();
       d1.method1();
    }
}
