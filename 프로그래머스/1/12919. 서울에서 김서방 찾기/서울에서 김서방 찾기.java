import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        List<String> list = Stream
            .of(seoul)
            .collect(Collectors.toList());
        
        int idx = list.indexOf("Kim");
        
        return "김서방은 " + idx + "에 있다";
    }
}