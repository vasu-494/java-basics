import java.util.Scanner;

public class Calc_Hypotenuse
{
    public static void main(String[] args) 
    {
        // calculate hypotenuse of a right triangle
        Scanner scan = new Scanner(System.in);
        
        double length, breadth;
        // get length
        System.out.print("Enter the length of the triangle: ");
        length = scan.nextDouble();

        // get breadth
        System.out.print("Enter the breadth of the triangle: ");
        breadth = scan.nextDouble();

        // calc hyp = sqrt(a^2 + b^2)
        double hyp = Math.sqrt(Math.pow(length,2) + Math.pow(breadth,2));
        System.out.println("\nHypotenuse: " + hyp);
        
        scan.close();
    }
}
