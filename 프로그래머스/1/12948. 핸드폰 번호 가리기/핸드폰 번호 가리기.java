class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int cnt = phone_number.length();
        
        return "*".repeat(cnt - 4) + phone_number.substring(cnt-4);
    }
}