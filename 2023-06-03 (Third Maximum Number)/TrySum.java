class Solve_ThirdMaximum{
    static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println(" ");
    }

    static int findThirdMax(int[] array){

        int m1 = 0;
        int m2 = 0;
        int m3 = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > m1 && array[i] != m1){
                int t1 = m1;
                int t2 = m2;
                int t3 = m3;
                m1 = array[i];
                m2 = t1;
                m3 = t2;
                System.out.println("t1 = "+ t1 + " m1 = "+m1);
                System.out.println("t2 = "+ t2 + " m2 = "+m2);
                System.out.println("t3 = "+ t3 + " m3 = "+m3);

                if(array[i] < m1 || array[i] == m1){
                    m3 = m2;
                    m2 = m1;
                }
                if(array[i] < m2 || array[i] == m2){
                    m3 = m2;
                }
            }
        }

        System.out.println("m1 = "+ m1);
        System.out.println("m2 = "+ m2);
        System.out.println("m3 = "+ m3);

        // if(m3 == 0 || m2 == 0){
        //     return m3;
        // }

        return m1;
    }

    public static void main(String[] args){
        int[] array = {1,2,3};
        printArray(array);
        int result = findThirdMax(array);
        System.out.println("Answer: "+ result);
    }
}