import java.util.*;
import java.util.stream.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long initValue = Long.valueOf(x);
        int idx = 0;
        while (idx < n){
            answer[idx++] = initValue;
            initValue += x;
        }
        
        return answer;
    }
}