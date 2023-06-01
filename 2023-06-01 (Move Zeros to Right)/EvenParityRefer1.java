public class EvenParityRefer1 {

    public static int[] sortArrayByParity(int[] array){
       
        int start = 0, end = array.length - 1;

        while (start < end) {
            if (array[start] % 2 == 0) {
                start++;
            } else {
                int tmp = array[end];
                array[end] = array[start];
                end--;
                array[start] = tmp;
            }
        }
        return array;
    }
    public static void main(String[] args)
    {

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
