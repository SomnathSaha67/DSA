class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        if (x<arr[0]){
            return -1;
        }
        int start=0;
        int end= arr.length-1;
        int ans= -1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]<=x){
                ans= mid;
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return ans;
    }
}
