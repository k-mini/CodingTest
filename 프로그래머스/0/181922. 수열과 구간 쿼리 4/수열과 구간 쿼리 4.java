import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for (int idx =0 ; idx < queries.length ; idx ++) {
            int[] query = queries[idx];
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            IntStream.rangeClosed(s,e)
                .filter(i -> i%k == 0)
                .forEach(i-> arr[i] += 1);
            
        }
        return arr;
    }
}