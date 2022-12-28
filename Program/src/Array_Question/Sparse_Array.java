package Array_Question;

import java.util.Scanner;

public class Sparse_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arrLen = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[arrLen];
        for(int i  = 0 ; i<arrLen; i++) {
            arr[i] = sc.nextLine();
        }

        int queLen = sc.nextInt();
        sc.nextLine();
        String[] q = new String[queLen];

        for(int i = 0 ; i<queLen; i++) {

            q[i]= sc.nextLine();
        }

        for(int i = 0 ; i<q.length; i++) {
            int count= 0;

            for(int j = 0 ; j<arrLen; j++) {

                if(q[i].equals(arr[j])) {
                    count++;

                } else {
                    continue;

                }
            } System.out.println(count);
            count = 0;
        }


    }
}
