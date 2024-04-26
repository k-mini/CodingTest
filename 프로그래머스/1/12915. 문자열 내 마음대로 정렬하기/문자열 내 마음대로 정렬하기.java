import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        answer = Stream.of(strings)
                .sorted()
                .sorted((a,b) -> {
                    return a.charAt(n) - b.charAt(n);
                })
                .toArray(String[]::new);
        
        return answer;
    }
}