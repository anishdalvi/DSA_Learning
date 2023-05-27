public class Solve_ConsecutiveOnes {
   public static void main(String[] args)
   {
    int count = 0;
    int result = 0;

    int[] nums = {1,0,0,0,1,1,1,0,1,1,1,1,1};

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            count = 0;
        } else {
            count++;
            result = Math.max(result,count);
        }
    }
    System.out.println("Consecutive 1s is "+ result);
   };
}
