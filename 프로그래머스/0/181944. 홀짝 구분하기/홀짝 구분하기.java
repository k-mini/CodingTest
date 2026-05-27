import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = n % 2 == 0 ? "%d is even" : "%d is odd";
        
        System.out.printf(answer,n);
    }
}