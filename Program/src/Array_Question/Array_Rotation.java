package Array_Question;

import java.util.Scanner;

public class Array_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i<n; i++) {
            a[i] = sc.nextInt();
        }


        while(d-- !=0) {

            int temp = a[0] ;
            for(int i = 0; i<a.length-1; i++) {
                a[i] = a[i+1];
            }
            a[a.length-1] =temp;
        }
        for(int e: a) {
System.out.println(e);
        }
    }
}
