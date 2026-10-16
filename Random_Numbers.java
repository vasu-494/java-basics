import java.util.Random;

public class Random_Numbers 
{
    public static void main(String[] args) 
    {
        Random random = new Random();

        
        int num;
        
        // get random integer value
        num = random.nextInt();
        System.out.println(num);

        // get random number in a range - starting index: INCLUSIVE, ending index: EXCLUSIVE
        num = random.nextInt(1,7);
        System.out.println(num);

        // get a random decimal number
        double decimal;
        decimal = random.nextDouble(); // generates a random number between 0 to 1
        System.out.println(decimal);

        // Coin Toss
        boolean toss;
        toss = random.nextBoolean();

        if(toss)
            System.out.println("Heads!");
        else
            System.out.println("Tails!");
        
        
    }
}
