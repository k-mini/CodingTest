import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer,Double> answer = new HashMap<>();
        
        Map<Integer, Long> stageMap = Arrays.stream(stages)
            .boxed()
            .collect(Collectors.groupingBy(i->i, Collectors.counting()));
        
        // System.out.println(stageMap);
            
        // Arrays.sort(stages);
        int total = stages.length;
        
        for (int i=1; i<= N; i++) {
            long cnt = stageMap.getOrDefault(i, 0L);
            if (cnt == 0) {
                answer.put(i, 0.0);
            }
            else {
                answer.put(i, (double)cnt / total);
                total -= cnt;
            }
        }
        
        return answer.entrySet().stream()
            .sorted(Comparator.comparingDouble(entry-> entry.getValue() * -1))
            .map(entry-> entry.getKey())
            .mapToInt(Integer::intValue)
            .toArray();
    }
}