import java.util.*;

public class arraylist 
{
    static void show(int n)
    {
        if(n>60)
        {
            System.out.println(n);
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> al1=new ArrayList<Integer>(20);
        ArrayList<Integer> al2=new ArrayList<Integer>(List.of(50,60,70,80,90));

        al1.add(10);
        al1.add(0,5);
        al1.addAll(al2);
        al1.add(5,70);
        al1.set(6,100);

        /*
        System.out.println(al1.contains(50));
        System.out.println(al1.get(5));
        //System.out.println(al1.indexOf(70));
        System.out.println(al1.lastIndexOf(70));

        System.out.println(al1);
        */

        /*
        for(int i=0;i<al1.size();i++)
        {
            System.out.println(al1.get(i));
        }
        */

        /*
        for(Integer x:al1)
        {
            System.out.println(x);
        }
        */

        /*
        Iterator<Integer> it=al1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        */
    
        al1.forEach((n)->show(n));
    }

}
