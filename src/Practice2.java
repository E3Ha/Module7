
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trash = "";
        int userInput = 0;


        userInput = intChecking(scan);
        System.out.println("Correct value: " + userInput);


    }

    private static int intChecking(Scanner scan) {

        boolean done = false;
        int validInput = 0;

        //issue - continually loops if not an integer
        do {

            System.out.println("Enter a value < 100: ");

            if (scan.hasNextInt()) {
                validInput = scan.nextInt();

                if (validInput < 100) {
                    done = true;
                }
                else{
                    System.out.println("Value must be less than 100");
                }
            }
            else{
                System.out.println("Must be an integer");
            }
            System.out.println("");
        }
        while (done == false);

        return validInput;

    }
}
