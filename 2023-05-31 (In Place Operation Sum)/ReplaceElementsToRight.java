public class ReplaceElementsToRight {

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
        
        return array;
    }
    
    public static void main(String[] args)
    {
        //int[] array = {17, 18, 5, 4, 6,1 };
        int[] array = {-11, -18, 25, 1,16,5,8 };

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }

        System.out.println(" ");

        int[] result = replaceElements(array);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+ " ");
        }

    
    };
}
