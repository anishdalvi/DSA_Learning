public class InsertionEndArray {
    public static void main(String[] args)
    {
        int[] endArray = new int[6];
        int length = 0;

        for(int i = 0; i < 3; i++){
            endArray[length] = i;
            length++;
        }

        // added 4th element at index 3
        endArray[length] = 10;
        length++;

        endArray[length] = 5;
        length++;

        for(int j = 0; j < endArray.length; j++){
            System.out.println("Index "+ j + " contains "+endArray[j]);
        }

    };
}
