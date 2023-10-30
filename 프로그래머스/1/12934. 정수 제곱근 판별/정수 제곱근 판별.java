
class Solution {
    public long solution(long n) {
        long answer = 0;
        double number = (double) Math.sqrt(n);
        System.out.println(number);
        return number % 1 == 0 ? (long) Math.pow(number+1, 2) : -1 ;
    }
}