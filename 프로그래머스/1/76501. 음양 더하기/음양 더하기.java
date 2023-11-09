import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        
        return IntStream.range(0,absolutes.length)
                  .map(i-> absolutes[i] * (signs[i] == true ? 1 : -1) )
            .sum();
    }
}