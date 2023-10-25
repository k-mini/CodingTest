import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int) Math.sqrt(n);
        
        for (int i =1; i <=sqrt; i++){
            System.out.printf("i : %d , n/i %d %n",i,n/i);
            if (n % i == 0){
                System.out.println(i);
                answer ++;
                if (n /i != i){
                System.out.println(n/i);
                answer ++;
                }
            }
            System.out.println();
        }
        
        return answer;
    }
}