public class ReverseCopying {
    public static void main(String[] args)
    {
        int A[] = {1,2,3,4,5};
        int B[] = new int[A.length];

        for(int i=0; i<A.length; i++)
        {
           B[i] = A[A.length-1-i];
        }
        
        for(int x : B)
        {
            System.out.print(x+",");
        }
    }
}
