class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int start=0;
        int end= arr.length-1;
        int index=-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]==k){
               index= mid;
               end= mid-1;
            }
            else if (k<arr[mid]){
                end= mid-1;
            }
            else{
                start= mid+1;
            }
        }
        if (index!=-1){
            return index;
        }else{
            return -1;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna