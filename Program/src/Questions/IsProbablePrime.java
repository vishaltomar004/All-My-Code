package Questions;

import java.math.BigInteger;
import java.util.Scanner;

public class IsProbablePrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        if(n.isProbablePrime(1)) {
            System.out.println("prime");
        }  else{
            System.out.println("not prime");
        }

    }


}
