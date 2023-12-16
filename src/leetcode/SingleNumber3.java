package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber3 {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[]ans = new int[2];
        Arrays.fill(ans,-1);
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1)
            {
                if(ans[0]==-1) ans[0]=entry.getKey();
                else ans[1] = entry.getKey();
            }
        }
        return ans;
    }
}
