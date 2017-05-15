public class TestAbsInt
{
    public static void main (String[] args)
    {
        double r = Math.abs(-2147483648L);
        double n = Math.round(6.002e20);
        System.out.print(r + "\n");
        System.out.print(n + "\n");
        System.out.println(1.0/0);
    }
}