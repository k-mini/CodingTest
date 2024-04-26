import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        answer = s.chars()
                .sorted()
                .mapToObj(i -> (char)i + "")
                .sorted(Comparator.comparing(x-> -x.charAt(0)))
                .collect(Collectors.joining());

        return answer;
    }
}