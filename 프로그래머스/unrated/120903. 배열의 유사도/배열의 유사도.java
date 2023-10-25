import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> a = Arrays.stream(s1).collect(Collectors.toSet());
        Set<String> b = Arrays.stream(s2).collect(Collectors.toSet());
        a.retainAll(b);
        return (int) a.stream().count();
    }
}