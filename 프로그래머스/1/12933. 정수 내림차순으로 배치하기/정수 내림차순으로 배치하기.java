import java.util.stream.*;
import java.util.*;
class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        int[] array = str.chars().map(Character::getNumericValue)
                .sorted()
                .toArray();
        String answer = Arrays.stream(array).mapToObj(String::valueOf)
                            .sorted(Collections.reverseOrder()).collect(Collectors.joining());
        return Long.valueOf(answer);
    }
}