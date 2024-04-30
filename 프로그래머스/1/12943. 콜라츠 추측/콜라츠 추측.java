import java.util.*;
import java.util.stream.*;

class Solution {
    
    int cnt = 0;
    
    public long solution(long num) {
        // System.out.println(num);
        if (num == 1) {
            return cnt;
        }
        
        if (cnt == 500) {
            return -1;
        }
        
        if (num % 2 == 0) {
            num = num / 2;
        }
        else {
            num = num * 3 + 1;
        }
        
        cnt++;
        return solution(num);
    }
}



