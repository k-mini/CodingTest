import java.util.*;
import java.util.stream.*;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        return Arrays.stream(arr).asDoubleStream()
            .average().getAsDouble();
    }
}