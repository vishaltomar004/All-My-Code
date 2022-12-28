package MY_understanding_to_Inheritance;
import java.util.Scanner;

public class MainClass  {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        String firstName = sc.next();
        String lastName = sc.next();
        int id = sc.nextInt();
        int numScores = sc.nextInt();
        int[] testScores = new int[numScores];

        for(int i = 0; i < numScores; i++){
            testScores[i] = sc.nextInt();
        }

        Student s = new Student(firstName, lastName, id , testScores);
        s.printPerson();

        System.out.println("Grade: " + s.calculate() );

    }
}
