class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        int dayDiff = 0;
        
        for (int i=0; i<a-1;i++) {
            dayDiff += month[i];    
        }
        dayDiff += b;
        
        
        return day[(dayDiff-1) % 7];
    }
}