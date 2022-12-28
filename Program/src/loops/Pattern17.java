package loops;
import java.util.Scanner;
  public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            for(int j =1; j<=n; j++)  {
                System.out.print("  ");
            }  System.out.println("  x");

            for(int i = 1; i<=n-2;i++) {
                for(int j =1; j<n-i+1; j++) {
                    System.out.print(" ");
                }  System.out.print("X");
                 for(int k =1;k<=i; k++) {
                     System.out.print("   ");
                 }  System.out.println(" X");
            }


            for (int j = 1; j<=n; j++) {
                System.out.print("X  ");

        }

    }
}
