import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patLength = pat.length();
        
        for (int i = myString.length() - pat.length(); i >= 0 ; i--) {
            
            String subStr = myString.substring(i, i + pat.length());
            // System.out.println(subStr);
            if (subStr.endsWith(pat))
                answer += 1;
        }
        
        return answer;
    }
}