public class MethodPractice1 {
    
    /*
    int max(int x, int y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    */

    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args)
    {
        //int a=10,b=15;
        int a=10;

        inc(a);
        System.out.println(a);

        /*
        MethodPractice1 mp = new MethodPractice1();
        System.out.println(mp.max(a,b));
        */
    }
}
