package AltuFaltu;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Stock {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){

            int s=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            double finalprice=s+(0.01*c*s);
            System.out.println(finalprice);
            if(finalprice>=a && finalprice<=b){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

            t--;
        }
    }
}
