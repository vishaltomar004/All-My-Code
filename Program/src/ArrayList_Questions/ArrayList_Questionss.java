package ArrayList_Questions;

import java.util.ArrayList;

public class ArrayList_Questionss {
    public static void main(String[] args) {

        ArrayList <Integer> al = new ArrayList<>();
        al.add(120);
        al.add(120);
        al.add(120);
        al.add(120);
        al.add(120);
        System.out.println(al.size());
        for(int i = 0 ;i<al.size()-1; i++) {
            System.out.println(al.get(i));
        }

    }
}
