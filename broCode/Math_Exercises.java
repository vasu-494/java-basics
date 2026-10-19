package broCode;
public class Math_Exercises 
{
    public static void main(String[] args) 
    {
        // using math functions
        System.out.println(Math.PI); // pi value
        System.out.println(Math.E); // exponential constant - Euler's number

        // power of a number
        double decimalPower = Math.pow(2, 3);
        int intPower = Math.powExact(2, 3);

        System.out.println(decimalPower);
        System.out.println(intPower);

        // absolute value of a number
        int absolute = Math.abs(-7);
        System.out.println(absolute);

        // square root
        double sqRoot = Math.sqrt(16); 
        System.out.println(sqRoot);

        // round off to nearest integer
        double rounded = Math.round(5.1);
        System.out.println(rounded);

        // ceil - round to upper integer
        double ceiled = Math.ceil(5.1);
        System.out.println(ceiled);

        // floor - round to lower integer
        double floored = Math.floor(5.99);
        System.out.println(floored);

        // maximum of range
        int maximum = Math.max(10,20);
        System.out.println(maximum);
        
        // maximum of range
        int minimum = Math.min(10,20);
        System.out.println(minimum);
    }
}
