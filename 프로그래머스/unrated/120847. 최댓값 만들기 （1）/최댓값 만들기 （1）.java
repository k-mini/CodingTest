import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        numbers = Arrays.stream(numbers).sorted().toArray();
        return numbers[numbers.length - 1] * numbers[numbers.length - 2]  ;
    }
}