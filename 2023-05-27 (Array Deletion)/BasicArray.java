class BasicArray {
    public static void main(String[] args){

        int[] array = new int[6];
        int length = 0;

        for (int i = 0; i < 6; i++){
            array[i] = length;
            length++;
        }

        int va1 = array.length;
         // Printing the array
        for (int i = 0; i < va1; i++){
            System.out.println("Index "+ i + " contains " + array[i]);
        }

        // deleting last element
        length--;
        System.out.println("After Deletion");

        va1--;
        // Printing the array
        for (int i = 0; i < va1; i++){
            System.out.println("Index "+ i + " contains " + array[i]);
        }


    }
}