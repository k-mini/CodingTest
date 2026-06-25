import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start = -1;
        int end  = -1;
        
        for (int i= 0 ; i < arr.length ;i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        
        for (int i= arr.length-1 ; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        
        
        
        return start == -1 ? new int[]{-1} : IntStream.rangeClosed(start,end).map(i->arr[i]).toArray();
    }
}