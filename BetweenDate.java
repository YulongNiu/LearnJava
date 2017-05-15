public class BetweenDate
{
    public static void main (String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean c = (m > 3 && m < 6) ||
                (m == 3 && d > 20) ||
                (m == 6 && d < 20);

        System.out.println(c);
    }
}