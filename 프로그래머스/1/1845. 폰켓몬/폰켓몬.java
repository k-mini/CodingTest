import java.util.*;
import java.util.stream.*;
    
class Solution {
    public int solution(int[] nums) {
        Set set = new HashSet();
        int total = nums.length;
            
        for (int x : nums) {
            set.add(x);
        }
        
        return Math.min(set.size(), total/2);
    }
}