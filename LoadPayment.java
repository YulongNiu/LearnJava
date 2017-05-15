public class LoadPayment
{
    public static void main (String[] args)
    {
        double year = Double.parseDouble(args[0]);
        double principal = Double.parseDouble(args[1]);
        double rate = Double.parseDouble(args[2]);

        double payment = principal * Math.exp(year * rate);

        System.out.println(payment);
    }
}