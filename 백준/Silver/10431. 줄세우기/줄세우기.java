import java.io.*;
import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < P; i++) {
            int[] arr = Arrays
                    .stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int T = arr[0];
            LinkedList<Integer> list = IntStream.rangeClosed(1, 20)
                    .mapToObj(idx -> arr[idx])
                    .collect(Collectors.toCollection(LinkedList::new));

            LinkedList<Integer> line = new LinkedList<>();
            int answer = 0;

            for (Integer j : list) {
                boolean flag = true;
                if (line.isEmpty()) {
                    line.add(j);
                }
                else {
                    for (int k=0; k<line.size() ;k++) {
                        if (j < line.get(k)) {
                            answer += line.size() - k;
                            line.add(k,j);
                            flag = false;
                            break;
                        }
                    }
                    if (flag)
                        line.add(j);
                }
            }

            sb.append(T + " " + answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}

