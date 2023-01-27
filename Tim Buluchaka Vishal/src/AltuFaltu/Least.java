package AltuFaltu;
import java.util.Scanner;
public class Least {
    public static void main (String[] args)
    {
//        // your code goes here
//        Scanner sc = new Scanner(System.in);
//        int t =sc.nextInt();
//
//        while(t>0){
//            int N =sc.nextInt();
//            int K = sc.nextInt();
//
//            System.out.println(N%K);
//
//            t--;
//
//        }
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 1;
        int count =0;
        for(int i =0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                max = Math.max(max, count);
            }
            else {
                max = Math.max(max,count);
                count=0;
            }
        }
        System.out.println(max);
    }
}
