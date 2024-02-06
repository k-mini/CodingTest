import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        list.stream().forEachOrdered(System.out::println);
    }
}