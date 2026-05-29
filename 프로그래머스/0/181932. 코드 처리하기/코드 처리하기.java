class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        for (int i=0; i < code.length() ;i++) {
            String character = String.valueOf(code.charAt(i)); 
            
            if (character.equals("1")) {
                mode = mode == 1 ? 0 : 1;
                continue;
            }
            
            if (mode == 0 && i % 2 == 0) {
                ret += code.charAt(i);
            }
            
            if (mode == 1 && i % 2 == 1 ) {
                ret += code.charAt(i);
            }
            // System.out.println(ret);
        }
        
        return ret.isEmpty() ? "EMPTY" : ret ;
    }
}