class Solution {
    public int removeDuplicates(int[] nums) {
        int a = nums.length;
        
        if (a == 0 || a == 1)
			return a;
	
		int p = 0;
	
		for (int q = 0; q < a-1; q++){
			if (nums[q] != nums[q+1]){
				nums[p++] = nums[q];
            }
        }

		nums[p++] = nums[a-1];
        
		return p;
    }
}