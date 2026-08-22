class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0, end= nums.length-1;
        while(start<=end){
            if (nums[start+(end-start)/2] == target) {
                return start+(end-start)/2; 
            } else if (nums[start+(end-start)/2] < target) {
                start = start+(end-start)/2 + 1; 
            } else {
                end = start+(end-start)/2 - 1;  
            }
        }
        return start;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna