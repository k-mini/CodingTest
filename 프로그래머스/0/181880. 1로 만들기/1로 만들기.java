import java.util.stream.*;
import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        
        answer = Arrays.stream(num_list)
            .map( i -> divide(i))
            .sum();
        
        
        return answer;
    }
    
    public int divide(int number) {
        int cnt = 0;
            
        while (number != 1) {
            cnt++;
            if (number % 2 == 0) 
                number =  number / 2;
            else
                number = (number - 1) / 2;
            
        }
        
        return cnt;
    }
    
}