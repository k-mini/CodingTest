import java.util.stream.*;
import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]","");
        return Arrays.stream(my_string.split("")).mapToInt(Integer::valueOf).sum();
    }
}