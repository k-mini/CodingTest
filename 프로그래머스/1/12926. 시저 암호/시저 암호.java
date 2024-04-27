class Solution {
    public String solution(String s, int n) {
        StringBuilder builder = new StringBuilder();

        for (int i=0; i< s.length(); i++){
            String ele = String.valueOf(s.charAt(i));
            if (ele.equals(" ")) {
                builder.append(" ");
                continue;
            }
            int codePoint = ele.codePointAt(0);
            int newCode = 0;
            // 대문자
            if (codePoint <= 90) {
                newCode = (codePoint - 65 + n) % 26 + 65;
            }
            else {
                newCode = (codePoint - 97 + n) % 26 + 97;
            }
            // System.out.println(newCode);
            builder.append((char)newCode);
        }

        return builder.toString();
    }
}