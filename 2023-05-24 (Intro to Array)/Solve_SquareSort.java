import java.util.*;

class Solve_SquareSort {
    static int[] sortedSquares(int[] nums) {
        int squared = 0;

        for (int i = 0; i < nums.length; i++) {
            squared = nums[i] * nums[i];
            nums[i] = squared;
        }

        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };

        sortedSquares(nums);
        
        for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
    }
}