import java.util.*;
import java.util.stream.*;
class Solution {
    
    int[] arr2 = null;
    
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(arr)
                                .mapToObj(Integer::valueOf)
                                .collect(Collectors.toList());
        int start = 0;
        int end = arr.length - 1;
        arr2 = arr;
            
        for (int i=0; i < query.length; i++) {
            
            if (i % 2 == 0) {
                start = 0;
                end = query[i];
            } else {
                start =query[i];
                end = arr2.length - 1;
            }      
            arr2 = IntStream.rangeClosed(start,end).map(x-> arr2[x]).toArray();
            // System.out.println(Arrays.toString(arr2));
        }
        
        return arr2;
    }
}