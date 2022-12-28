package Questions;

import java.util.Scanner;

public class Two_D_Array_Hourglass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int col  = sc.nextInt();
        int rows = sc.nextInt();

        int sum1 = Integer.MIN_VALUE;
        int sum2 = 0;


        int[][] arr = new int[rows][col];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < col; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < col; j++) {

               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows - 2; i++) {
            for(int j = 0; j<col -2 ; j++) {


             sum2 = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                    arr[i+1][j+1] +
                    arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            System.out.println(sum2);
           sum1 = Math.max(sum1,sum2);
        }

        }

        System.out.println(sum1);


    }

  }


