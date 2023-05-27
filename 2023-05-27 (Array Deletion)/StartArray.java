public class StartArray {
    public static void main(String[] args){

        int[] startArray = new int[6];
        int length = 0;

        for (int i = 0; i < startArray.length; i++){
            startArray[i] = length;
            length++;
        }

        // Printing the array
        for (int i = 0; i < startArray.length; i++){
            System.out.println("Index "+ i + " contains " + startArray[i]);
        }

        // Say we want to delete the element at index 1
        for (int i = 2; i < length; i++) {
            // Shift each element one position to the left
            startArray[i - 1] = startArray[i];
        }

        // Again, the length needs to be consistent with the current
        // state of the array.
        length--;

        // Printing the array
        for (int i = 0; i < length; i++){
            System.out.println("Index "+ i + " contains " + startArray[i]);
        }
    }
}
