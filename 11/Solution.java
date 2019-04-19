import java.util.*;
import java.lang.Math;

class Solution {
    public static int maxArea(int[] height) {
        int n = height.length;
        if (n == 0) return 0;
        int res = 0;
        int start = 0, end = height.length - 1;
        while (start < end) {
            res = Math.max(res, (end - start) * Math.min(height[start], height[end]));
            if (height[start] < height[end]) {
                ++start;
            } else {
                --end;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}