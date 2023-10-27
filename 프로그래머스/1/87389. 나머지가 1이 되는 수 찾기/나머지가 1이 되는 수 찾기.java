import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        return IntStream.iterate(1, i->i<n,i->i+1)
            .filter(i-> n%i == 1)
            .findFirst().getAsInt();
    }
}