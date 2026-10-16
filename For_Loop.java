public class For_Loop 
{
    public static void main(String[] args) 
    {   
        // print 1-5 in ascending order
        System.out.println("Ascending Order:");
        for(int i = 0; i < 5; i++)
            System.out.println(i+1);

        // print 1-5 in descending order
        System.out.println("\nDescending Order:");
        for(int i = 5; i > 0; i--)
            System.out.println(i);

        // print the working hourse of each work day
        // work week: Mon - Fri, work hours: 9 AM - 5 PM
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Day " + i);
            for(int j = 1; j <= 9; j++)
            {
                System.out.println("\t" + (j+8) + '-' + (j+9));
            }
        }

        
    }
}
