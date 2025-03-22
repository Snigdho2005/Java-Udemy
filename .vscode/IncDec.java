import java.lang.*;
import java.util.*;

class IncDec
{
    public static void main(String args[])
    {
        int x = 5,y=4,z;
        z=2*x++ + 3 * ++y;
        System.out.println(z);
    }
}