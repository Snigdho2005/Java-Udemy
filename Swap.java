class Swap {
    private int a, b;

    // Constructor to initialize the values
    public Swap(int x, int y) {
        a = x;
        b = y;
    }

    // Method to swap the values
    public void swapValues() {
        int temp = a;
        a = b;
        b = temp;
    }

    // Method to display the values
    public void display() {
        System.out.println("a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        // Creating an object of the class with values 5 and 10
        Swap obj = new Swap(5, 10);

        // Displaying original values
        System.out.println("Before swapping:");
        obj.display();

        // Swapping the values
        obj.swapValues();

        // Displaying swapped values
        System.out.println("After swapping:");
        obj.display();
    }
}
