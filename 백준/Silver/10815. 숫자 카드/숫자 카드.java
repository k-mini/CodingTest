import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String,String> map = new HashMap<>();
        String[] arr = br.readLine().split(" ");
        
        for (int i=0;i<N; i++){
            map.put(arr[i],arr[i]);    
        }
        
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        
        for (String j : br.readLine().split(" ")){
            if (! map.getOrDefault(j, "").equals("")){
                sb.append("1 ");
            } else{
                sb.append("0 ");
            }
        }
        System.out.println(sb.substring(0, sb.toString().length()-1 ) );
        
    }
}