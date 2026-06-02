import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        
        for (String intStr : intStrs) {
            
            int number = Integer.parseInt(intStr.substring(s,s+l));
            
            if (number > k) {
             answer.add(number);   
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}