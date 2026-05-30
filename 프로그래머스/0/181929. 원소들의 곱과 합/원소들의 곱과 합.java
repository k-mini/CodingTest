import java.util.stream.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0 ;

        int resultMultiple = IntStream.of(num_list)
                .reduce((a, b) -> a * b).getAsInt();

        int resultSquare = (int) Math.pow(IntStream.of(num_list)
                .reduce((a,b) -> a + b ).getAsInt(), 2);

        return resultMultiple < resultSquare ? 1 : 0;
    }
}