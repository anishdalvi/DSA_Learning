/* Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
*/

import java.util.*;

public class Try{
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = nums;
        int n=arr.length; 
	   for(int i=0;i<n;i++)
	   {
	     int orgVal=Math.abs(arr[i]);
	     int idx=orgVal-1;
	     if(arr[idx]>0)
	       arr[idx]*=-1;
	   }
	   
	   List<Integer>al=new ArrayList<>();

	   for(int i=0;i<n;i++)
	     if(arr[i]>0)
	       al.add(i+1);
	   
	   return al;
    }

    public static void main(String[] args)
    {
        int[] nums = {1,3,4,2,4,1};
        System.out.println("Answer: "+ findDisappearedNumbers(nums));
            
    };
}