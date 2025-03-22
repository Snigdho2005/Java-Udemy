import java.io.*;

public class bytedemooutput 
{
    public static void main(String[] args) throws Exception
    {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        //byte b[] = bos.toByteArray();

        /*
        for(byte x:b)
        {
            System.out.print((char)x);
        }
        */

        bos.writeTo(new FileOutputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Destination 2.txt"));

        bos.close();
    }
}
