// T = O(n)

public class Best_SortingArray {
    
    static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    
        System.out.println(" ");
    }


    public static int[] sortedSquares(int[] array) {
            int[] res = new int[array.length];
            int start = 0, end = array.length-1;
            int resIndex = array.length-1;
            
            while(start <= end){
                if(array[start]*array[start] > array[end]*array[end]){
                    res[resIndex--] = array[start]*array[start];
                    start++;
                }else{
                    res[resIndex--] = array[end]*array[end];
                    end--;
                }
            }
        
            return res;
    }

    public static void main(String[] args)
    {
        int[] array = {-4,2,1,5,-3,6};
        printArray(array);
        int[] result = sortedSquares(array);
        printArray(result);  
    };
 
}
