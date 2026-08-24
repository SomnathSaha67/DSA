
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
