class EvenDigitsJaani {
   
       static int findNumbers(int[] nums) {
            int result = 0;
            int count;
            for(int n : nums) {
              count=0;
                while(n > 0) {
                    n /= 10;
                    count++;
                }
                if(count % 2 == 0) {
                    result++;
                }
            }
            return result;
        }

    
    public static void main(String[] args) {
        int[] nums = {10,12,345,5221,32,43};

        System.out.println(findNumbers(nums));
    }
}