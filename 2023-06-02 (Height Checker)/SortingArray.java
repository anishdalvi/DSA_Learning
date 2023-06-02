import java.util.Arrays;

public class SortingArray{
    static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    
        System.out.println(" ");
    }

    static int heightChecker(int[] array){

        
        //int[] expected = array;
        int[] expected = Arrays.copyOf(array,array.length);
        int count = 0;
        
        for(int i = 0; i < expected.length; i++){
            for(int j = i+1; j < expected.length;j++){
                int temp = 0;
                if (expected[i] > expected[j]){
                    temp = expected[i];
                    expected[i] = expected[j];
                    expected[j] = temp;
                }
            }
        }
        printArray(array);
        System.out.println("After Sorting");
        printArray(expected);


        for(int i = 0; i < array.length; i++){
           
            if (array[i] != expected[i]){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){

        int[] heights = {5,2,3,4,1};
        
        int result = heightChecker(heights);   

        System.out.println("Count is " + result);
    };
}