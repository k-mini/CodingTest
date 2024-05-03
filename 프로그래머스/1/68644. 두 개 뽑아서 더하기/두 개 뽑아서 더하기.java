import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();
        int nLength = numbers.length;
        
        IntStream.iterate(0,i -> i<nLength-1, i -> i+1)
            .forEach(i->{
                for (int j=i+1; j<nLength; j++)
                answer.add(numbers[i] + numbers[j]);
            });
        
        
        return answer.stream()
            .sorted()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}