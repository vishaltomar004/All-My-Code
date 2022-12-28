package stack_Question;
import static java.util.stream.Collectors.joining;

import java.util.Scanner;
import java.util.Stack;


public class MaximumElement {
   public static void main(String[] args) {

       Stack<Integer> stack = new Stack<>();
       Stack<Integer> maxStack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++) {
        int input = sc.nextInt();
       switch(input) {

           case 1:
               int x = sc.nextInt();
               stack.push(x);
               if(maxStack.isEmpty() || x>=maxStack.peek()) {
                   maxStack.push(x);
               } break;
           case 2:
              int y =  stack.pop();
               if(y == maxStack.peek()) {
                   maxStack.pop();
               }
               break;
           case 3:
               System.out.println(maxStack.peek());
               break;
           default: break;

       }
   }
        sc.close();
   }



}

