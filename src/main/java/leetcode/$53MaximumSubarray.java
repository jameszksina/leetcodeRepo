package leetcode;

public class $53MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSun = nums[0];
        int curSum = nums[0];
        for(int i=1;i<nums.length;i++){
            curSum = Math.max(curSum+nums[i],nums[i]);
            maxSun = Math.max(curSum,maxSun);
        }
        return maxSun;
    }

    public static void main(String[] args) {
        int[] input = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(input));
    }

}
