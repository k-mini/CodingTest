import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        for (int i=0; i < sizes.length ; i++) {
            int[] size = sizes[i];
            int iWidth = Math.max(size[0], size[1]);
            int iHeight = Math.min(size[0], size[1]);
            width = Math.max(iWidth, width);
            height = Math.max(iHeight, height);
            
        }
        
        return width * height;
    }
}