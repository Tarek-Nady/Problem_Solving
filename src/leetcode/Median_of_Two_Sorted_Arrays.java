package leetcode;

public class Median_of_Two_Sorted_Arrays {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return FindMedianSortedArrays(nums2, nums1); // Ensure that nums1 is the shorter array
        }
        int left = 0;
        int right = m;
        while (left <= right) {
            int i = (left + right) / 2; // Calculate the midpoint of nums1
            int j = (m + n + 1) / 2 - i; // Calculate the corresponding midpoint of nums2
            if (i < m && nums2[j - 1] > nums1[i]) {
                left = i + 1; // Move the left pointer to the right to increase the median
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                right = i - 1; // Move the right pointer to the left to decrease the median
            } else {
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft; // Return the median if the total length of the arrays is odd
                }
                int minRight = 0;
                if (i == m) {
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums1[i], nums2[j]);
                }
                return (maxLeft + minRight) / 2.0; // Return the median if the total length of the arrays is even
            }
        }
        return 0.0;
    }
}
