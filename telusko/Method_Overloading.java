package telusko;
class Calculator
{   
    // Method Overloading
    
    // method having multiple definition but same name
    
    // it must differ by no. of parameter or by the type of parameter 
        // - if parameter type is different, then accordingly return type is changed
    
        // if no. of parameter and its type is same, but return type is different 
        //  - It is NOT Method Overloading - gives error

    // return sum of 2 numbers
    public int add(int a, int b)
    {
        return a + b;
    }

    // return sum of 3 numbers
    public int add(int a, int b, int c)
    {
        return a + b + c;
    }
}

public class Method_Overloading 
{
    public static void main(String[] args) 
    {
        // create Calculator object
       Calculator calc = new Calculator();
       

       int r1 = calc.add(4,5);
       int r2 = calc.add(2,4,6); 

        System.out.println("Sum of two numbers: " + r1);
        System.out.println("Sum of three numbers: " + r2);


    }
}
