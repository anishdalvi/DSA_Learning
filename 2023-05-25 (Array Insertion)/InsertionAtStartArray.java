public class InsertionAtStartArray {
    public static void main(String[] args){

      int[] startArray = new  int[6];  

      for(int i = 1; i<4; i++){
        startArray[i] = i;
      }

      for(int j = 0; j<startArray.length; j++){
        System.out.print(startArray[j]+" ");
      }

      System.out.println(" ");

      for(int i = 3; i>=0; i--){
        startArray[i+1] = startArray[i];
      }

      startArray[0] = 8;

      for(int i = 0; i<startArray.length; i++){
        System.out.print(startArray[i]+" ");
      }

    };
}
