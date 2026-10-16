public class Array 
{
    public static void main(String[] args) 
    {
        // creating a static array
        int a[] = {1, 2, 3};

        // print each element in the array
        System.out.println(a[0]); // val : 1
        System.out.println(a[1]); // val : 2
        System.out.println(a[2]); // val : 3

        // change value of index 1
        a[1] = 4;
        System.out.println(a[1]); // val : 4


        // creating a dynamic array - need to mention the size in the initialze step
        int d[] = new int[3];

        // printing default values in dynamically created array
        for(int i = 0; i<3 ; i++)
        {
            System.out.println(d[i]);
        }
        
        
        
        d[2] = 5;
        System.out.println(d[2]); // val : 5

    }
    
}
