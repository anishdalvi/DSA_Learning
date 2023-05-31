public class InPlaceApproach2 {
    static int[] squareEven(int[] array, int length) {

        // Check for edge cases.
        if (array == null) {
          return array;
        }
      
        // Iterate through the original array.
        for(int i = 0; i < length; i++) {
      
          // If the index is an even number, then we need to square the element
          // and replace the original value in the Array.
          if (i % 2 == 0) {
            //array[i] *= array[i];
            array[i] = array[i]*array[i];
          }
          // Notice how we don't need to do *anything* for the odd indexes? :-)
        }
      
        // We just return the original array. Some problems on leetcode require you
        // to return it, and other's dont.
        return array;
      }

      public static void main(String[] args)
      {
        int[] array = {-3,1,4,2,-9,3,-2,5};
        int length = array.length;

        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] +" ");
        }

        System.out.println(" ");

        int[] result = squareEven(array,length);

        for(int i = 0; i<result.length; i++){
            System.out.print(result[i] +" ");
        }
      };
}
