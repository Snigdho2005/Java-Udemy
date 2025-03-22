import java.util.*;

class ReadingString
{
   public static void main(String[] args) 
   {
    Scanner s = new Scanner(System.in);
    String name;
    System.out.println("May I know your name ?");
    name = s.nextLine();
    System.out.println("Welcome Mr/Miss " + name);
    s.close();
   }
}