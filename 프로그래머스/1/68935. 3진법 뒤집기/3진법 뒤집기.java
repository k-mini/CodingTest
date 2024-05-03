class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String base3Number = getBase3(n);
        // System.out.println("base3Number: " + base3Number);
        String reversedBase3 = (new StringBuilder(base3Number)).reverse().toString();
        // System.out.println("reversedBase3: " + reversedBase3);
        answer = Integer.parseInt(reversedBase3, 3);
        
        return answer;
    }
    
    public String getBase3(int number) {
        StringBuilder answer = new StringBuilder();
        
        while (number != 0) {
            answer.append(number % 3);
            number = number / 3;
        }
        
        return answer.reverse().toString();
    }
}