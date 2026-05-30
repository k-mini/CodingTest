import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int lastVal = num_list[num_list.length - 1];
        int preLastVal  = num_list[num_list.length - 2];
        int value = 0;
        
        if (lastVal > preLastVal) {
            value = lastVal - preLastVal; 
        } else {
            value = lastVal * 2;
        }
        
        List<Integer> list = Arrays.stream(num_list)
                                .boxed()
            .collect(Collectors.toList());
        
        list.add(value);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}