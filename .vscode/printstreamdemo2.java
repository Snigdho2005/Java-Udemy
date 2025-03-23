import java.io.*;

public class printstreamdemo2 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        Student s=new Student();
        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();

        System.out.println("Roll No: "+s.rollno);
        System.out.println("Name: "+s.name);
        System.out.println("Dept: "+s.dept);
    }
}
