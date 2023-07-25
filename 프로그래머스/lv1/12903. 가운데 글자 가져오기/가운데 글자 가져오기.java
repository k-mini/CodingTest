class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length();
        return n % 2 == 0 ? "" + s.charAt(n/2-1) + s.charAt(n/2) : s.charAt(n/2) + "";
    }
}