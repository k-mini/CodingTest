import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        sides = Arrays.stream(sides).sorted().toArray();
        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }
}