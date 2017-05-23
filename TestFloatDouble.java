public class TestFloatDouble
{
    public static void main (String[] args)
    {
        float a = 5.34375f;

        System.out.print(Integer.toBinaryString(Float.floatToIntBits(a)) + "\n");
        System.out.println(Integer.toBinaryString(Float.floatToIntBits(-a)));
    }
}