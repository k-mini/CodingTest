import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        int n = a.length;
        return IntStream.iterate(0,i->i<n,i->++i )
            .map(i->a[i] * b[i])
            .sum();
    }
}