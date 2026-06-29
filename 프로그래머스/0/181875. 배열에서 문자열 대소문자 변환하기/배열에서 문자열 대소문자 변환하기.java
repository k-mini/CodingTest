import java.util.stream.*;
import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        return IntStream.iterate(0, i-> i < strArr.length, i -> i+ 1)
            .mapToObj(i-> i%2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
            .toArray(String[]::new);
    }
}