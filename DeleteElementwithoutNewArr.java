public class DeleteElementwithoutNewArr {
    public static void main(String[] args)
    {
        int A[] = {1,2,3,4,5};
        int indexToRemove = 2;

        for(int i = indexToRemove; i < A.length-1; i++ )
        {
            A[i] = A[i+1];
        }

        A[A.length-1] = 0;

        System.out.print("Array after removal: ");
        for(int num : A)
        {
            System.out.print(num + " ");
        }
    }
}
