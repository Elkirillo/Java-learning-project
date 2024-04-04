package main.java.learning.lessons;

public class Solution {
    public static void main (String[] args) {
        int[] nums = {4,3,2,6};
        System.out.println(new Solution().maxRotateFunction(nums));
        //System.out.println(instanceof nums);
    }
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int F = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F += i * nums[i];
        }

        int max = F;

        for (int i = n - 1; i > 0; i--) {
            F +=  sum - n * nums[i];
            max = Math.max(max, F);
        }
        return max;
    }

}
