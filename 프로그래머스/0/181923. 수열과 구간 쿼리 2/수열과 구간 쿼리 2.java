import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int j=0 ; j< queries.length ; j++) {
            int[] query = queries[j];
            int s = query[0];
            int e = query[1];
            int k = query[2];

            answer[j] = IntStream.rangeClosed(s,e)
                    .map(i -> arr[i])
                    .filter(x -> x > k)
                    .min()
                    .orElse(-1);
        }
        
        return answer;
    }
}