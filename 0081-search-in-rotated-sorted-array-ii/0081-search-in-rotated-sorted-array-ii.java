class Solution {
    public boolean search(int[] nums, int target) {
        int start=0, end= nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (nums[mid]==target)
                return true;
            if (nums[start]==nums[mid] && nums[mid]==nums[end]){
                start++;
                end--;
            }
            else if(nums[start]<=nums[mid]){
                if (target>=nums[start] &&target<nums[mid])
                    end= mid-1;
                else
                    start= mid+1;
            }
            else{
                if (target>nums[mid] && target<=nums[end])
                    start= mid+1;
                else
                    end= mid-1;
            }
        }
        return false;
    }
    int findPivot(int[]arr){
        int start=0, end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (mid<end && arr[mid]>arr[mid+1])
                return mid;
            if (mid>start && arr[mid]<arr[mid-1])
                return mid-1;
            if (arr[mid]==arr[start] && arr[mid]==arr[end]){
                if (arr[start]>arr[start+1])
                    return start;
                start++;
                if (arr[end]<arr[end-1])
                    return end-1;
                end--;
            }
            else if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end]))
                start= mid+1;
            else
                end= mid-1;
        }
        return -1;
    }
    int binarySearch(int[]arr, int target, int start, int end){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target<arr[mid])
                end= mid-1;
            else if(target>arr[mid])
                start= mid+1;
            else
                return mid;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna