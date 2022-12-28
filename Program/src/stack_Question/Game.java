package stack_Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Game {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfGames = Integer.parseInt(br.readLine());
        for (int i = 0; i < numOfGames; i++) {
            String[] tmp = br.readLine().split(" ");
            int numOfElementsStackOne = Integer.parseInt(tmp[0]);
            int numOfElementsStackTwo = Integer.parseInt(tmp[1]);
            int limit = Integer.parseInt(tmp[2]);
            int sum = 0;
            int popCount = 0;

            Stack<Integer> stackOne = new Stack<Integer>();
            Stack<Integer> stackTwo = new Stack<Integer>();

            String[] stOne = br.readLine().split(" ");
            String[] stTwo = br.readLine().split(" ");

            for (int k = numOfElementsStackOne - 1; k >= 0; k--) {
                stackOne.push(Integer.parseInt(stOne[k]));
            }

            for (int j = numOfElementsStackTwo - 1; j >= 0; j--) {
                stackTwo.push(Integer.parseInt(stTwo[j]));
            }

            while (sum <= limit) {
                int pk1 = 0;
                int pk2 = 0;
                if (stackOne.isEmpty()) {
                    sum = sum + stackTwo.pop();
                    popCount++;
                } else if (stackTwo.isEmpty()) {
                    sum = sum + stackOne.pop();
                    popCount++;
                }
                else if (!stackOne.isEmpty() && !stackTwo.isEmpty()) {
                    pk1 = stackOne.peek();
                    pk2 = stackTwo.peek();

                    if (pk1 <= pk2) {
                        sum = sum + stackOne.pop();
                        popCount++;
                    } else {
                        sum = sum + stackTwo.pop();
                        popCount++;
                    }
                } else if(stackOne.isEmpty() && stackTwo.isEmpty()){
                    break;
                }
            }

            int score = (popCount>0)?(popCount-1):0;
            System.out.println(score);
        }
    }
}

