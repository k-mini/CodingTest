import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int odd = IntStream.iterate(0, i -> i < num_list.length, i -> i + 2)
            .map(i -> num_list[i])
            .sum();
        
        int even = IntStream.iterate(1, i -> i < num_list.length, i -> i + 2)
            .map(i -> num_list[i])
            .sum();
        
        
        return Math.max(odd,even);
    }
}