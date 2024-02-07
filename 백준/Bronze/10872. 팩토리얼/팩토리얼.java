import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        
        if (a == 0){
            System.out.println(1);
            System.exit(0);
        }

        long answer = LongStream.rangeClosed(1, a).reduce((x, y) -> x * y).getAsLong();
        System.out.println(answer);
    }
}