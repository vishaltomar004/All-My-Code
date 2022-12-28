package Questions;
import java.io.*;
import java.util.*;

public class Interface_Divisor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = n;
        for(int i = 1; i<=n/2; i++){

            if(n%i ==0) {
                count = count +i;
            } else {
                continue;
            }
        }
        System.out.println(count);
    }
}










































































