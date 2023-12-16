package leetcode;

import java.util.Arrays;

public class Sum3_Closest {
    public int ThreeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array in ascending order
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize the closest sum to the sum of the first three elements
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Initialize the left pointer to the element after nums[i]
            int right = nums.length - 1; // Initialize the right pointer to the last element
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; // Calculate the sum of the three elements
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum; // Update the closest sum if the current sum is closer to the target
                }
                if (sum < target) {
                    left++; // Move the left pointer to the right to increase the sum
                } else if (sum > target) {
                    right--; // Move the right pointer to the left to decrease the sum
                } else {
                    return sum; // Return the sum if it's equal to the target
                }
            }
        }
        return closestSum; // Return the closest sum
    }
}
