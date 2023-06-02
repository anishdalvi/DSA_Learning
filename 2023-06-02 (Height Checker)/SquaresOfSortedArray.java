public class SquaresOfSortedArray {
    static void printArray(int[] array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    
        System.out.println(" ");
    }

    static int[] squareArray(int[] array){



        return array;
    }

    public static void main(String[] args){

        int[] array = {-4,-1,0,3,10};
        

        printArray(array);
        int[] result = squareArray(array);   

        printArray(result);
    };
}
