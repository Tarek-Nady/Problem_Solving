package leetcode;

public class container_with_most_water {
    public int MaxArea(int[] height) {
        int left = 0;
        int right = 0;
        int len = height.length;
        int start = 0;
        int end = len - 1;
        int ans = 0;
        while (start < end) {
            if (height[start] <= height[end]) {
                int d = height[start] * (end - start);
                start++;
                ans = Math.max(ans, d);
            } else {
                int d = height[end] * (end - start);
                end--;
                ans = Math.max(ans, d);
            }
        }

        return ans;
    }
}
