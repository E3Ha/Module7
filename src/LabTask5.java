
public class LabTask5 {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        String output = "";


        for (i = 0; i < 5; i++) {


            for (j = 0; j < 1; j++) {
                        output += "*";
            }
            System.out.println(output);


        }

        /*
        //Alternative Solution

        int i = 0;
        String output = "*";

        for (i = 0; i < 5; i++){

            System.out.println(output);
            output += "*";


        }
        */


    }
}
