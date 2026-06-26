import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        // 원소 개수 : num_list.length 개 
        // n-1 번 인덱스 이후(포함) -> num_list.length - n + 1
        // n-1 번 인덱스 이전 -> n - 2
        // System.out.println(Arrays.toString(answer));
        System.arraycopy(num_list, n, answer, 0, num_list.length - n);
        // System.out.println(Arrays.toString(answer));
        System.arraycopy(num_list, 0 , answer, num_list.length - n , n );
        // System.arraycopy(num_list, 0 , answer, 3 - 1 , 1 - 1 );
        // System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}