import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "add" :
                    set.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove" :
                    set.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check" :
                    if (set.contains(Integer.parseInt(st.nextToken()))){
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                case "toggle" :
                    int value = Integer.parseInt(st.nextToken());
                    if (set.contains(value)) {
                        set.remove(value);
                    } else {
                        set.add(value);
                    }
                    break;
                case "all" :
                    set = IntStream.rangeClosed(1,20)
                            .mapToObj(Integer::valueOf)
                            .collect(Collectors.toCollection(HashSet::new));
                    break;
                case "empty" :
                    set = new HashSet<>();
                    break;
            }
        }

        System.out.println(sb.toString());
    }
}
