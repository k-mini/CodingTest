import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        return new StringBuilder(String.valueOf(n))
            .reverse()
            .toString()
            .chars()
            .map(Character::getNumericValue)
            .toArray();
    }
}