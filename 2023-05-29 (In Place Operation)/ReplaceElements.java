public class ReplaceElements {
     
    static int[] replaceElements(int[] array){

        /* for(int i = 0; i < array.length - 1; i++){
            
        } */
        /* int i = 0;
        for( int j = 1; j < array.length - 1; j++){
            if (array[j] > array[j+1]){

                array[i] = array[j];
                i++;

                if( j == array.length - 1){
                    array[i] = -1;
                }
            }

        } */
        int size = array.length;
        int max_from_right = array[size-1];

        array[size-1] = -1;

        for(int i = size-2; i >= 0; i--){
            int temp = array[i];

            array[i] = max_from_right;

            if(max_from_right < temp){
                max_from_right = temp;
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
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
