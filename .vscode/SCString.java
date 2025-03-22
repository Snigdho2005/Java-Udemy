public class SCString {
    public static void main(String[] args)
    {
        /*
        int b = 1000110;
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]+"));
        */

        String str = "B234A";
        System.out.println(str.matches("[0-9A-F]+"));
    }
}
