package leetcode;

import java.util.HashMap;

public class Length_of_Longest_Subarray_With_at_Most_K_Frequency {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            frequencyMap.put(nums[right], frequencyMap.getOrDefault(nums[right], 0) + 1);

            while (frequencyMap.get(nums[right]) > k) {
                frequencyMap.put(nums[left], frequencyMap.get(nums[left]) - 1);
                if (frequencyMap.get(nums[left]) == 0) {
                    frequencyMap.remove(nums[left]);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
