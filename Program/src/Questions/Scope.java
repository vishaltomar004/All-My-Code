package Questions;
import java.util.*;


class Difference {

    private int[] elements;
    public int maximumDifference;
    int result = 0;





    Difference( int[] elements) {
        this.elements = elements;
    }



    public int computeDifference(){


    for ( int i = 0; i<elements.length; i++){

        for(int j = 0 ; j<elements.length; j++) {


            maximumDifference = elements[i]- elements[j];
            if(maximumDifference<0) {
                result = Math.max(-maximumDifference, result);
            } else {

                result = Math.max(maximumDifference, result);
            }


         }

    }
    maximumDifference = result;
     return maximumDifference;
    }


    }





public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);

    }

    }

