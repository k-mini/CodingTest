import java.util.*;
import java.util.stream.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int numSum = String.valueOf(x)
            .chars()
            .map(Character::getNumericValue)
            .sum();
        
        return x % numSum == 0 ? true : false;
    }
}