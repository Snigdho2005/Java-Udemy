public class DeletingElement {
    public static void main(String[] args)
    {
        int A[] = {1,2,3,4,5};
        int indexToRemove = 2;

        int newArr[] = new int[A.length-1];

        for(int i = 0, j = 0; i < A.length; i++)
        {
            if(i != indexToRemove)
            {
                newArr[j] = A[i];
                j++;
            }
        }

        System.out.print("Array after removal: ");
        for(int num : newArr)
        {
            System.out.print(num + " ");
        }
    }
}
