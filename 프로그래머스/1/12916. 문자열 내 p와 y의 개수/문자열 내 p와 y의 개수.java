class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        int a = s.length() - s.replace("p","").length();
        int b = s.length() - s.replace("y","").length();
        return a == b ? true : false;
    }
}