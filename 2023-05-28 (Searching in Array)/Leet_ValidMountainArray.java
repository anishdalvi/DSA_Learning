class Solution {
    public boolean validMountainArray(int[] arr) {
        
        if (arr.length < 3) {
            return false;
        }

        int i = 0;

        // Check to see if the elements are in increasing order or not
        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Check to see if the center of the mountain is not at the start or end of the array
        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        // Check to see if the elements are in increasing order or not
        while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.length - 1;

    }
}