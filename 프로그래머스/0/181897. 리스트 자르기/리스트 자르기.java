import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.toList());
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        Stream<Integer> stream = null;

        switch(n) {
            case 1:
                stream = Stream.iterate(0, i -> i < b + 1, i -> i + 1);
                break;
            case 2:
                stream = Stream.iterate(a, i -> i < num_list.length, i -> i + 1);
                break;
            case 3:
                stream = Stream.iterate(a, i -> i < b + 1, i -> i + 1);
                break;
            case 4:
                stream = Stream.iterate(a, i -> i < b + 1, i -> i + c);
                break;
        }

        answer = stream.mapToInt(i-> num_list[i]).toArray();
        
        return answer;
    }
}