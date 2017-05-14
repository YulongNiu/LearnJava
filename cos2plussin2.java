public class cos2plussin2
{
    public static void main (String[] args)
    {
        double angle = Double.parseDouble(args[0]);
        double r = Math.pow(Math.sin(angle), 2) + Math.pow(Math.cos(angle), 2);
        System.out.println(r);
    }
}