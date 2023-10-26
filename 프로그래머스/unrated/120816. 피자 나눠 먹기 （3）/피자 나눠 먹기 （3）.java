class Solution {
    public int solution(int slice, int n) {
        Double answer = Math.ceil( (double) n / slice );
        return answer.intValue();
    }
}