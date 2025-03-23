import java.io.*;

public class datastreamdemo1 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Student2.txt");
        DataInputStream dis = new DataInputStream(fis);

        Student s=new Student();
        
        s.rollno=dis.readInt();
        s.name=dis.readUTF();
        s.avg=dis.readFloat();
        s.dept=dis.readUTF();

        System.out.println("Roll No: "+s.rollno);
        System.out.println("Name: "+s.name);
        System.out.println("Average: "+s.avg);
        System.out.println("Dept: "+s.dept);
        
        dis.close();
        fis.close();
    }
}
