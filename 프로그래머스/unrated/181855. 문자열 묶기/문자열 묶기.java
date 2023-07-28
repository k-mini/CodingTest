import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(String[] strArr) {
        
        return Arrays.stream(strArr)
                     .collect(Collectors.groupingBy(String::length))
                     .values()
                     .stream()
                     .max(Comparator.comparingInt(List::size))
                     .orElse(Collections.emptyList())
                     .size();
        
        /*        
        return Arrays.stream(strArr)
                    .collect(Collectors.groupingBy(String::length))
                    .values().stream()
                    .max(Comparator.comparingInt(List::size))
                    .orElse(Collections.emptyList()).size();

        Map<Integer, ArrayList<String>> map = new HashMap<>();
        
        for (String str : strArr){
            int len = str.length();
            if (map.containsKey(len)){
                map.get(len).add(str);
            } else{
                ArrayList<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(len,temp);
            }
        }
        
        int answer = 0;
        for (int len : map.keySet())
            answer = Math.max(answer,map.get(len).size());
        return answer;
        */
    }
}

