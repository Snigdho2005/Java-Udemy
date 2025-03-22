/*
public class threadinterface implements Runnable
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
        threadinterface t = new threadinterface();
        Thread th = new Thread(t);
        th.start();
        int i=1;

        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
*/

class MyRunnable implements Runnable
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

public class threadinterface
{
    public static void main(String[] args)
    {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        int i=1;

        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
