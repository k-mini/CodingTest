import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        return my_string.chars()
            .mapToObj(i-> i == alp.charAt(0) ? String.valueOf((char)i).toUpperCase() :
                 String.valueOf((char)i))
            .collect(Collectors.joining());
    }
}