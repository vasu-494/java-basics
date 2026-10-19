package broCode;
import java.util.Scanner;

public class Mad_Libs 
{
    public static void main(String[] args) 
    {
        // Mad Libs Game - fill in the gaps in a story(funny / feel good one I prefer) - with Adjectives, Nouns, Verbs etc.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a verb in present tense: ending with -ing: ");
        String verb1 = scan.nextLine();

        System.out.print("Enter a noun(person - male): ");
        String noun1 = scan.nextLine();

        System.out.print("Enter a noun(person - female): ");
        String noun2 = scan.nextLine();

        System.out.print("Enter an adjective(decribe male noun): ");
        String adj1 = scan.nextLine();

        System.out.print("Enter an adjective(decribe female noun): ");
        String adj2 = scan.nextLine();

        System.out.print("Enter an adjective: ");
        String adj3 = scan.nextLine();

        System.out.print("Enter a verb: ");
        String verb2 = scan.nextLine();

        System.out.print("Enter an adjective: ");
        String adj4 = scan.nextLine();

        System.out.print("\nI was " + verb1 + " a film.");
        System.out.print(" The " + noun1 + " and " + noun2 + " came out from their houses!");
        System.out.print(" The hero was " + adj1);
        System.out.print(" and, the heroine was " + adj2);
        System.out.print(". They fell in love! The movie had " + adj3 + " of fun elements!");
        System.out.println("\nIt was a " + verb2 + " " +adj4 + " movie!!");

        scan.close();
            
    }
}
