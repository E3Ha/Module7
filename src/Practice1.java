
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trash = "";
        int i;
        int inc = 0;
        int sum = 0;

        //For loop - runs 50 times
        for (i = 0; i < 50; i++){
                inc = inc + 2;
                sum = sum + inc;
        }
        System.out.println("Sum: " + sum);


    }
}
