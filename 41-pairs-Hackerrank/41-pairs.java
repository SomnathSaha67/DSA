class Result {

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int pairs(int k, List<Integer> arr) {
    // Write your code here
        HashSet<Integer> set= new HashSet<>(arr);
        int count=0;
        for (int num:arr){
            if (set.contains(num+k))
                count++;
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna