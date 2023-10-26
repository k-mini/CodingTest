import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        return IntStream.iterate(2,i->i<=n,i->i+2).sum() ;
    }
}