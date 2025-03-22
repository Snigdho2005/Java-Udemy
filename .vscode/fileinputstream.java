import java.io.*;

public class fileinputstream 
{
    public static void main(String[] args) throws Exception
    {
        try(FileInputStream fis = new FileInputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Test.txt"))
        {
            /*
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str = new String(b);

            System.out.println(str);
            */

            int x;

            do
            {
                x=fis.read();
                
                if(x!=-1)
                  System.out.print((char)x);
            }while(x!=-1);
        }
    }
}
