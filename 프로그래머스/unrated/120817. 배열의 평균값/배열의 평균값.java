import java.util.*;
import java.util.stream.*;

class Solution {
    public double solution(int[] numbers) {
        int length = numbers.length;
        return ((double) Arrays.stream(numbers).sum()) / length;
    }
}