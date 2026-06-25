import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for (int[] interval : intervals) {
            
            Stream.iterate(interval[0], i -> i <= interval[1], i -> i + 1)
                .map(i -> arr[i])
                .forEach(i-> list.add(i));
            
            
        }        
        
        return list.stream().mapToInt(i->i).toArray();
    }
}