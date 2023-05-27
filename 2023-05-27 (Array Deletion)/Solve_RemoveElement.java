public class Solve_RemoveElement {

    static int count = 0;

    static int RemoveNums(int[] nums, int val){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count++] = nums[i];
                // or
                // nums[count] = nums[i];
                // count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = {3,2,2,1,3,4};
        int val = 3;
        System.out.println("Result: "+ RemoveNums(nums,val));
    };
}
