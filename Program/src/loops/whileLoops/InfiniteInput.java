package loops.whileLoops;

import java.util.Scanner;

public class InfiniteInput {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        do {

             n = sc.nextInt();
             System.out.println( );
        } while( n !=0);
    }
}
