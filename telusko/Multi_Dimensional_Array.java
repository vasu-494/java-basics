package telusko;
public class Multi_Dimensional_Array 
{
    public static void main(String[] args) 
    {
        // creating a 2D array
        int a[][] = new int[3][4];
        
        // assign random values to array
         for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                a[i][j] = (int)(Math.random() * 10);
            
            }
        }
    
        // print the array - after assigning value
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(a[i][j]  + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        // enhanced for loop
        for(int n[] : a)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        } 
                

    }    
}
