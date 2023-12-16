package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Find_Common_Elements_Between_Two_Arrays {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < m; i++) {
            set2.add(nums2[i]);
        }
        int count1 = 0;
        for (int num : nums1) {
            if (set2.contains(num)) {
                count1++;
            }
        }
        int count2 = 0;
        for (int num : nums2) {
            if (set1.contains(num)) {
                count2++;
            }
        }
        return new int[] {count1, count2};

    }
}
