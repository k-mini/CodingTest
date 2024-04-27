import java.util.*;
import java.util.stream.*;

class Solution {
    static boolean answer = true;
    
    public boolean solution(String s) {
        
        int wordLength = s.length();
        if (wordLength != 4 && wordLength != 6) {
            return false;
        }
        
        s.chars()
            .forEach(i-> {
            // if ( (i >= 65 && i <= 90) || (i>= 97 && i <= 122) ) {
            if (!Character.isDigit(i)) {
                answer = false;
            }       
        });
        
        return answer;
    }
}