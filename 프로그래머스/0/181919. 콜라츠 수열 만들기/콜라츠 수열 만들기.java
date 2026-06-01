import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        
        while(stack.peek() != 1) {
            int value = stack.peek();
            stack.push(value % 2 == 0? value / 2 : value * 3 + 1);
        } 
        
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}