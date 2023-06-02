import java.util.Arrays;

public class Solve_HeightChecker{
    static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    
        System.out.println(" ");
    }

    static int heightChecker(int[] array){

        int count = 0;
    
        int[] expected = Arrays.copyOf(array,array.length);
        Arrays.sort(expected);

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

        int[] heights = {5,2,3,4,1,3,15,4,2};
        
        int result = heightChecker(heights);   

        System.out.println("Count is " + result);
    };
}