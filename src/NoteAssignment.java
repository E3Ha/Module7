
import java.util.Scanner;

public class NoteAssignment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trash = "";
        String move1 = "";
        String move2 = "";
        boolean done = false;

        do {
            System.out.println("Player1 Move: ");
            move1 = RPSchecker(scan, move1);

            System.out.println("Player2 Move: ");
            move2 = RPSchecker(scan, move2);


            switch (move1) {
                case "r":
                    switch (move2) {
                        case "r":
                            System.out.println("Tie");
                            break;
                        case "p":
                            System.out.println("Player2 Wins");
                            break;
                        case "s":
                            System.out.println("Player1 Wins");
                            break;
                        default:
                            break;
                    }
                    break;
                case "p":
                    switch (move2) {
                        case "r":
                            System.out.println("Player1 Wins");
                            break;
                        case "p":
                            System.out.println("Tie");
                            break;
                        case "s":
                            System.out.println("Player2 Wins");
                            break;
                        default:
                            break;
                    }
                    break;
                case "s":
                    switch (move2) {
                        case "r":
                            System.out.println("Player2 Wins");
                            break;
                        case "p":
                            System.out.println("Player1 Wins");
                            break;
                        case "s":
                            System.out.println("Tie");
                            break;
                        default:
                            break;
                    }
                    break;
            }

                System.out.println("");
                System.out.println("Continue? (Y,N)");

                if (scan.hasNextDouble()) {
                    System.out.println("Incorrect Input");
                    trash = scan.nextLine();
                } else {
                    trash = scan.nextLine();
                    trash = trash.toLowerCase();
                    switch (trash) {
                        case "y":
                            break;
                        case "n":
                            done = true;

                            break;
                        default:
                            System.out.println("Incorrect Input");
                            break;
                    }
                }
        }
        while (done == false);





    }
    private static String RPSchecker(Scanner scan, String m) {

        String trash = "";
        boolean done = false;

        do {
            //Ask for move

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