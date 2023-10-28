import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        return Arrays.stream(my_string.split("")).map(i->i.repeat(n)).collect(Collectors.joining())  ;
    }
}