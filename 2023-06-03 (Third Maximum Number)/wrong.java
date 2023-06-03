class Solution {
    public int thirdMax(int[] nums) {
        int[] array = nums;
        int m1 = 0;
        int m2 = 0;
        int m3 = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > m1 && array[i] != m1){
                m3 = m2;
                m2 = m1;
                m1 = array[i];
                System.out.println(" m1 = "+m1);
                System.out.println(" m2 = "+m2);
                System.out.println(" m3 = "+m3);
            }
            else if(array[i] > m2 && array[i] != m1 ){
                    m3 = m2;
                    m2 = array[i];
            }
            else if(array[i] > m3 && array[i] != m1){
                m3 = array[i];
            }
        }

        if(m3 == 0 || m2 == 0){
            return m1;
        }

        return m3;
    }
   
    }