package oops.exceptionalHandling;

import com.sun.source.tree.TryTree;

public class MainClass {
    public static void main (String[] args) {

        try {
        int a = 5;
        int b = 0;
        int c = b/a;
        System.out.println(a/b);
    } catch (ArithmeticException e) {
            System.out.println(e.getMessage()+" Occured, please check your code");
        } catch(IndexOutOfBoundsException e) {

            System.out.println(" index should be between range");

        } catch(IllegalAccessError e) {

System.out.println("Chal niklal no error ");
        }
        finally {
            System.out.println("jitoh hamesh ran hogo" );
        }


//        fun1();
    }
        static void fun1() {
            int a = 5;
            int b = 0;
            int c = a/b;
       System.out.println(c);
        }



}
