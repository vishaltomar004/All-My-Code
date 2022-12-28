package stack_Question;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i <t ; i++) {
            String s = sc.nextLine();

            Stack<Character> stack = new Stack<>();
            boolean x = true;
            for(int j = 0 ; j<s.length(); j++) {
                char ch = s.charAt(j);

                if(ch =='(' ||ch =='[' || ch =='{') {
                    stack.push(ch);
                   continue;
                }
                if(stack.isEmpty()) {
                    x = false;
                    break;
                }
                if(stack.isEmpty()) {
                    x = false;
                    break;
                }
                if(ch==')') {
                    if(stack.peek() == '(') {
                        stack.pop();

                    } else {
                        x = false;
                        break;
                    }
                }
                if(ch=='}') {
                    if(stack.peek() == '{') {
                        stack.pop();

                    } else{
                        x = false;
                        break;
                    }
                }
                if(ch==']') {
                    if(stack.peek() == '[') {
                        stack.pop();

                    } else {
                        x = false;
                        break;
                    }
                } 
                }    if(!stack.isEmpty()) {
                x = false;
            }
            if(x) {
                System.out.println("Yes");
            } else {

                System.out.println("No");
            }




        }
    }
}
