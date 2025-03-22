@FunctionalInterface
interface MyLambda
{
    //public void display(String str);
    public int add(int x,int y);
}

public class parameterlambda 
{
    public static void main(String[] args)
    {
       //MyLambda m= (str)->{System.out.println(str);};
       // m.display("Java Programming");

       //MyLambda m= (x,y)->{return x+y;};
       MyLambda m= (x,y)->x+y;
       int r=m.add(10,20);
       System.out.println(r);
    }
}
