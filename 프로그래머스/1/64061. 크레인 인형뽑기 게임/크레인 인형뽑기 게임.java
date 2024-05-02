import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int move : moves) {
            
            int doll = pickDoll(board, move);
            if (doll == -1) {
                continue;
            }
            // System.out.format("doll : %s %n", doll);
            // Arrays.stream(board)
            //     .forEach(e->{
            //         System.out.println(Arrays.toString(e));
            //     });
            // System.out.println();
            if (!stack.empty()  && stack.peek() == doll) {
                stack.pop();
                answer += 2;
            }
            else {
                stack.push(doll);
            }
        }   
                
        return answer;
    }
    
    public int pickDoll(int[][] board, int colIdx) {
        int colLength = board[0].length;
        int rowLength = board.length;
        colIdx -= 1;
        int answer = 0;
        for (int rowIdx=0; rowIdx < rowLength; rowIdx++) {
            
            if (board[rowIdx][colIdx] != 0) {
                answer = board[rowIdx][colIdx];
                board[rowIdx][colIdx] = 0;
                return answer;
            }
        }
        return -1;
    }
    
}






