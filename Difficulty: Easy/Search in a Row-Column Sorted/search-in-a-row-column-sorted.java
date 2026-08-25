class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // code here
        int ele=-1;
        for (int[]row:mat){
            if (x<row[0] || x>row[row.length-1]){
                continue;
            }
            if(binarySearch(row, x)!=-1){
                return true;
            }
        }
        return false;
    }
    public static int binarySearch(int[]arr, int target){
        int start=0, end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target<arr[mid]){
                end= mid-1;
            }else if(target>arr[mid]){
                start= mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    } 
}