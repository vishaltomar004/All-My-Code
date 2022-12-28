package Questions;

import java.util.Scanner;

public class Bitwise {
    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxSum = sc.nextInt();
        int[] a = new int[N];

        for(int i =1; i<=N; i++){
            a[i]= i;
        }

        int sum = Integer.MIN_VALUE;
        int sum2 = 0;


        for(int i=0; i<N; i++) {

            for(int j=0;j<N;j++){
                if((a[i]&a[j]) <maxSum) {
                    sum2 = a[i]&a[j];

                }

            }
        }




    }
}
