import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] d, int budget) {
        int cnt = 0;
        int spentBudget = 0;
        int[] ints = Arrays.stream(d)
            .sorted()
            .toArray();
        System.out.println(Arrays.toString(ints));
        for (int price : ints) {
            if ( spentBudget + price <= budget) {
                spentBudget += price;
                cnt += 1;
            }
            else {
                break;
            }
        }
        
        
        return cnt;
    }
}