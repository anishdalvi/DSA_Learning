public class Solve_DoubleN {
    public static boolean checkDouble(int[] arr) {
      
        for (int i = 0; i < arr.length; i++) {
           
            for (int j = 0; j < arr.length; j++) {
              
                if(i!=j){
                    
                    if(arr[i] == 2 * arr[j])
                    return true;    
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {25,2,5,7,4,5};

        System.out.println(checkDouble(arr));
    }
}
