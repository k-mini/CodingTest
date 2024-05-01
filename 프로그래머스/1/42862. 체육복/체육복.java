import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        int[] students = IntStream.iterate(0,i->i<n,i->i+1)
                            .map(i->1)
                            .toArray();
        
        IntStream.iterate(0,i->i<n,i->i+1)
            .forEach(i->{
                if (reserveList.contains(i+1)) {
                    students[i] += 1;
                }
                if (lostList.contains(i+1)) {
                    students[i] -= 1;
                }
            });
        // System.out.println(Arrays.toString(students));
        
        int studentCnt = students.length;
        for (int i=0; i<studentCnt;i++) {
            if (students[i] == 0) {
                if (i>0 && students[i-1] > 1) {
                    students[i-1] = 1;
                    students[i] = 1;
                }
                else if (i < studentCnt - 1 && students[i+1] > 1) {
                    students[i+1] = 1;
                    students[i] = 1;
                }
            }
        }
        System.out.println(Arrays.toString(students));
        return Arrays.stream(students)
                    .filter(i-> i > 0)
                    .count();
    }
}