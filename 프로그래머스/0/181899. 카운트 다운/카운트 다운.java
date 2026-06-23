import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        
        
        answer =Stream.iterate(start_num, i-> i >= end_num, i-> i-1)
            .mapToInt(i->i)
            .toArray();
        
        return answer;
    }
}