class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int y = str.chars().map(s-> s - 48).sum();
        return x % y == 0 ? true : false;
    }
}