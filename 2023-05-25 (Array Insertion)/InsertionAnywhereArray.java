public class InsertionAnywhereArray {
    public static void main(String[] args)
    {
        int[] anywhereArray = new  int[6];  

        //End Array

        for(int i = 0; i<4; i++){
          anywhereArray[i] = i+1;
        }
  
        for(int j = 0; j<anywhereArray.length; j++){
          System.out.print(anywhereArray[j]+" ");
        }
  
        System.out.println(" ");
        
        //Start Array

        for(int i = 3; i>=0; i--){
          anywhereArray[i+1] = anywhereArray[i];
        }
  
        anywhereArray[0] = 8;
  
        for(int i = 0; i<anywhereArray.length; i++){
          System.out.print(anywhereArray[i]+" ");
        }

        System.out.println(" ");

        // Anywhere

        for(int i = 4; i>=2; i--){
            anywhereArray[i+1] = anywhereArray[i];
          }
    
          anywhereArray[2] = 9;
    
          for(int i = 0; i<anywhereArray.length; i++){
            System.out.print(anywhereArray[i]+" ");
          }

    };
}
