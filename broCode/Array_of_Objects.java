package broCode;
import java.util.Scanner;

// Print name and marks of student - using array of objects


class Student
{
    String name;
    int marks;
}


public class Array_of_Objects
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        // get the number of students form user
        System.out.print("Enter the number of students: ");
        int studentCount = scan.nextInt();

        

        // create object array ---> references to the objects
        Student students[] = new Student[studentCount];


        // initialize each object in the array
        for(int i=0; i<students.length; i++)
        {
            students[i] = new Student();
        }

        // input student details - name and marks
        for(int i=0; i<studentCount; i++)
        {
            scan.nextLine();
            System.out.print("Enter student " + (i+1) + " name: ");
            students[i].name = scan.nextLine();

            System.out.print("Enter student " + (i+1) + " marks: ");
            students[i].marks = scan.nextInt();
        }


        System.out.println();

        // output each student details
         for(Student stu: students)
        {
            System.out.print("Student name: " + stu.name);
            System.out.print("\nStudent marks: " + stu.marks + "\n");
        }

        scan.close();

    }
}