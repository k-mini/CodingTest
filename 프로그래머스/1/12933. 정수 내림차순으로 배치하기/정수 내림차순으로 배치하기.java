import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String result = String.valueOf(n)
                .chars()
                .mapToObj(i -> Integer.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());
        return Long.valueOf(result).longValue();
    }
}