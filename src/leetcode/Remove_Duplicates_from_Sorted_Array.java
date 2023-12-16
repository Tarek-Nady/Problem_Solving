package leetcode;

import java.util.ArrayList;

public class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        for (int x=0;x<list.size();x++){
            nums[x] = list.get(x);
        }
        return list.size();

    }
}
