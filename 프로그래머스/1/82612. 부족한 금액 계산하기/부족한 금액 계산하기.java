import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(long price, long money, long count) {
        long answer = -1;
        
        long totalCharge = price * count * (1 + count) / 2 ;
        System.out.println(totalCharge);
        return money >= totalCharge ? 0 : totalCharge - money;
    }
}