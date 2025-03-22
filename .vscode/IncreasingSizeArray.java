public class IncreasingSizeArray {
    public static void main(String[] args)
    {
       int A[] = {1,2,3,4,5};
       int newSize = 10;

       int B[] = new int[newSize];

       for(int i = 0; i < A.length; i++)
       {
          B[i] = A[i];
       }

       for(int x : B)
       {
          System.out.print(x+",");
       }
    }
}
