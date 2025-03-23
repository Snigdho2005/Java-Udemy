import java.io.*;

class Student
{
    int rollno;
    String name;
    float avg;
    String dept; 
}

public class datastreamdemo 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Student2.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        Student s=new Student();
        s.rollno=10;
        s.name="John";
        s.avg=80.5f;
        s.dept="CSE";

        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.dept);

        dos.close();
        fos.close();
    }
}
