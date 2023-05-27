class Solution {
    public int findNumbers(int[] nums) {
        int count_number = 0;
        for(int i=0; i<nums.length;i++){
            if(findNumberOfDigit(nums[i]) % 2 == 0){
                count_number++;
            }
        }
        return count_number;
    }
    public int findNumberOfDigit(int n){
        int count_digit = 0;
        while(n>0){
            n = n / 10;
            count_digit++;
        }
        return count_digit;
    }
}