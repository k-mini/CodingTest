import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        Map<Integer, List<Integer>> graph = new HashMap<>();
        IntStream.rangeClosed(1,N)
                .forEach(i-> graph.put(i,new ArrayList<>()) );

        for (int i=0;i<M;i++){
            int[] arr = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

            graph.get(arr[0]).add(arr[1]);
            graph.get(arr[1]).add(arr[0]);
        }

        Deque<Integer> deque = new LinkedList<>();
        Boolean[] visited = new Boolean[N+1];
        for (int i=0;i<=N;i++){
            visited[i] = false;
        }
        visited[1] = true;
        deque.offerLast(1);

        while (!deque.isEmpty()){

            int now = deque.pollFirst();

            for (int nextNode : graph.get(now)) {

                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    deque.offerLast(nextNode);
                }
            }
        }

        int answer = Arrays.stream(visited)
                .mapToInt(i-> i.equals(true) ? 1 : 0 )
                .sum();
        System.out.println(answer-1);
    }
}