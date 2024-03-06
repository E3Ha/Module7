import java.util.Scanner;


public class Practice3 {
    public static void main(String[] args) {


       /*
       Write a program that will tell a user how many years it will take an initial investment
       (that they input) to double in size if the interest rate is .05%.
        */


        Scanner scan = new Scanner(System.in);
        String trash = "";
        double initialInvest = 0;
        boolean done = false;
        double INTEREST = 1.005;
        int years = 0;
        double doubleInvest = 0;




        do {
            //collect initial investment
            System.out.println("Initial Investment: ");


            //check if input is valid
            if (scan.hasNextDouble()) {
                initialInvest = scan.nextDouble();
                doubleInvest = initialInvest * 2;
                done = true;
            }
            else {
                System.out.println("Incorrect Input");
                trash = scan.nextLine();
            }
            System.out.println("");
        }
        while (done == false);




        //calculate when initial investment will be doubled
        do {
            initialInvest = initialInvest * INTEREST;
            years = years + 1;
        }
        while (initialInvest < doubleInvest);


        System.out.println("Years: " + years);


    }
}
