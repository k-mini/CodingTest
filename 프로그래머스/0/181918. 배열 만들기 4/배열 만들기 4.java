import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i =0;
        
        while (i < arr.length) {
            if (stk.size() == 0) {
                stk.push(arr[i++]);
                continue;
            }
            else if (stk.peek() < arr[i]) {
                stk.push(arr[i++]);
            } else {
                stk.pop();
            }
            
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}