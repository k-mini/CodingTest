import java.util.*;
import java.util.stream.*;

class Solution {
    public Long[] solution(long n) {
        List<Long> answer = new ArrayList<>();
        while (n > 0){
            answer.add(n%10);
            n /= 10;
        }
        return answer.stream().toArray(Long[]::new);
    }
}