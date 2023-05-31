public class UniqueSolution {
    public static int[] replaceElements(int[] arr) {
        int mx = -1, n = arr.length, a;
        for (int i = n - 1; i >= 0; i--) {
            a = arr[i];
            arr[i] = mx;
            mx = Math.max(mx, a);
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
