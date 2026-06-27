import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        return IntStream.iterate(0, i->i<todo_list.length, i-> i+1)
                    .filter(i-> finished[i] == false)
                    .mapToObj(i-> todo_list[i])
                    .toArray(String[]::new);
    }
}