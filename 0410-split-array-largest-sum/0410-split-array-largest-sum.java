class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0, end=0;
        for (int num:nums){
            start= Math.max(start, num);
            end+=num;
        }
        while(start<end){
            int mid= start+(end-start)/2;
            int sum=0, pieces=1;
            for (int num:nums){
                if(sum+num>mid){
                    sum= num;
                    pieces++;
                    if (pieces>k)
                        break;
                }else
                    sum+=num;    
            }
            if (pieces>k)
                start=mid+1;
            else
                end= mid;
        }
        return start;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna