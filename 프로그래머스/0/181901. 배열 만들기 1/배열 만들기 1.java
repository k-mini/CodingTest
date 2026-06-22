import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        
        answer = IntStream.iterate(1, s -> s+1)
            .limit(n)
            .filter(i-> i%k ==0)
            .toArray();
            
        
        
        
        
        return answer;
    }
}