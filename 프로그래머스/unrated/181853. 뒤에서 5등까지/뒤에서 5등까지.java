import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().limit(5).toArray();
        
        // int[] 반환 시
        // int[] answer = Arrays.stream(num_list).sorted().limit(5).toArray();
        // return answer;
    }
}