public class Solve_DuplicateZeroes {

    static int[] duplicateZeroes(int[] arr){

        for(int j = 0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }

        for(int i = 0; i < arr.length; i++){
            if( arr[i] == 0){
                for(int j = arr.length-1; j > i; j--){
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }

        System.out.println(" ");
        
        for(int j = 0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }

        return arr;
    }


    public static void main(String[] args)
    {
        int[] arr = {1,0,2,3,0,4,5};
        duplicateZeroes(arr);
    };
}
