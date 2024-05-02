import java.util.*;
import java.util.stream.*;

class Solution {
    
    public int[] leftHand = new int[]{3,0};
    public int[] rightHand = new int[]{3,2};
    public static Map<String,int[]> numberMap = new HashMap<>();
        // Map.of("1", new int[]{0,0}, "2", new int[]{0,1}, "3", new int[]{0,2},
        //       "4", new int[]{1,0},  "5", new int[]{1,1}, "6", new int[]{1,2},
        //       "7", new int[]{2,0}, "8", new int[]{2,1}, "9", new int[]{2,2},
        //       "*", new int[]{3,0}, "0", new int[]{3,1}, "#", new int[]{3,2});
    static {
        numberMap.put("1", new int[]{0,0});numberMap.put("2", new int[]{0,1});numberMap.put("3", new int[]{0,2});
        numberMap.put("4", new int[]{1,0});numberMap.put("5", new int[]{1,1});numberMap.put("6", new int[]{1,2});
        numberMap.put("7", new int[]{2,0});numberMap.put("8", new int[]{2,1});numberMap.put("9", new int[]{2,2});
        numberMap.put("*", new int[]{3,0});numberMap.put("0", new int[]{3,1});numberMap.put("#", new int[]{3,2});
    }
    
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        for (int pad : numbers) {
            String padStr = String.valueOf(pad);
            int leftDistance = getDistance(leftHand, numberMap.get(padStr));
            int rightDistance = getDistance(rightHand, numberMap.get(padStr));
            // System.out.format("leftHand: [%d,%d] rightHand[%d,%d] %n",
            //                   leftHand[0],leftHand[1], rightHand[0],rightHand[1] );
            // System.out.format("pad: %s leftDistance: %s rightDistance: %s %n",
            //                   pad, leftDistance, rightDistance);
            // System.out.println();
            
            if (pad == 1 || pad == 4 || pad == 7) {
                answer.append("L");
                leftHand = numberMap.get(padStr);
                continue;
            }
            if (pad == 3 || pad == 6 || pad == 9) {
                answer.append("R");
                rightHand = numberMap.get(padStr);
                continue;
            }
            
            // 2 5 8 0
            if (rightDistance < leftDistance) {
                rightHand = numberMap.get(padStr);
                answer.append("R");
            }
            else if (leftDistance < rightDistance){
                leftHand = numberMap.get(padStr);
                answer.append("L");
            }
            if (rightDistance == leftDistance) {
                answer.append(String.valueOf(hand.charAt(0)).toUpperCase());
                if ("right".equals(hand)) {
                    rightHand = numberMap.get(padStr);
                }
                else {
                    leftHand = numberMap.get(padStr);
                }
            }
        }
        
        
        return answer.toString();
    }
    
    public int getDistance(int[] point1, int[] point2) {
        
        return (int)(Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]));
    }
}