
import java.util.Scanner;

public class NoteAssignment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trash = "";
        String move = "";

        move = RPSchecker(scan, move);
        System.out.println("Your Move: " + move);







    }
    private static String RPSchecker(Scanner scan, String m) {

        String trash = "";
        boolean done = false;

        do {
            //Ask for move
            System.out.println("Move: ");
            //Check for incorrect input
            if (scan.hasNextDouble()) {
                System.out.println("Incorrect Input ");
                trash = scan.nextLine();
            }
            //Correct input type
            else {
                m = scan.nextLine();
                m = m.toLowerCase();
                //Check for correct move-type
                switch (m) {
                    case "r":
                    case "p":
                    case "s":
                        done = true;
                        break;
                    default:
                        m = trash;
                        System.out.println("Incorrect Input ");
                }
            }
            System.out.println("");
        }
        while (done == false);

        return m;
    }

}