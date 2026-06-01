import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        answer = IntStream.rangeClosed(l,r)
                .filter(x-> x%5 == 0)
                .filter(x-> {
                    for(String word : String.valueOf(x).split("")) {
                        if (!word.equals("0") && !word.equals("5")) {
                            return false;
                        }
                    }
                    return true;
                })
                .toArray();

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}