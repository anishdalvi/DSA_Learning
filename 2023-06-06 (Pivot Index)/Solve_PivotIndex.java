class Solve_PivotIndex{
    static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println(" ");
    }

    public static int pivotIndex(int[] nums) {

      if(nums.length == 0) {
          return - 1;
      }

      int leftSum = 0, rightSum = 0;

      for(int i = 0; i < nums.length ; i++){
        rightSum = rightSum + nums[i];
      }

      // Enhanced For Loop

      /* for(int num : nums) 
          rightSum += num; 
      */

      for(int i = 0; i < nums.length; i ++) {
        //rightSum -= nums[i];
        rightSum = rightSum - nums[i];

        if(rightSum == leftSum){
            return i;
        }
        //leftSum += nums[i];
        leftSum = leftSum + nums[i];
      }
      
      return - 1;
    }

    public static void main(String[] args){
        int[] array = {1,2,3,5,3,1,2};
        printArray(array);
        int result = pivotIndex(array);
        System.out.println("Pivot Index: "+ result);
    }
}