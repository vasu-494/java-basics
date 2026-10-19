package telusko;
public class Conditional_Statements
{
    public static void main(String[] args)
    {
        int a = 7, b = 16, c = 15;

        // if..else statement
        // greatest of 3 numbers

        if(a>b && a>c)
        {
            System.out.println("Greatest of 3 numbers is: " + a);
            // System.out.println(a);
        }
        else if (b>c)
        {
            System.out.println("Greatest of 3 numbers is: " + b);
            // System.out.println(b);
        } 
        else
        {
            System.out.println("Greatest of 3 numbers is: " + c);
            // System.out.println(c);
        }

        // odd or even using ternary operator
        int num1 = 4, num2 = 5;
        String even_num, odd_num;

        even_num = (num1%2==0) ? "Even" : "Odd";
        odd_num = (num2%2==0) ? "Even" : "Odd";

        System.out.println(even_num);
        System.out.println(odd_num);

        // switch case
        // print weekday for a given number
        int day_num = 7;
        switch(day_num)
        {
            case 1: {   System.out.println("Monday");  break;}
            case 2: {   System.out.println("Tuesday");  break;}
            case 3: {   System.out.println("Wednesday");  break;}
            case 4: {   System.out.println("Thursday");  break;}
            case 5: {   System.out.println("Friday");  break;}
            case 6: {   System.out.println("Saturday");  break;}
            case 7: {   System.out.println("Sunday");  break;}

            default: System.out.println("Enter a number from 1-7 only, thanks!!");
        }

        /* updated switch 
           |---> update from Java 12 -- switch need not mandatorily have a BREAK statement
           |---> we can use '->' next to case and give the related code
        */

        // set alarm based on the day
        
        String day = "Sunday";
        switch(day)
        {
            case "Monday" -> System.out.println("8am");
            case "Saturday", "Sunday" -> System.out.println("6am");
            default -> System.out.println("7am");

        }

        // Switch as an expression
        // method 1 ---> store the value in a variable to use it elsewhere
        day = "Thursday";
        String day_result = "";
        switch(day)
        {
            case "Monday" -> day_result = "8am";
            case "Saturday", "Sunday" -> day_result = "6am";
            default -> day_result = "7am";
        }
        System.out.println(day_result);

        // method 2 ---> retrieve the value in expression (similar to lambda expression in Java 8)
        day = "Monday";
        String day_result2 = switch(day)
        {
            case "Monday" -> "8am";
            case "Saturday", "Sunday" -> "6am";
            default -> "7am";
        };
        System.out.println(day_result2);

        // method 2 ---> retrieve the value in expression using ':' instead of '->'
        day = "Saturday";
        String day_result3 = switch(day)
        {
            case "Monday": yield "8am";
            case "Saturday", "Sunday": yield "6am";
            default: yield "7am";
        };
        System.out.println(day_result3);

    }
}