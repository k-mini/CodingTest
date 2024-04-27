import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(int n) {
        String answer = "";
        
        int cnt = n / 2;
        
        return "수박".repeat(cnt) + (n % 2 != 0 ? "수" : "");
    }
}