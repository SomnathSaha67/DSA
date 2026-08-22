class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for (int i:nums){
            if(((int)Math.log10(i)+1)%2==0){
                c++;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna