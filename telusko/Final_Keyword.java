package telusko;

final class FinalExample // class can't be extended
{
    final double pi = 3.14; // a final variable value cannot be modified
    // pi = 5.6;

    final public int square(int num) // metehod can't be overridden
    {
        return num*num;
    }
}


public class Final_Keyword 
{
    public static void main(String[] args) 
    {
        FinalExample obj = new FinalExample();

        int sq = obj.square(5);
        System.out.println(sq);

    }
}
