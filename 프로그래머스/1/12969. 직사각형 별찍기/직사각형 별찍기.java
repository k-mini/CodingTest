import java.util.*;
import java.util.stream.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String answer = ("*".repeat(n) + "\n").repeat(m);
        System.out.println(answer);
    }
}