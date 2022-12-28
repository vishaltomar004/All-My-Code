//package Questions;
//import java.text.FieldPosition;
//import java.text.NumberFormat;
//import java.text.ParsePosition;
//import java.util.*;
//
//public class CurrencyFormatter {
//

//        static void printCurrency(Locale locale){
//            double dbl=10500.3245;
//            NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);
//            String currency=formatter.format(dbl);
//            System.out.println(currency+" for the locale "+locale);
//        }
//
//    public static void main(String[] args) {
//
//            printCurrency(Locale.UK);
//            printCurrency(Locale.US);
//            printCurrency(Locale.FRANCE);
//
//
//}
//}





//   Second Method

package Questions;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.text.NumberFormat.*;

public class CurrencyFormatter {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
       String India=  NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);

       System.out.println("US: "+NumberFormat.getCurrencyInstance(Locale.US).format(payment));
            System.out.println("CHINA: "+NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("FRANCE: "+NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
        System.out.println("INDIA: "+ India);


    }

}