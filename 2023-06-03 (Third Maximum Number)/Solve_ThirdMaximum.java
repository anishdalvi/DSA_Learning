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

    public static void main(String[] args){
        int[] array = {1,2,3,5,3,1,2};
        printArray(array);
        int result = findThirdMax(array);
        System.out.println("Answer: "+ result);
    }
}