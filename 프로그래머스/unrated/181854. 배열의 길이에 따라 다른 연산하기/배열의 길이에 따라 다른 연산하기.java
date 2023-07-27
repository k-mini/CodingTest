import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr, int n) {
        
        // 짝수
        if (arr.length % 2 == 0){
            return IntStream.range(0, arr.length).map( i -> i % 2 != 0 ? arr[i]+n : arr[i] ).toArray();
        
        // 홀수
        } else { 
            return IntStream.range(0, arr.length).map( i -> i % 2 != 0 ? arr[i] : arr[i]+n ).toArray();
        }
        
        /*int[] answer = {};
        
        answer = IntStream.range(0,arr.length)
            .map( i -> arr.length % 2 != i % 2 ? arr[i] + n : arr[i] )
            .toArray();
        
        return answer;*/
    }
}