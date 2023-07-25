class Solution {
    public String solution(int a, int b) {
        
        int[] day = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] dayOfWeek = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int answer = 0;
        for (int i=0; i < a-1; i++){
            answer += day[i];
            //System.out.println(answer);
        }
        answer += b - 1;
        //System.out.println(answer);
        return dayOfWeek[answer%7];
        
        
        /*
        String answer = "";
        int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] MM ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int Adate = 0;
        for (int i=0;i < a-1;i++)
            Adate += c[i];
        Adate += b-1;
        answer = MM[Adate%7];
        return answer;
        */
    }
}