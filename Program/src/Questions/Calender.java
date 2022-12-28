package Questions;

import java.time.LocalDate;
import java.util.*;

public class Calender {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        LocalDate d = LocalDate.of(year, month, day);
        java.time.DayOfWeek dayOfWeek = d.getDayOfWeek();

//        System.out.println("Day of week in number:"+dayOfWeek.getValue());
        System.out.println(dayOfWeek.toString());
        }
    }

