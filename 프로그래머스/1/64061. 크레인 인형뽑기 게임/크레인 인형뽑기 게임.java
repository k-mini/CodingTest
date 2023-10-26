import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        Integer topDoll = null;
        
        for (int move : moves) {
            Integer doll = getDoll(move, board);
            
            if (doll.equals(0)){
                continue;
            }
            
            if ( !stack.empty() ){
                topDoll = stack.peek();
                if (doll.equals(topDoll)){
                    stack.pop();
                    answer += 2;
                    continue;
                }   
            }
            stack.push(doll);
        }
        return answer;
    }
    
    // 인형 가져오기
    public Integer getDoll(int move, int[][] board) {
        int colNum = move - 1;
        int length = board.length;
        for (int rowNum = 0; rowNum < length; rowNum++){
            if (board[rowNum][colNum] != 0){
                int result = board[rowNum][colNum];
                board[rowNum][colNum] = 0;
                return result;
            }
            continue;
        }
        return 0;
    }
}