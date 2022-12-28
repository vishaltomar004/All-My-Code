package RegexQuestion;

import java.util.*;

public class Duplicater_Words {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

while(n-- >0) {
    String s = sc.nextLine();
    String[] a = s.split(" ");
    Stack<String> stack = new Stack<String>();
    for (int i = a.length - 1; i >= 0; i--) {

        String lw = a[i].toLowerCase();
        if (stack.empty()) {
            stack.push(a[i]);
        } else if (lw.equals(stack.peek().toLowerCase())) {
            stack.pop();
            stack.push(a[i]);
        } else {
            stack.push(a[i]);
        }
    }


    while (!stack.empty()) {
        System.out.print(stack.pop()+" ");
    }


}

    }
}
