package loops.whileLoops;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  temp=n;

        int reverseNumber = 0;

        while(temp>0) {
            int lastDigit=temp%10;

            reverseNumber = reverseNumber* 10 +lastDigit;

            temp = temp/10;

        }
        if(reverseNumber == n) {
            System.out.println( " yes");
        } else {
            System.out.println(" no");
        }
    }

}
