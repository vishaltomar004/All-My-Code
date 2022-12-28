package Questions;

import java.util.Scanner;

public class ThirtyDaysOfCodeQuestion3 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        double meal = sc.nextDouble();
//        int percent = sc.nextInt();
//        int tip = sc.nextInt();
//
//        double result = (int)(meal+ meal/100 * percent + meal/100 * tip);
//        System.out.println(result);

   solve(10.25  ,17,5);
    }
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {

        // Write your code here

//        Scanner sc = new Scanner(System.in);
//        meal_cost = sc.nextDouble();
//        tip_percent = sc.nextInt();
//        tax_percent= sc.nextInt();

        double result = (meal_cost+ meal_cost/100 * tip_percent + meal_cost/100 * tax_percent);

        System.out.println(result);
        double remainder = result%1;

        System.out.println(remainder);
        if(remainder<0.5) {
            System.out.println((int)result);
        } else {
            System.out.println((int)result+1);
        }



    }
}
