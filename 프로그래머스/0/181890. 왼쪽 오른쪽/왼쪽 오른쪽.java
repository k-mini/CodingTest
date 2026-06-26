import java.util.*;
import java.util.stream.*;
class Solution {
//     public String[] solution(String[] str_list) {
//         String[] answer = {};
//         int idx = -1;
//         for (int i=0;  i < str_list.length; i++) {
//             if (str_list[i].equals("l") ) {
//                 idx = i;
//                 answer =IntStream.range(0,idx).mapToObj(j -> str_list[j])
//                                         .toArray(String[]::new);
//                 break;
//             }
            
//             if ( str_list[i].equals("r")) {
//                 idx = i;
//                 answer =IntStream.range(idx+1 , str_list.length).mapToObj(j -> str_list[j])
//                                         .toArray(String[]::new);
//                 break;
//             }
//         }
        
//         return answer;
//     }
    
    public String[] solution(String[] str_list) {
         for (int i = 0; i < str_list.length; i++) {

            if ("l".equals(str_list[i])) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if ("r".equals(str_list[i])) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }

        return new String[0];
    }
}