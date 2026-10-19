package telusko;
public class Do_While_Loop 
{
    public static void main(String[] args) 
    {
         // print Hi 5 times  ---> used whenn we need atleasr one loop, even if condition is false
        int i = 6;
        
        do
        {
            System.out.println("Hi " + i);
            i++;
        } while(i <= 5);
    }
}
