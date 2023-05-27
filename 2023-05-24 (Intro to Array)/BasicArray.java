//import java.util.*;

class BasicArray {
    public static void main (String[] args){
        //Scanner sc = new Scanner(System.in);

        int[] array = new int[6];

        int length = 0;

        for(int i=1; i<=3; i++)
        {
            array[i] = i*i;
            length++;
        }

        System.out.println("Capacity "+ array.length);
        System.out.println("Length "+ length);
    }
}