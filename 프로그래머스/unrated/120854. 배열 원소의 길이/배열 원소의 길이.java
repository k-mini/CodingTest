import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        return Arrays.stream(strlist).mapToInt(i->i.length()).toArray();
    }
}