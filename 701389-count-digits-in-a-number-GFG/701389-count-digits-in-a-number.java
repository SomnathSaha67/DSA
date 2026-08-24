class Solution {
    public static int countDigits(int n) {
        // Code here
        int c=0;
        while(n>0){
            n= n/10;
            c++;
        }
        return c;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna