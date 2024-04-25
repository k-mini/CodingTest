import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        
        for (int i=0; i< arr.length; i++) {
            if (i==0){
                answer.add(arr[i]);
                continue;
            }
            
            if (arr[i] == arr[i-1]) {
                continue;
            }
            else {
                answer.add(arr[i]);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}