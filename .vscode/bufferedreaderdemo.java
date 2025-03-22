import java.io.*;

public class bufferedreaderdemo 
{
    public static void main(String[] args) throws Exception
    {
        FileReader fis = new FileReader("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Test.txt");
        BufferedReader bis = new BufferedReader(fis);

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

        System.out.println("String "+bis.readLine());
    }
}
