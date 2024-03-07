import java.util.Scanner;
public class LabTask8 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String trash = "";
        boolean cConvert = false;
        boolean fConvert = false;
        String indicateConvert = "";
        double cInput = 0;
        double fInput = 0;
        double cOutput = 0;
        double fOutput = 0;
        boolean done = false;

        //Note: Could replace the 2 outputs with only 1
        //Might be easier to make this a method

        do {
            System.out.println("Convert Fahrenheit or Celsius? (F or C)");

            if (scan.hasNextDouble()) {
                trash = scan.nextLine();
                System.out.println("Incorrect Input.");
            }
            else {
                indicateConvert = scan.nextLine();
                indicateConvert = indicateConvert.toLowerCase();

                switch(indicateConvert) {
                    case "f":
                        done = true;
                        break;
                    case "c":
                        done = true;
                        break;
                    default:
                        System.out.println("Incorrect Input.");
                        break;
                }
            }
            System.out.println("");
        }
        while(done == false);

        done = false;

        switch(indicateConvert){
            case "f":
                do {
                    System.out.println("Input Fahrenheit: ");

                    if (scan.hasNextDouble()) {
                        fInput = scan.nextDouble();

                        cOutput = ((fInput - 32) * 5) / 9;
                        System.out.println("Fahrenheit: " + fInput);
                        System.out.println("Celsius: " + cOutput);
                        done = true;
                    } else {
                        trash = scan.nextLine();
                        System.out.println("Incorrect Input.");
                    }
                    System.out.println("");
                }
                while(done == false);
                break;
            case "c":
                do {
                    System.out.println("Input Celsius: ");

                    if (scan.hasNextDouble()) {
                        cInput = scan.nextDouble();

                        fOutput = ((cInput * 9) / 5) + 32;
                        System.out.println("Celsius: " + cInput);
                        System.out.println("Fahrenheit: " + fOutput);
                        done = true;
                    } else {
                        trash = scan.nextLine();
                        System.out.println("Incorrect Input.");
                    }
                    System.out.println("");
                }
                while(done == false);
                break;
            default:
                System.out.println("Incorrect Input.");
                break;
        }

    }
}
