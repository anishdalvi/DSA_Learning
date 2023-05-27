class EvenDigitsJK{
    public static int findNumbers(int[] nums){
        int count = 0;
        int result = 0;

        for(int i = 0; i < nums.length;i++){
            int n = nums[i];
            System.out.println("For : "+ n);
            while(n>0){
                n=n/10;
                count++;
            }

            if(count % 2 == 0){
                System.out.println("Count Value "+count);
                result++;
                System.out.println("Result Value "+result);
            }
            count = 0;
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] nums = {10,12,345,5221};
        System.out.println("-------------------------------------");
        System.out.println("This: "+ findNumbers(nums));
    };
}