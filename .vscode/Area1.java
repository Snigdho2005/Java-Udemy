import java.util.*;

public class Area1
{
    public static void main(String args[])
    {
        float base,height,area;
        System.out.println("Enter Base and Height :");

        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();

        area = base*height*0.5f;

        System.out.println("Area of a Triangle is " + area);
    }
}
