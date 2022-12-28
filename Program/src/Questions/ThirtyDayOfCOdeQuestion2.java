package Questions;

import java.util.Scanner;

public class ThirtyDayOfCOdeQuestion2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i2= 4;
        Double d2 = 4.0;
        String s2 = "Hackerrank ";
       int i = sc.nextInt();
        Double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println(i+i2);
       System.out.println(d+d2);
        System.out.println(s2+""+s);
        System.out.println(s2.concat(" "+s));

    }
}
