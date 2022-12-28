package loops;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i+1; j++) {
                System.out.print("x "); }
            for(int k = 1; k<=i; k++) {
                System.out.print("    ");
            }        for(int l=1; l<=n-i+1; l++) {
                System.out.print("x ");
            }    System.out.println();

                }
                 for(int o=1; o<=5;o++) {
                     System.out.println();
                 }
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i;j++) {
                System.out.print("x ");
            }  for(int k = 1; k<=n-i+1; k++) {
                System.out.print("    ");
            }
              for(int l=1; l<=i; l++) {
                  System.out.print("x ");
              } System.out.println();
        }


    }
}

