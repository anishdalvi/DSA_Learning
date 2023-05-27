class Solve_RemoveDuplicates {
    static int RemoveDuplicates(int arr[], int a){

		if (a == 0 || a == 1)
			return a;
	
		int p = 0;
	
		for (int q = 0; q < a-1; q++){
			if (arr[q] != arr[q+1]){
				arr[p++] = arr[q];
            }
        }

		arr[p++] = arr[a-1];
        
		return p;
	}
	
	public static void main (String[] args){

		int arr[] = {2,3,4,4,5,6,6,6,7,8,8};
		int a = arr.length;
		
		a = RemoveDuplicates(arr, a);
		System.out.print(a);
	}
}