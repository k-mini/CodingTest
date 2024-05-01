import java.util.*;
import java.util.stream.*;
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = LongStream.iterate(1,i->i<n+1,i->i+1)
            .map(i->i*x)
            .toArray();
        
        return answer;
    }
}