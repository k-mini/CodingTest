import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for (int[] query : queries) {
            int idx1 = query[0];
            int idx2 = query[1];
            StringBuilder tmp = new StringBuilder();
            for (int j = idx2; j >= idx1  ; j-- ) {
                tmp.append(my_string.charAt(j));
            }
            
            // System.out.println(tmp);    
            my_string = my_string.substring(0, query[0]) 
                + tmp.toString() + my_string.substring(query[1] + 1);
            
            // System.out.println(my_string);
            
            // System.out.println();
        }
        
        return my_string;
    }
}