class Solution {
    public int strStr(String haystack, String needle) {  
        if (needle.isEmpty()) {
            return 0;
        }  
        int hLen= haystack.length(), nLen= needle.length();
        for (int i=0; i<=hLen-nLen; i++){
            if (haystack.substring(i, i+nLen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna