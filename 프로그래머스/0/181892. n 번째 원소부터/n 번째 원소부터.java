import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = IntStream.rangeClosed(n - 1, num_list.length - 1)
            .map(i-> num_list[i])
            .toArray();
            
        return answer;
    }
}