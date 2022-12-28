package Array_Question;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i<row ; i++) {
            for(int j= 0 ; j<col ; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int sum  = 0;

        for(int i = 0 ; i<row -2 ; i++){
            for(int j =0; j<col-2; j++) {

                 sum  = arr[i][j] +arr[i][j+1]+arr[i][j+2]
                                    +arr[i+1][j+1]+
                         arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                 System.out.println(arr[i][j]+ "+" +arr[i][j+1]+ "+" +arr[i][j+2]+
                                        "+"+arr[i+1][j+1]+"+"+
                         +arr[i+2][j] +"+" +arr[i+2][j+1]+ "+" +arr[i+2][j+2]);
System.out.println("this is sum "+ sum);
                maxSum = Math.max(maxSum,sum);
                System.out.println("This is "+ maxSum);
            }
        }


        System.out.println(maxSum);


    }

}
