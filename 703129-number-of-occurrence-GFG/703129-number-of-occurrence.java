class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int first=firstOccurrence(arr, target);
        if(first==-1){
            return 0;
        }
        int last= lastOccurrence(arr, target);
        return last-first+1;
        
    }
    int firstOccurrence(int[]arr, int target){
        int start=0;
        int end= arr.length-1;
        int ans= -1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]== target){
                ans= mid;
                end= mid-1;
            }else if(arr[mid]<target){
                start= mid+1;
            }else{
                end= mid-1;
            }
        }
        return ans;
    }
    int lastOccurrence(int[]arr, int target){
        int start=0;
        int end= arr.length-1;
        int ans= -1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]== target){
                ans= mid;
                start= mid+1;
            }else if(arr[mid]<target){
                start= mid+1;
            }else{
                end= mid-1;
            }
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna