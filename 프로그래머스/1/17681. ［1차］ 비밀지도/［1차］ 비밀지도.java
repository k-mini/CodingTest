import java.util.*;
import java.util.stream.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i=0; i<n ;i++) {
            int tmp = arr1[i] | arr2[i] ;
            String binStr = Integer.toBinaryString(tmp);
            binStr = binStr.replace("0", " ").replace("1","#");
            binStr = " ".repeat(n - binStr.length()) + binStr;
            answer[i] = binStr;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}