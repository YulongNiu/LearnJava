public class Newton
{
    public static void main (String[] args)
    {
        double c = Double.parseDouble(args[0]);
        double intVal = c;
        double epsilon = 1e-15;
        int i = 1;

        while (intVal * intVal > epsilon + c)
        {
            intVal = (intVal + c/intVal) / 2;
            ++i;
            System.out.print(i + "--" + intVal + "\n");

        }

        System.out.println(intVal);
    }
}