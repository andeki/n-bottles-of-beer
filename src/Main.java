import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //ask and receive input
        System.out.print("Enter number of bottles to start with: ");
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        System.out.println();

        //loop taking amount of bottles and displaying
        for (int i = total; i > 0; i--)
        {
            //plurality check for i being 1 to say "bottle" rather than "bottles"

            if(i == 1)
            {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
            } else {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
            }

            //plurality check for i-1
            if(i-1 == 1)
            {
                System.out.println("Take one and pass it down, " + (i-1) + " bottle of beer on the wall.");
            } else {
                System.out.println("Take one and pass it down, " + (i-1) + " bottles of beer on the wall.");
            }
            //gui line
            System.out.println();
        }

        //run output ending/asking for restart of the saying
        System.out.println("0 bottles of beer on the wall, 0 bottles of beer.");
        System.out.println("Go to the store and buy some more, " + total + " bottles of beer on the wall.");
    }
}