class Solution {
    public String solution(String s) {
        String answer;

        int cnt = s.length();
        if (cnt % 2 == 0) {
            char value = s.charAt(cnt / 2 - 1);
            char value2 = s.charAt(cnt / 2 );
            answer = String.valueOf(value) + String.valueOf(value2);
        }
        else {
            char value = s.charAt(cnt/2 );
            answer = String.valueOf(value);
        }

        return answer;
    }
}