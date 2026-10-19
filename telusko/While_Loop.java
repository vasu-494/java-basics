package telusko;
public class While_Loop
{
    public static void main(String[] args)
    {
        // print Hi 5 times, Hello 3 times after each Hi
        int i = 1;
        while(i <= 5)
        {
            System.out.println("Hi " + i);
            int j = 1;
            while(j<=3)
            {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
    }
}