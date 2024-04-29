import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int cnt = 0;
        
        for (int i=0; i < s.length(); i++){
            String word = s.charAt(i) + "";
            
            if (word.equals(" ")) {
                answer.append(" ");
                cnt = 0;
                continue;
            }
            cnt++;
            if (cnt %2 == 0){
                answer.append(word.toLowerCase());
            }
            else {
                answer.append(word.toUpperCase());
            }
        }
        
        
        return answer.toString();
    }
}