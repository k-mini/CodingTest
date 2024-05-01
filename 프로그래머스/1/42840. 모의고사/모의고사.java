import java.util.*;
import java.util.stream.*;

class Solution {
    
    public static int[] people2NumArr = new int[]{1,3,4,5};
    public static int people2Idx = 0;
    
    public int[] solution(int[] answers) {
        int[] scores = new int[3];
        int problemCnt = answers.length;
        int[] people1 = IntStream.iterate(0, i-> i< answers.length, i-> i+=1)
                            .map(i-> {
                                return i = i % 5 + 1;
                            }).toArray();
        int[] people2 = IntStream.iterate(0, i-> i< answers.length, i-> i+=1)
                            .map(i-> {
                                return i = i % 2 == 0 ? 2 : people2NumArr[(people2Idx++ % 4)];
                            }).toArray();
        int[] people3 = IntStream.iterate(0, i-> i< answers.length, i-> i+=1)
                            .map( i -> {
                                if (i % 10 == 0 | i % 10 == 1) 
                                    return 3;
                                if (i % 10 == 2 | i % 10 == 3)
                                    return 1;
                                if (i % 10 == 4 | i % 10 == 5) 
                                    return 2;
                                if (i % 10 == 6 | i % 10 == 7)
                                    return 4;
                                if (i % 10 == 8 | i % 10 == 9) 
                                    return 5;
                                return 0;
                            }).toArray();
        // System.out.println(Arrays.toString(people1));
        // System.out.println(Arrays.toString(people2));
        // System.out.println(Arrays.toString(people3));
        
        for (int i=0; i < answers.length ; i++) {
            int answer = answers[i];
            if (answer == people1[i])
                scores[0] += 1;
            if (answer == people2[i])
                scores[1] += 1;
            if (answer == people3[i])
                scores[2] += 1;
        }
        
        System.out.println(Arrays.toString(scores));
        int maxValue = Arrays.stream(scores)
                            .max().getAsInt();
        
        
        return IntStream.range(0,3)
            .filter(i-> scores[i] == maxValue)
            .map(i-> i+1)
            .toArray();
        // return null;
    }
    
    
}



