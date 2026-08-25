class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ele=-1;
        for (int[]row:matrix){
            if(target<row[0] || target>row[row.length-1])
                continue;
            if (binarySearch(row, target)!=-1)
                return true;
        }
        return false;
    }
    public int binarySearch(int[]arr, int target){
        int start=0, end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]<target)
                start= mid+1;
            else if(arr[mid]>target)
                end= mid-1;
            else
                return mid;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna