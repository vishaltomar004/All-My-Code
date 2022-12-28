package stack_Question;

import java.util.Scanner;
import java.util.Stack;

public class Equal_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] h1 = new int[n1];
        int[] h2 = new int[n2];
        int[] h3 = new int[n3];

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        for (int i = 0; i < n1; i++) {
            h1[i] = sc.nextInt();

        }
        for (int i = 0; i < n2; i++) {
            h2[i] = sc.nextInt();
        }
        for (int i = 0; i < n3; i++) {
            h3[i] = sc.nextInt();
        }

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;


        for (int i = n1 - 1; i >= 0; i--) {
            int j = stack1.push(h1[i]);
            count1 = j + count1;

        }


        for (int i = n2 - 1; i >= 0; i--) {
            int k = stack2.push(h2[i]);
            count2 = k + count2;
        }
        for (int i = n3 - 1; i >= 0; i--) {
            int l = stack3.push(h3[i]);
            count3 = l + count3;
        }


        while(count1 != count2 || count2 != count3) {

            int Max = Math.max(count1,count2);

            int Max2 = Math.max(Max,count3);

            if(Max2 == count1) {
               int a= stack1.pop();
                count1 = count1 - a;


            }
            else if(Max2 == count2) {
                int b = stack2.pop();
                count2 = count2 - b;

            }
            else{
                int c =stack3.pop();
                count3 = count3 - c;

            }


    }
        System.out.println(count1);



}
    }


