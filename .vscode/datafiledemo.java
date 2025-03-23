import java.io.*;

public class datafiledemo 
{
    public static void main(String[] args)
    {
        try
       {
        FileOutputStream fos = new FileOutputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Data File.txt");
        String str = "ABCDEFGHIJ";
        
        fos.write(str.getBytes());
        fos.close();
       }
       catch(FileNotFoundException e)
       {
           System.out.println(e);
       }
       catch(IOException e)
       {
           System.out.println(e);
       }
    }
}
