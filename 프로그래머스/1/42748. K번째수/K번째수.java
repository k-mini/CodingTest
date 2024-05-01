import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int cnt = commands.length;
        int[] answer = new int[cnt];
        
        for (int idx=0; idx < cnt; idx++) {
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];
            
            int[] tmp = slice(array,i,j);
            Arrays.sort(tmp);
            answer[idx] = tmp[k-1];
        }
        
        return answer;
    }
    
    public int[] slice(int[] input,int start,int end) {
        int[] arr = new int[end-start+1];
        
        for (int i=start-1; i< end; i++){
            arr[i-start+1] = input[i];
            // System.out.println(input[i]);
        }
        // System.out.println();
        return arr;
    }
}