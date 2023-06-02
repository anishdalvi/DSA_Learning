import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] array = heights;
        int count = 0;
    
        int[] expected = Arrays.copyOf(array,array.length);
        Arrays.sort(expected);

        for(int i = 0; i < array.length; i++){
           
            if (array[i] != expected[i]){
                count++;
            }
        }

        return count;
    }
}