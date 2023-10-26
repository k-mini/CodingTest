import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        // return IntStream.iterate(1,i->i<=n,i->i+1).filter(i->n%i == 0).sum() ;
        
        return IntStream.iterate(1,i->i<=Math.sqrt(n),i->i+1)
            .filter(i-> n%i ==0)
            .map(i-> i + n/i)
            .sum() - (Math.sqrt(n) == (int) Math.sqrt(n) ? (int) Math.sqrt(n) : 0);
    }
}