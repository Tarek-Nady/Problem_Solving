package leetcode;

import java.util.Arrays;

public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int ans = nums.length;
        for(int i=0;i<nums.length;i++){
            if(val==nums[i]){
                ans--;
                nums[i] = 100000;
            }
        }
        Arrays.sort(nums);
        return ans;
    }
}
