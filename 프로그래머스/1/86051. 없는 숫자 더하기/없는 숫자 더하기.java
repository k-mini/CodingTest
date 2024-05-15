import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        Set<Integer> numSet = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toSet());

        Set<Integer> zeroToTenSet = new HashSet<>(Set.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        answer = zeroToTenSet.stream()
                .filter(i-> !numSet.contains(i))
                .mapToInt(Integer::intValue)
                .sum();
        // System.out.println(answer);
        return answer;
    }
}