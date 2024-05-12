import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(int left, int right) {
        int answer = 0;
        return IntStream.rangeClosed(left,right)
            .map(i-> {
                int tmp = getDivisorCnt(i);
                // System.out.println("tmp : " + tmp + ", i: " + i);
                return tmp % 2 == 0 ? i : -i;
            })
            .sum();
    }
    
    public int getDivisorCnt(int number) {

        if (number == 1)
            return 1;
        if (number == 2)
            return 2;
        int answer = 0;
        double limit = Math.sqrt(number);
        for (int i=1; i <= (int) limit ;i++) {
            if (number % i == 0)
                if (i*i != number)
                    answer += 2;
                else
                    answer += 1;
        }
        return answer;
    }
}