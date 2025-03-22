import java.io.FileOutputStream;

public class source2file 
{
    public static void main(String[] args)
    {
        try
        {
           FileOutputStream fos = new FileOutputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Source 2.txt");
           fos.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
