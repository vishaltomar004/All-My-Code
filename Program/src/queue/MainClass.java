package queue;
import java.util.*;
public class MainClass {
public static void main(String[] args)
{
    Queue<Integer> q = new LinkedList<>();
    q.add(12);
    q.add(54);
    q.add(56);
    System.out.println(q);
    q.remove();
    q.remove();
            q.remove();

}}
