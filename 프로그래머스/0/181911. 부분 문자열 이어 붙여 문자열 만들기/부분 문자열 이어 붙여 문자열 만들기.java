class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for (int i =0 ;i < parts.length; i++) {
            int[] part = parts[i];
            String my_string = my_strings[i];
            answer += my_string.substring(part[0], part[1] + 1);
        }
        
        return answer;
    }
}