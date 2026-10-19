package broCode;
import java.util.Scanner;

public class User_Input
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // get username
        System.out.print("Enter your name: ");
        String name = scan.nextLine(); // counts the spaces as well in a given string

        // String name = scan.next(); 
        // next() does not count the characters like spaces in a string
        // so after the first space, it truncates rest of the string

        // get user age
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        // get user gpa
        System.out.print("Enter your gpa: ");
        double gpa = scan.nextDouble();

        // get user is Student or not
        System.out.println("Are you a Student? (true/false) ");
        boolean isStudent = scan.nextBoolean();


        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa); 

        if(isStudent)
            System.out.println("You are enrolled as a Student");
        else
            System.out.println("You are NOT enrolled as a Student");
        

        scan.close(); // to close the scanner 
    }
}
