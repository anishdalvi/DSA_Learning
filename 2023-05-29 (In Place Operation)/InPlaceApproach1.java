class InPlaceApproach1{
    public static int[] squareEven(int[] array, int length) {

    // Check for edge cases.
    if (array == null) {
        return null;
    }

    for(int i = 0; i < array.length; i++){
        System.out.print(array[i]+ " ");
    }

    // Create a resultant Array which would hold the result.
    int result[] = new int[length];

    // Iterate through the original Array.
    for(int i = 0; i < length; i++) {

        // Get the element from slot i of the input Array.
        int element = array[i];

        // If the index is an even number, then we need to square element.
        if (i % 2 == 0) {
        //element *= element;
        element = element * element;
        }

        // Write element into the result Array.
        result[i] = element;
    }

    // Return the result Array.
  return result;
}
    public static void main(String[] args){
        int[] array = {-1,5,3,-2,-6,8,-9};
        // { 1, 5, 9, -2 , 36, 8, 81 }
        int length = array.length;

        //System.out.println("Answer : "+ squareEven(array, length) );
        int[] result = squareEven(array, length);

        System.out.println(" ");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+ " ");
        }
    };
}