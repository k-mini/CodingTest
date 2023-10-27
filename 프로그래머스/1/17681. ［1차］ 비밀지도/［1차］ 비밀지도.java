import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(long n, int[] arr1, int[] arr2) {
        String[] answer = new String[(int)n];
        String format = String.format("%05d", 123);
        System.out.println("format = " + format);
        long[] array1 = Arrays.stream(arr1).asLongStream().toArray();
        long[] array2 = Arrays.stream(arr2).asLongStream().toArray();
        List<String> convertedArr1 = convertMap(n, array1);
        List<String> convertedArr2 = convertMap(n, array2);

        for (int i = 0; i < n; i++) {
            String element1 = convertedArr1.get(i);
            String element2 = convertedArr2.get(i);
            answer[i] = matching(element1, element2);
        }
        //System.out.println("answer = " + Arrays.toString(answer));
        return answer;

    }

    public void test(Long i) {

    }

    private String matching(String element1, String element2) {
        int n = element1.length();
        System.out.println("element1 = " + element1);
        System.out.println("element2 = " + element2);
        System.out.println();
        return IntStream.range(0,n).mapToObj(i->{
            return element1.charAt(i) == '1' ||  element2.charAt(i) == '1' ? "#" : " ";
        }).collect(Collectors.joining());
    }

    private List<String> convertMap(long n, long[] arr1) {
        return Arrays.stream(arr1).mapToObj(Long::toBinaryString)
                .map(i -> String.format("%0" + n + "d", Long.valueOf(i)))
                .collect(Collectors.toList());
    }
}