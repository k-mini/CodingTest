class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (int i=0; i < my_string.length();i++) {
            char word = my_string.charAt(i);
            
            if ((int) word < 97) {
                answer[(int)word - 65] += 1;
            } else {
                answer [(int) word - 97 + 26 ] += 1;
            }
            
        }
        
        
        return answer;
    }
}