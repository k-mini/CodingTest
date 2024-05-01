import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

class Solution {
    public int solution(String dartResult) {
        String reg = "([0-9]+)([SDT])([*#]?)";
        int[] score = new int[3];

        Pattern p = Pattern.compile(reg);
        Matcher matcher = p.matcher(dartResult);
        int idx = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            // System.out.println("group = " + group);
            int nowScore = Integer.parseInt(matcher.group(1));
            String bonus = matcher.group(2);
            String option = matcher.group(3);

            // 보너스
            if (bonus.equals("S")) {
                score[idx] = nowScore * 1;
            }
            else if (bonus.equals("D")) {
                score[idx] = (int) Math.pow(nowScore,2);
            }
            else {
                score[idx] = (int) Math.pow(nowScore, 3);
            }

            // 옵션
            if (option.equals("*")) {
                if (idx != 0) score[idx-1] = score[idx-1] * 2;
                score[idx] = score[idx] * 2;
            } else if (option.equals("#")) {
                score[idx] = score[idx] * (-1);
            } else {
            }

            idx++;
        }

        // System.out.println(Arrays.toString(score));
        return Arrays.stream(score).sum();
    }
}