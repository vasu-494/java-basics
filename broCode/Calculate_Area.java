package broCode;
import java.util.Scanner;

public class Calculate_Area
{
    public static void main(String[] args)
    {
        double length = 0, breadth = 0, rect_area = 0;

        Scanner scan = new Scanner(System.in);
        
        // Calculate area of rectangle - get length and breadth for rectangle
        System.out.print("Enter the length: ");
        length = scan.nextDouble();

        System.out.print("Enter the breadth: ");
        breadth = scan.nextDouble();

        rect_area = length * breadth;
        System.out.println("The area of the rectangle is: " + rect_area + "sq.cm");

        scan.close();
            
    }
}