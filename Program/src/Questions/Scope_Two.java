package Questions;

public class Scope_Two {

    public static void main(String[] args) {

        int[] a = {8,19,3,2,7};
        int n = a.length;
         int[] arr = new int[n*(n-1)];

         int result = 0;
         int Difference ;
        for(int i = 0 ; i<n;i++) {

            for (int j = 0; j < n ; j++) {

                Difference = a[i] - a[j];


                if (Difference < 0) {

                    result = Math.max(-Difference, result);
                } else {

                    result = Math.max(Difference, result);
                }


            }


        }
        System.out.println("lst Result "+ result);




//        for(int i = 0 ; i<n-1 ;i++) {
//            Difference = a[i] -a[i+1];
//            if(Difference < 0 ){
//
//                result = Math.max(-Difference,result);
//            } else {
//
//                result = Math.max(Difference,result);
//            }
//
//
//        }
//        System.out.println(result);



    }


}
