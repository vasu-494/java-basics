package telusko;
public class Three_D_Array 
{
    public static void main(String[] args) 
    {
        // create 3D array
        int arr[][][] = new int[3][3][3]; // creates 3 rows of 3x3 matrix

        // assign random values to array
         for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                for(int k=0; k<3; k++)
                {
                        arr[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }

        // print the array - after assigning value
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                for(int k=0; k<3; k++)
                {
                        System.out.print(arr[i][j][k]  + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
