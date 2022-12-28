package Questions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    if(n>1)  {
        int Factorial = 1;
         for(int i =n; i>1; i--) {
             Factorial= Factorial * i;

         }
        System.out.println(Factorial);   }
    else {
        System.out.println("1");
    }

    }
}
