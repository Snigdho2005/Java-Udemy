import java.io.*;

public class bytedemo 
{
    public static void main(String[] args) throws Exception
    {
        byte b[] = {'a','b','c','d','e','f','g','h','i','j'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        /*
        int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }
        bis.close();
        */

        String str = new String(bis.readAllBytes());
        //System.out.print(str);
        System.out.println(bis.markSupported());
        bis.close();
    }
}
