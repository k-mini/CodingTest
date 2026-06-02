import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        map.put(a, map.getOrDefault(a,0) + 1);
        map.put(b, map.getOrDefault(b,0) + 1);
        map.put(c, map.getOrDefault(c,0) + 1);
        map.put(d, map.getOrDefault(d,0) + 1);

        if (map.keySet().size() == 1) {
            answer = 1111 * a;
        }
        else if (map.keySet().size() == 2 && map.containsValue(3)) {
            Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
            int p = 0;
            int q = 0;

            for (Map.Entry<Integer, Integer> entry : entries) {
                Integer value = entry.getValue();
                if (value == 3) {
                    p = entry.getKey();
                } else {
                    q = entry.getKey();
                }
            }
            answer = (10 * p + q) * (10 * p + q);

        } else if (map.keySet().size() == 2 && map.containsValue(2)) {
            Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//            int p = 0;
//            int q = 0;
//
//            for (Map.Entry<Integer, Integer> entry : entries) {
//                Integer value = entry.getValue();
//                if (value == 2) {
//                    p = entry.getKey();
//                } else {
//                    q = entry.getKey();
//                }
//            }
            answer = map.keySet().stream()
                    .reduce((p,q) -> (p + q) * Math.abs(p - q)).get();
        } else if (map.keySet().size() == 3 && map.containsValue(2)) {
            Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//            int p = 0;
//            int q = 0;
//
//            for (Map.Entry<Integer, Integer> entry : entries) {
//                Integer value = entry.getValue();
//                if (value == 2) {
//                    p = entry.getKey();
//                } else {
//                    q = entry.getKey();
//                }
//            }
            answer = map.entrySet().stream()
                    .filter(entry -> entry.getValue() != 2)
                    .map(Map.Entry::getKey)
                    .reduce((q,r) -> q * r).get();
        } else {
            answer = map.keySet().stream()
                    .mapToInt(Integer::intValue)
                    .min()
                    .getAsInt();
        }


        return answer;
    }
}