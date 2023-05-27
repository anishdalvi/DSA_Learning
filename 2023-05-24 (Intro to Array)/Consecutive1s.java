class Consecutive1s {

    static int count = 0;
    static int length = 0;
    

    static int findConsectives(int[] nums) {
        for (int i = 0; i< nums.length;i++) {
            if (nums[i] == 0) {
                count = 0;
            }
            else{
                count++;
                length = Math.max(length, count);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = { 1,0,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1};
        
        System.out.println("The Consecutive number of 1s are:" + findConsectives(nums));
    };
    
}


