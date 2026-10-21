package telusko;

public class WrapperClass 
{
    public static void main(String[] args) 
    {
        int n1 = 5;

        // Integer num = new Integer(7); ---> boxing
        Integer num1 = n1; // ---> auto-boxing
        System.out.println(num1);

        // int n2 = num.intValue(); ---> un-boxing
        int n2 = num1; // ---> auto-unboxing
        System.out.println(n2);
    }
}
