import java.util.stream.*;
import java.util.*;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a==b) 
            return a;
        
        return a < b ? LongStream.rangeClosed(a,b).sum() : LongStream.rangeClosed(b,a).sum(); 
    }
}