import java.io.*;

public class source1source2destination 
{
    public static void main(String[] args) throws Exception
    {
       FileInputStream fis1 = new FileInputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Source 1.txt");
       FileInputStream fis2 = new FileInputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Source 2.txt");

       FileOutputStream fos = new FileOutputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Destination.txt");

       SequenceInputStream sis = new SequenceInputStream(fis1,fis2);

       int b;
       while((b=sis.read())!=-1)
       {
           fos.write(b);
       }

       sis.close();
       fis1.close();
       fis2.close();
       fos.close();
    }
}
