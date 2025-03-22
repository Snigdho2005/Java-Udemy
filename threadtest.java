/* 
class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
}

public class threadtest 
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.start();
        int i=1;

        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
*/

public class threadtest extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String[] args)
    {
        threadtest t = new threadtest();
        t.start();
        int i=1;

        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
