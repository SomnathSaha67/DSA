public static int divisibleSumPairs
    (int n, int k, List<Integer> ar) {
    // Write your code here
        int c=0;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if ((ar.get(i)+ar.get(j))
                %k==0)
                    c++;
            }
        }
        return c;
    }

}

public class Solution {
    public static void main(String[] args) 

     */
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     parameters:
     * The function accepts following 
     an INTEGER.
     * The function is expected to return 
     *

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna