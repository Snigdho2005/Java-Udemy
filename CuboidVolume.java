import java.util.*;
import java.lang.*;

class CuboidVolume
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int length, breadth, height;
        int totalArea, volume;

        System.out.println("Enter Length, Breadth and Height :");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        totalArea = 2*(length*breadth+breadth*height+length*height);
        volume = length*breadth*height;

        System.out.println("Total Area :"+totalArea);
        System.out.println("Total Volume :"+volume);
    }
}