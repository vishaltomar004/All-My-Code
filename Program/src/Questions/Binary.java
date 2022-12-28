package Questions;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        String s = Integer.toBinaryString(t);
        System.out.println(s);

        char[] arr = s.toCharArray();
        System.out.println(arr[0] + " " + arr[1]);
        int n = arr.length;



        int count = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {


            if (Integer.parseInt(String.valueOf(arr[i]))== 0)
                count = 0;

            else {
                count++;
                result = Math.max(result, count);
            }
        }
        System.out.println(result);


} }
