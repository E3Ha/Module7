
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        /*
        Write a program that asks the user for values, then multiplies all of them together when
        they indicate they are done entering values. Turn part of this into a METHOD.
        */

        //Incomplete

        Scanner scan = new Scanner(System.in);
        String trash = "";
        boolean done = false;
        double userInput = 0;
        String indication = "";

        do {
            System.out.println("Value: ");

            if (scan.hasNextDouble()) {
                userInput = scan.nextDouble();

                System.out.println("Are you done? ");

                if (scan.hasNextDouble()) {
                    System.out.println("Incorrect Input");
                }
                else {
                    indication = scan.nextLine();

                    indication = indication.toLowerCase();

                    if (indication == "yes"){
                        done = true;
                    }
                }

            }
            else {
                System.out.println("Incorrect Input");
            }
            System.out.println("");





        }
        while (done == false);

    }
/*
    private static returntype methodname(Scanner scan) {

        return variable;
    }
*/
}