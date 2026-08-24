
class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int sz= arr.size();
        for (int k=1; k<=sz/2; k++){
            int last= arr.remove(arr.size()-1);
            arr.add(0, last);
            int n= arr.size();
            int indexToDelete= n-k;
            arr.remove(indexToDelete);
        }
        return arr.get(0);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna