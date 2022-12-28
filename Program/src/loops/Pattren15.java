package loops;
import java.util.Scanner;
public class Pattren15 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++) {

            for(int k = 1; k<=n-i+2; k++) {
                System.out.print(" ");  }
            for(int j =1; j<=2*i-1; j++) {
                System.out.print(j);


            }  System.out.println();
        }

    }
}
