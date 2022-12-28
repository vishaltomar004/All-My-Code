package AltuFaltu;
import java.util.Scanner;
public class Least {
    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();

        while(t>0){
            int N =sc.nextInt();
            int K = sc.nextInt();

            System.out.println(N%K);

            t--;

        }
    }
}
