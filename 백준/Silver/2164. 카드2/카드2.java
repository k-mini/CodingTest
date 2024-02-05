import java.io.*;
import java.util.*;
import java.util.stream.*;


public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 1; i<=N ;i++) {
            deque.offerLast(i);
        }
        
        while (deque.size() != 1) {
            deque.pollFirst();
            deque.offerLast(deque.pollFirst());
        }
        System.out.println(deque.peek());
    }
}