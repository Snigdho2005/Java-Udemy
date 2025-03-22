import java.io.*;

public class source2copysource1 
{
    public static void main(String[] args) throws Exception
    {
       FileInputStream fis = new FileInputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Source 1.txt");
       FileOutputStream fos = new FileOutputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Source 2.txt");

       int b;
       while((b=fis.read())!=-1)
       {
           if(b>=65 && b<=90)
           {
             fos.write(b+32);
           }
           else
           {
               fos.write(b);
           }
       }

       fis.close();
       fos.close();
    }
}
