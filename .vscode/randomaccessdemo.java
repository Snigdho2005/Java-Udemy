import java.io.*;

public class randomaccessdemo 
{
    public static void main(String[] args) throws Exception
    {
        RandomAccessFile rf = new RandomAccessFile("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Data File.txt","rw");

        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());

        rf.write('d');
        System.out.println((char)rf.read());

        rf.skipBytes(3);
        System.out.println((char)rf.read());

        rf.seek(3);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());

        rf.seek(rf.getFilePointer()+2);
        System.out.println((char)rf.read());

    }
}
