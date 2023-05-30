public class Solve_RemoveDuplicatesV2 {

    static int removeDuplicates(int[] array){

        if(array.length == 0){
            return 0;
        }

        int i = 0;

        for(int j = 1; j < array.length; j++){
            if(array[j] != array[i]){
                i++;
                array[i] = array[j];
            }
        }

        for(int j = 0; j < array.length; j++){
            System.out.println("Index "+ j + " contains "+ array[j]);
        }
        return i+1;
    }

    public static void main(String[] args){
        int[] array = {1,2,2,3,4,4,5,5};
        System.out.println("Answer:"+ removeDuplicates(array));
    }
}
