import java.io.*;

class Student implements Serializable
{
    private int roll;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;

    public Student()
    {

    }

    public Student(int r,String n,float a,String d)
    {
        roll=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }

    public String toString()
    {
        return "Roll: "+roll+" Name: "+name+" Average: "+avg+" Dept: "+dept+" Data: "+Data+" Transient: "+t;
    }
}

public class objectstreamdemo 
{
    
    /*
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Student3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s=new Student(10,"John",80.9f,"CSE");
        oos.writeObject(s);

        fos.close();
        oos.close();
    }
    */

    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("/Users/snigdhajyotirakshit/Desktop/Java Udemy/Student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s=(Student)ois.readObject();
        System.out.println(s);
        
        fis.close();
        ois.close();
    }
}
