package Questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneAFriend {
    public static void main(String[] args) {



        Map<String, Integer> myMap;
        myMap = new HashMap<String, Integer>();
        myMap = new LinkedHashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for(int i = 0; i<n; i++) {
             myMap.put(sc.next(), sc.nextInt());
         }
         while(n>0){
             String s = "";
             if (myMap.containsKey(s = sc.next())) {

                 System.out.println( s +"="+myMap.get(s));
             } else {
                 System.out.println("Not found");
             }
                     n =n-1;
         }
    }
}
