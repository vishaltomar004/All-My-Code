package oops.packages;


import oops.packages.models.*;

import java.util.Scanner;

public class MainClass {

    public static void main (String[] args) {

        Student obj = new Student("Tom");

        Teacher teacher = new Teacher();

        Scanner sc = new Scanner(System.in);


        System.out.println(obj.getPassword());
    }
}
