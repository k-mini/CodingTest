import java.util.regex.*;
import java.util.*;

class Solution {
    public int solution(String dartResult) {

        Pattern p = Pattern.compile("([0-9]+)([SDT])([*#]?)");
        Matcher m = p.matcher(dartResult);
        int[] result = new int[3];
        int idx = 0;
        int count = m.groupCount();

        while (m.find()) {

            int score = Integer.parseInt(m.group(1));
            System.out.println("group = " + score);
            String bonus = m.group(2);
            System.out.println("bonus = " + bonus);
            if (bonus.equals("S")) {
                result[idx] = score;
            } else if (bonus.equals("D")) {
                result[idx] = (int) Math.pow(score,2);
            } else {
                result[idx] = (int) Math.pow(score,3);
            }

            String option = m.group(3);
            System.out.println("option = " + option);
            if (!option.isEmpty()) {
                if (option.equals("*")) {
                    result[idx] = result[idx] * 2;
                    if (idx >= 1) {
                        result[idx-1] = result[idx-1] * 2;
                    }
                } else {
                    result[idx] = result[idx] * (-1);
                }
            }
            System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
            idx ++;
            System.out.println();
        }

        int value = Arrays.stream(result).sum();
        System.out.println("value = " + value);
        return value;
    }
}