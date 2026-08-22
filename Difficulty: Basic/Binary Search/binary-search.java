class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==k){
                return true;
            }
            if(k<arr[mid]){
                end= mid-1;
            }else{
                start= mid+1;
            }
        }
        return false;
    }
}