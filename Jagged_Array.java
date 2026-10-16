public class Jagged_Array 
{
    public static void main(String[] args) 
    {   
        // jagged array - when don't specigy the size of inner arrays, its called Jagged Array
        int nums[][] = new int[3][];

        // if we need each row of different size, then we should specify them individually
        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[4];

        // store values in each row
        for(int i=0; i<nums.length; i++)
        {
            for(int j = 0; j<nums[i].length; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }


        // print the jagged array using enhanced for loop
        for(int n[] : nums)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        
    }
    
}
