/*
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        //setPriority(Thread.MAX_PRIORITY);
        setPriority(Thread.MIN_PRIORITY+2);
    }
}

public class threadmethodstest 
{
    public static void main(String[] args) throws Exception
    {
        MyThread t = new MyThread("My Thread 1");
        
        System.out.println("ID "+t.threadId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+t.getPriority());
        t.start();
        System.out.println("State "+t.getState());
        System.out.println("Alive "+t.isAlive());
    }
}
*/

/* 
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        int count=1;

        while(true)
        {
            System.out.println(count++);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class threadmethodstest 
{
    public static void main(String[] args) throws Exception
    {
        MyThread t = new MyThread("My Thread 1");
        t.start();
        t.interrupt();
    }
}
*/

class MyThread extends Thread
{
    public void run()
    {
        int count=1;

        while(true)
        {
            System.out.println(count++ +"My Thread");
        }
    }
}

public class threadmethodstest 
{
    public static void main(String[] args) throws Exception
    {
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();

        // try{Thread.sleep(100);}catch(Exception e){}

        // Thread mainThread = Thread.currentThread();
        // mainThread.join();

        int count=1;

        while(true)
        {
            System.out.println(count++ +"Main");
            Thread.yield();
        }
    }
}
