public class ThreeSort
{
    public static void main (String[] args)
    {
        int a1 = Integer.parseInt(args[0]);
        int a2 = Integer.parseInt(args[1]);
        int a3 = Integer.parseInt(args[2]);

        int max = Math.max(Math.max(a1, a2), a3);
        int min = Math.min(Math.min(a1, a2), a3);
        int middle = a1 + a2 + a3 - max - min;

        System.out.println(min + " --> " + middle + " --> " + max);
    }
}