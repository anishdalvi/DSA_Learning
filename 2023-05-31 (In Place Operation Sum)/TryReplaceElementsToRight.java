public class TryReplaceElementsToRight {
    
    static int largest(int[] array,int length){

        int max = 0;
        
        for(int i = length+1; i<array.length; i++){

            if(array[i]>max){
                max = array[i];
            }
        }

        return max;
    }

    static int[] replaceElements(int[] array){

        int length = 0;

        for(int i = 0; i < array.length - 1; i++){
            
            array[i] = largest(array,length);
            length++;    
        }

        array[array.length-1] = -1;




        // Try 1

        /* int i = 0;
        int max_from_right = 0;

        for( int j = i+1; j < array.length - 1; j++){
            if (array[j] > array[j+1] || array[j] < array[j+1]){

                if(max_from_right<array[j]){
                    max_from_right = array[j];
                }

                if(max_from_right<array[j+1]){
                    max_from_right = array[j+1];
                }

                if( j == array.length - 1){
                    array[i] = -1;
                }

               
            }
        }
 */
        

        //System.out.println("Max from Right is "+ max_from_right);
        //System.out.println("Value of i "+ i);

        // Sol 1

        /* int size = array.length;
        int max_from_right = array[size-1];

        array[size-1] = -1;

        for(int i = size-2; i >= 0; i--){
            int temp = array[i];

            array[i] = max_from_right;

            if(max_from_right < temp){
                max_from_right = temp;
            }
        } */

        for(int i1 = 0; i1 < array.length; i1++){
            System.out.print(array[i1]+ " ");
        }
        
        
        return array;
    }
    
    public static void main(String[] args)
    {
        int[] array = {17, 18, 5, 4, 6,1 };
        int size = array.length;

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }

        System.out.println(" ");

        replaceElements(array);

        /* for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+ " ");
        } */
    };
}
