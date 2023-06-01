class Solution {
    public void moveZeroes(int[] nums) {
        int[] array = nums;
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        int j = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != 0 && array[j] == 0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if(array[j] != 0){
                j++;
            }
        }
        System.out.println(" ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    
    }
}