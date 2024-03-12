import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = Stream.of(br.readLine().split(" "))
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());
        int minValue = list.get(0);
        int maxValue = list.get(N-1);
        StringBuilder sb = new StringBuilder();
        sb.append(minValue).append(" ").append(maxValue);
        System.out.println(sb.toString());
    }
}