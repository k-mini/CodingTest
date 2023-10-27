import java.util.*;
import java.util.stream.*;
import java.util.regex.*;

class Solution {
    
    public String solution(String new_id) {
        // 1단계
        String step1 = new_id.toLowerCase();
        System.out.printf("step1 : %s %n", step1);
        // 2단계
        String step2 = step1.replaceAll("[^a-z0-9-_.]","");
        System.out.printf("step2 : %s %n", step2);
        // 3단계
        String step3 =step2.replaceAll("[.]+", ".");
        System.out.printf("step3 : %s %n", step3);
        
        // 4단계
        String step4 = step3.replaceAll("^[.]|[.]$","");
        System.out.printf("step4 : %s %n", step4);
        
        // 5단계
        String step5 = step4.isEmpty() ? "a" : step4 ;
        System.out.printf("step5 : %s %n", step5);
        
        // 6단계
        String step6 = step5;
        if (step6.length() >= 16) {
            step6 = step6.substring(0,15);
            System.out.println("step6 중간 " + step6);
            if (Pattern.matches("^.*[.]$", step6)) {
                step6 = step6.substring(0,14);
                System.out.println("step6 중간 " + step6);
            }
        }
        System.out.printf("step6 : %s %n", step6);
        
        // 7단계
        String step7 = step6;
        
        if (step7.length() <= 2) {
            String lastChar = step7.charAt(step7.length()-1) + "";
            while (step7.length() < 3) {
                step7 += lastChar;
            }
        }
        System.out.printf("step7 : %s %n", step7);
        
        return step7;
    }
    
    
    
    public String solution2(String new_id) {
        String answer = "";
        // 1단계
        String step1 = new_id.toLowerCase();
        System.out.printf("1단계 : %s %n", new_id);
        // 2단계
        char[] step1_arr = step1.toCharArray();
        StringBuilder step2 = new StringBuilder();
        for (char c : step1_arr) {
            if  ((c>= 'a' && c <='z') || (c >= '0' && c <= '9') || c =='-' || c=='_' || c=='.') {
                step2.append(c);
            }
        }
            
        // 3단계
        String step3 = step2.toString().replace("..", ".");
        while (step3.contains("..")) {
            step3 = step3.replace("..",".");
        }
        
        // 4단계
        String step4 = step3;
        if (step4.length() > 0) {
            if (step4.charAt(0) == '.'){
                step4 = step4.substring(1,step4.length());
            }
        }
        if (step4.length() > 0) {
            if (step4.charAt(step4.length() - 1) == '.') {
                step4 = step4.substring(0, step4.length() - 1);
            }
        }
        // 5단계
        String step5 = step4;
        if (step5.equals("")){
            step5 = "a";
        }
        // 6단계
        String step6 = step5;
        if (step6.length() >= 16) {
            step6 = step5.substring(0,15);
            
            if (step6.charAt(step6.length()-1) == '.' ){
            step6 = step6.substring(0,14);
        }
        }
        // 7단계
        String step7 = step6;
        if (step7.length() <= 2){
            char lastChar = step7.charAt(step7.length()-1);
            while (step7.length() < 3) {
                step7 += String.valueOf(lastChar);
            }
        }
        
        return step7;
    }
}