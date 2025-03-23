import java.io.*;

public class filehandling 
{
    public static void main(String[] args) throws Exception
    {
        /*
        File f=new File("/Users/snigdhajyotirakshit/Desktop/Java Udemy");
        
        System.out.println(f.isDirectory());
        */
        
        /*
        String list[]=f.list();

        for(String x:list)
        {
            System.out.println(x);
        }
        */

        /*
        File list[]=f.listFiles();

        for(File x:list)
        {
            System.out.print(x.getName()+" ");
            System.out.println(x.getPath());
        }
        */

        File f = new File("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Data File.txt");
        //f.setReadOnly();
        f.setWritable(true);
        FileOutputStream fos =new FileOutputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Data File.txt");

    }
}
