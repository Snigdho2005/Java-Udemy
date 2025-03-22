public class Pattern5 {
    /*
    public static void main(String[] args)
    {
        int count=0;
        for(int i=1; i<=5; i++)
        {
           for(int j=1; j<=i; j++)
           {
              count++;
              System.out.print(count+" ");
           }
           System.out.println("");
        }
    }
    */
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
           for(int j=1; j<=i; j++)
           {
              System.out.print("* ");
           }
           System.out.println("");
        }
    }
}
