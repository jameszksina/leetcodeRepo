package leetcode;

import java.util.HashMap;
import java.util.Map;

public class $1TwoSum {
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int left = target-nums[i];
            if(map.containsKey(left)){
                return new int[]{map.get(left),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[2];
    }
}
