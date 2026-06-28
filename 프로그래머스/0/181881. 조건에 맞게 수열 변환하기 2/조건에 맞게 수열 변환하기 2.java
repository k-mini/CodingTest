import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        
        while (true) {
            answer += 1;
            boolean flag = false;
            for (int i=0; i < arr.length; i++) {
                
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                    flag = true;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                    flag = true;
                }
                
            }
            // System.out.println(Arrays.toString(arr));
            
            if (!flag)
                return answer - 1;
            
        }
        
        // return answer;
    }
}