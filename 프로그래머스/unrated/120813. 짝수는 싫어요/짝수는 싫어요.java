import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        return IntStream.iterate(1, i-> i<=n,i -> ++i).filter(i-> i % 2 == 1).toArray();
    }
}