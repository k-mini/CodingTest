import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = num_list.length > 10 ?
                Arrays.stream(num_list).sum() :
                Arrays.stream(num_list)
                        .reduce((x,y) -> x*y).getAsInt();
        return answer;
    }
}