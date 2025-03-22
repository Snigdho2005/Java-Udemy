public class MethodOverloading 
{
    static byte max(byte x,byte y)
    {
        return x>y?x:y;
    }
    
    static int max(int x,int y)
    {
        return x>y?x:y;
    }
    
    static float max(float x,float y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }

    static int max(int x,int y,int z)
    {
        if(x>y && x>z)
        {
            return x;
        }
        else if(y>z)
        {
            return y;
        }
        else
        {
            return z;
        }
    }
    public static void main(String[] args)
    {
        //System.out.println(max(10.5f,5.4f));
        byte a=10, b=5;
        System.out.println(max(10,5,15));
    }
}
