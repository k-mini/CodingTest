import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int minValue = Arrays.stream(arr)
                .min().getAsInt();

        int[] answer = IntStream.of(arr)
                .filter(i-> i != minValue)
                .toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}