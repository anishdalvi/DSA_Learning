/* Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * 
 */

public class Solve_EvenParity {

    public static int[] sortArrayByParity(int[] array){
        int j = 0;
        for(int i = 0; i < array.length; i++){
            
            if(array[i] % 2 == 1 ){
                int temp = array[i];
                array[i] = array[j]; 
                array[j] = temp;
                System.out.println("i:" +array[i]+ " j: "+ array[j]);
            }
           
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
