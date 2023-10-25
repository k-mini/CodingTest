import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> answer = Arrays.stream(num_list)
            .mapToObj(Integer::valueOf)
            .collect(Collectors.toList());
        //System.out.println(answer);
        Collections.reverse(answer); 
        //System.out.println(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
            
    }
}