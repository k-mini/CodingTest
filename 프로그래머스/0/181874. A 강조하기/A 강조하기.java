import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String myString) {
        String answer = "";
        return  myString.chars()
                .mapToObj(i -> i == 65 || i == 97 ?
                     "A" :
                     String.valueOf((char)i).toLowerCase())
                .collect(Collectors.joining());
    }
}