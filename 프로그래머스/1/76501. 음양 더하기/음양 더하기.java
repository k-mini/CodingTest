import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int cnt = absolutes.length;
        return IntStream.range(0, cnt)
            .map(i-> signs[i] ? absolutes[i] : -absolutes[i])
            .sum();
    }
}