class Solution {
    void selectionSort(int[] arr) {
        // code here
        for (int i=0; i<arr.length-1; i++){
            int lastIndex= arr.length-i-1;
            int maxIndex= getMax(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }
    int getMax(int[]arr, int start, int end){
        int max= start;
        for (int i= start; i<=end; i++){
            if(arr[max]<arr[i])
                max= i;
        }
        return max;
    }
    void swap(int[]arr, int maxIndex, int lastIndex){
        int temp= arr[maxIndex];
        arr[maxIndex]= arr[lastIndex];
        arr[lastIndex]= temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna