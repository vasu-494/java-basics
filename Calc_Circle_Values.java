import java.util.Scanner;

public class Calc_Circle_Values 
{
    public static void main(String[] args) 
    {
        // calculate circumference and area given the cirle radius
        // calculate volume of sphere given the sphere radius

        Scanner scan = new Scanner(System.in);

        double circleRadius;
        double circleCircumference;
        double circleArea;
        
        // get the circle radius
        System.out.print("Enter circle radius: ");
        circleRadius = scan.nextDouble();

        // calc circle circumference and area
        circleCircumference = 2 * Math.PI * circleRadius;
        circleArea = Math.PI * Math.pow(circleRadius,2);

        // print circle circumference and area
        System.out.println("Circle Circumference: " + circleCircumference + " cm");
        System.out.println("Circle Area: " + circleArea + " cm^2");

        // using printf - formatted string
        System.out.printf("\nCircle Circumference: %.2fcm", circleCircumference);
        System.out.printf("\nCircle Area: %.2fcm^2", circleArea);

        double sphereRadius;
        double sphereVolume;

        // get the sphere radius
        System.out.print("\nEnter sphere radius: ");
        sphereRadius = scan.nextDouble();

        // calc sphere volume
        sphereVolume = 4.0/3.0 * Math.PI * Math.pow(sphereRadius,3);

        // print sphere volume
        System.out.println("\nSphere Volume: " + sphereVolume + " cm^3");

        // using printf - formatted string
        System.out.printf("Sphere Volume: %.2fcm^3", sphereVolume);
        scan.close();
        
    }
    
}