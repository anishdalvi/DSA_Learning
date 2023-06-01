public class EvenParityRefer2 {

    public static int[] sortArrayByParity(int[] array){

        for (int i = 0, j = 0; j < array.length; j++)
        if (array[j] % 2 == 0) {
            int tmp = array[i];
            array[i++] = array[j];
            array[j] = tmp;;
        }
        
        return array;
    }
    public static void main(String[] args)
    {
        //int[] array = { 3, 1, 2, 4 };
        int[] array = { 3, 1, 2, 4, 12, 3, 6, 9, 10, 14, 13, 15 };
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }  
        System.out.println("");
        int[] result = sortArrayByParity(array);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }   
    };
}
