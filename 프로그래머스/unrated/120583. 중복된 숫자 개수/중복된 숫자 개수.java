import java.util.stream.*;
import java.util.*;

class Solution {
    public long solution(int[] array, int n) {
        int answer = 0;
        return Arrays.stream(array).filter(i->i==n).count();
    }
}