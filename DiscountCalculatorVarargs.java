public class DiscountCalculatorVarargs {
    static double calculateDiscount(double discountPercentage, double ...prices)
    {
        double total = 0;
        for(double price : prices)
        {
            double discountedPrice = price - (price * (discountPercentage/100));
            total += discountedPrice;
        }
        return total;
    }
    public static void main(String[] args)
    {
        double totalAfterDiscount = calculateDiscount(20, 100,200,300);
        System.out.println("Total after 20% discount: "+ totalAfterDiscount);

        double totalNoItems = calculateDiscount(10);
        System.out.println("Total with no items (just discount): "+ totalNoItems);

    }
}
