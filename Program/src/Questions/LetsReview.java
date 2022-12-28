package Questions;

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {



        String storeven = "";
        String storeOdd = "";
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

               for(int j = 0; j <T ; j++) {

                     String s = sc.next();


                     if (s.length() % 2 == 1) {

                         for (int i = 0; i <= s.length() / 2; i++) {
                             storeven = storeven + s.charAt(2 * i);
                         }
                         for (int i = 0; i < s.length() / 2; i++) {
                             storeOdd = storeOdd + s.charAt(2 * i + 1);
                         }
                     } else {


                         for (int i = 0; i < s.length() / 2; i++) {
                             storeven = storeven + s.charAt(2 * i);
                             storeOdd = storeOdd + s.charAt(2 * i + 1);

                         }
                     }
                     System.out.print(storeven);
                     System.out.print("  ");
                     System.out.print(storeOdd);
                     System.out.println();

                     storeven = "";
                     storeOdd = "";

                 }

    }
}
