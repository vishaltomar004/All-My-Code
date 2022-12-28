package Questions;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class ExceptionalHandling {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
try {
    String s = bufferedReader.readLine();

   int i =  Integer.parseInt(s);
   System.out.println(i);


} catch (Exception e) {

    System.out.println("Bad String");
}


        bufferedReader.close();


    }


}
