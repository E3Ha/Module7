
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trash = "";
        double initialInvest = 0;
        boolean done = false;
        double INTEREST = 1.05;
        int years = 0;


        do {
            //collect initial investment
            System.out.println("Initial Investment: ");

            //check if input is valid
            if (scan.hasNextDouble()) {
                initialInvest = scan.nextDouble();
                done = true;
            }
            else {
                System.out.println("Incorrect Input");
            }
            System.out.println("");
        }
        while (done == false);


        //calculate when initial investment will be doubled
        do {
            initialInvest = initialInvest * INTEREST;
            years = years + 1;
        }
        while (initialInvest < initialInvest * 2) ;

        System.out.println("Years: " + years);

    }
}
