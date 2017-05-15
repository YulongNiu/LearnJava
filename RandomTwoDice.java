public class RandomTwoDice
{
    public static void main (String[] args)
    {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;

        System.out.print("Dice 1 is " + dice1 + "\n");
        System.out.println("Dice 2 is " + dice2);
    }
}