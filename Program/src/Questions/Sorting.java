package Questions;

import java.util.Scanner;



public class Sorting {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] a = new int[n];

   for(int i = 0; i<n; i++) {
        a[i]= sc.nextInt();

   }
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean sorted = true;



            for (int j = 0; j < n - 1-i; j++) {

                if (a[j + 1] < a[j]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    swapCount++;
                    sorted = false;
                }
            }
            if(sorted) break;
        }

        for(int i = 0; i<n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Array is sorted in "+ swapCount+ " swaps.");

        System.out.println(a[1]);


    }

}
