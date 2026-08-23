class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        if (x<arr[0]){
            return -1;
        }
        int start=0;
        int end= arr.length-1;
        int ans= -1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]<=x){
                ans= mid;
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna