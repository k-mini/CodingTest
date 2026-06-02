import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(String number) {
        int answer = 0;
        
        answer = Arrays.stream(number.split(""))
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue)
                .sum();
        
        return answer % 9;
    }
}