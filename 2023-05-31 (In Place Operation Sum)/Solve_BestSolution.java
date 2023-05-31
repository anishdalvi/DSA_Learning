public class Solve_BestSolution {
    public static int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                int temp=max;
                max=arr[i];
                arr[i]=temp;
            }
            else
                arr[i]=max;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] array = {17, 18, 5, 4, 6,1 };
        //int[] array = {-11, -18, 25, 1,16,5,8 };

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
