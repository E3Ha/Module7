import java.util.Scanner;


public class Practice4 {
    public static void main(String[] args) {


       /*
       Write a program that asks the user for values, then multiplies all of them together when
       they indicate they are done entering values. Turn part of this into a METHOD.
       */


        Scanner scan = new Scanner(System.in);
        String trash = "";
        boolean done = false;
        double userInput = 0;
        double total = 1;
        String indication = "";


        do {


            System.out.println("Next # to continue, non # to be done: ");


            if (scan.hasNextDouble()) {
                userInput = scan.nextDouble();
                total = multiplication(userInput, total);
            }
            else {
                done = true;
                System.out.println("Total: " + total);
            }


            System.out.println("");




        }
        while (done == false);


    }


    private static double multiplication(double uIn, double t) {


        return uIn * t;
    }


}
