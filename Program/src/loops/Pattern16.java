package loops;
import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("x");
                for(int k =1; k<=n-2;k++) {
                    System.out.print("x");
                    for(int l=1; l<=k; l++) {
                        System.out.print("  ");
                    }  System.out.print("x");
                    System.out.println();
                }




        for(int i = 1; i<=n;i++) {
            System.out.print("x ");
        }

    }
}
