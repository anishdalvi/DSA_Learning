import java.util.*; 

class Solution {
    public int[] sortedSquares(int[] nums) {
        int squared = 0;

        for (int i = 0; i < nums.length; i++) {
            squared = nums[i] * nums[i];
            nums[i] = squared;
        }
        Arrays.sort(nums);
        return nums;
    }
}