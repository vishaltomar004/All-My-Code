package stack_Question;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
//
//class Result {
//
//    /*
//     * Complete the 'isBalanced' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts STRING s as parameter.
//     */
//
//    public static String isBalanced(String s) {
//        // Write your code here
//
//
//            Stack<Character> stack = new Stack<>();
//            boolean x = true;
//            for(int j = 0 ; j<s.length(); j++) {
//                char ch = s.charAt(j);
//
//                if(ch =='(' ||ch =='[' || ch =='{') {
//                    stack.push(ch);
//                    continue;
//                }
//                if(stack.isEmpty()) {
//                    x = false;
//                    break;
//                }
//                if(stack.isEmpty()) {
//                    x = false;
//                    break;
//                }
//                if(ch==')') {
//                    if(stack.peek() == '(') {
//                        stack.pop();
//
//                    } else {
//                        x = false;
//                        break;
//                    }
//                }
//                if(ch=='}') {
//                    if(stack.peek() == '{') {
//                        stack.pop();
//
//                    } else{
//                        x = false;
//                        break;
//                    }
//                }
//                if(ch==']') {
//                    if(stack.peek() == '[') {
//                        stack.pop();
//
//                    } else {
//                        x = false;
//                        break;
//                    }
//                }
//            }    if(!stack.isEmpty()) {
//                x = false;
//            }
//            if(x) {
//                return "Yes";
//            } else {
//
//                return "No";
//            }
//
//
//
//
//        }
//    }
//
//
//
//public class Brackets {
//    public static void main(String[] args) throws IOException{
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, t).forEach(tItr -> {
//            try {
//                String s = bufferedReader.readLine();
//
//                String result = Result.isBalanced(s);
//
//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}