import java.util.*;
import java.util.stream.*;

class Solution {
    
    private int minCnt = 0;
    private long zeroCnt = 0;
    private Map<Integer, Integer> map =
        Map.of(6,1, 5,2, 4,3, 3,4, 2,5);
    
    public int[] solution(int[] lottos, int[] win_nums) {
        
        
        Set<Integer> winSet = Arrays.stream(win_nums)
                                    .mapToObj(Integer::valueOf)
                                    .collect(Collectors.toSet());
        
        zeroCnt = Arrays.stream(lottos)
                    .filter(i-> i==0)
                    .count();
            
        Arrays.stream(lottos)
            .forEach(i->{
                if (winSet.contains(i))
                    minCnt += 1;
            });
            
        // System.out.println("minCnt : " + (minCnt + zeroCnt) + ", zeroCnt : " + zeroCnt);
        // System.out.println(map);
        return new int[]{map.getOrDefault(Integer.valueOf(minCnt + (int) zeroCnt), 6) , map.getOrDefault(minCnt, 6) };
    }
}






