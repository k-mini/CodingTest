import java.math.*;
import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        // int answer = 0;
        boolean[] answer = new boolean[n+1];
        double limit = Math.sqrt(n);
        answer[0] = true;
        answer[1] = true;

        for (int i=2; i< limit;i++) {
            for (int j=i+i;j<=n;j+=i) {
                answer[j] = true;
            }
        }
        int cnt = 0;
        for (int i=0; i < answer.length; i++) {
            if (answer[i] == false) {
                cnt += 1;
            }
        }
        return cnt;
    }
}



