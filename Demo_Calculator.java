class Calculators
{
    int num;
    
    public int add(int num1, int num2)
    {
        int result = num1 + num2;
        return result;
    }
}

public class Demo_Calculator
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 6;

        Calculators calc = new Calculators(); // calc is a reference variable - references Calculator type
        int sum = calc.add(a,b);

        System.out.println("Sum of two numbers is: " + sum);

    }
}