import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        List<String> prefixes = new ArrayList<>();
        
        for (int i=0; i < my_string.length(); i++) {
            prefixes.add(my_string.substring(0,i+1));
        } 
        
        
        return prefixes.contains(is_prefix) ? 1 : 0;
    }
}