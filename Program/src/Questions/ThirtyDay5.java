package Questions;

import java.io.*;
import java.util.*;
public class ThirtyDay5 {
    private int age;




    public ThirtyDay5(int initialAge) {
        if(initialAge > 0) {
            this.age= initialAge;
        } else{ age = 0;
            System.out.println("Age is not valid, setting age to 0.");

        }
        // Add some more code to run some checks on initialAge

    }

    public void amIOld() {
        if(age<13){
            System.out.println("You are young.");
        } else if(age>=13 && age <18) {
            System.out.println("You are a teenager.");
        } else {
        // Write code determining if this person's age is old and print the correct statement:
        System.out.println(/*Insert correct print statement here*/"You are old.");
    } }

    public void yearPasses() {
        // Increment this person's age.
        age = age +1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            ThirtyDay5 p = new ThirtyDay5(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();

        }
        sc.close();


    } }






