import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Long> pMap = Arrays.stream(participant)
                         .collect(Collectors.groupingBy(i->i,Collectors.counting()) );
        //System.out.println("pMap : " +pMap);
        
        for (String s : completion) {
            Long put = pMap.put(s, pMap.get(s) - 1);
        }
        
        //System.out.println("pMap : " +pMap);

        return pMap.entrySet()
            .stream().filter(entry->entry.getValue().equals(1L)).map(entry->entry.getKey()).findAny().get();
    }
}