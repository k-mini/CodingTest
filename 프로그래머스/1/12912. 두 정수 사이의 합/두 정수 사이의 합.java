import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a == b) {
            return a;
        }
        if (a > b) {
            int tmp = b;
            b = a;
            a = tmp;
        }
        
        answer = LongStream.rangeClosed(a,b)
            .sum();
        
        return answer;
    }
}