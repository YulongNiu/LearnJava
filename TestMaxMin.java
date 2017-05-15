public class TestMaxMin
{
    public static void main (String[] args)
    {
        double a1 = Math.random();
        double a2 = Math.random();
        double a3 = Math.random();
        double a4 = Math.random();
        double a5 = Math.random();

        double mean = (a1 + a2 + a3 + a4 + a5) / 5;
        double max = Math.max(Math.max(Math.max(Math.max(a1, a2), a3), a4), a5);
        double min = Math.min(Math.min(Math.min(Math.min(a1, a2), a3), a4), a5);

        System.out.print("a1 is " + a1 + "\n");
        System.out.print("a2 is " + a2 + "\n");
        System.out.print("a3 is " + a3 + "\n");
        System.out.print("a4 is " + a4 + "\n");
        System.out.print("a5 is " + a5 + "\n");
        System.out.print("Mean is " +  mean + "\n");
        System.out.print("Maximum is " +  max + "\n");
        System.out.println("Minimum is " +  min + "\n");
    }
}