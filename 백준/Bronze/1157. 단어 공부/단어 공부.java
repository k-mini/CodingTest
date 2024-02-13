import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        Map<String, Integer> map =
                word.chars().mapToObj(i -> String.valueOf((char) i))
                        .map(String::toUpperCase)
                        .collect(Collectors.toMap(i -> i, i -> 1, Integer::sum));

        List<Map.Entry<String, Integer>> result = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        List<String> keyList = result.stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        List<Integer> valueList = result.stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        int valueSize = valueList.size();
        if (valueSize > 1
                && valueList.get(valueSize-1).equals(valueList.get(valueSize - 2)) ) {
            System.out.println("?");
        }
        else {
            System.out.println(keyList.get(valueSize-1));
        }

    }
}
