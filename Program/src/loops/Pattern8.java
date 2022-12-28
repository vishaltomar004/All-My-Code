package loops;
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print("x ");
            }
                System.out.println();
        }
                  for(int k = 1; k<=n; k++) {
                      for(int l =1; l<=n-k; l++ ) {
                          System.out.print("x ");
                      }
                      System.out.println();
                  }
            }
        }


