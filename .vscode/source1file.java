import java.io.*;

public class source1file 
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Source 1.txt");
            String str = "JAVA PROGRAMMING LANGUAGE";
            String str1 = "TEST FILE";
            String str2 = "COPY DATA FROM ONE FILE TO ANOTHER FILE";

            fos.write((str + "\n").getBytes());
            fos.write((str1 + "\n").getBytes());
            fos.write((str2 + "\n").getBytes());

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
