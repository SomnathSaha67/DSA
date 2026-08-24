class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(0, findIndex(arr, x, true));
        ans.add(1, findIndex(arr, x, false));
        return ans;
        
    }
    public int findIndex(int[]arr, int target, boolean findFirstIndex){
        int start=0, end= arr.length-1, ans= -1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (target<arr[mid]){
                end= mid-1;
            }else if(target>arr[mid]){
                start= mid+1;
            }else{
                ans= mid;
                if (findFirstIndex){
                    end= mid-1;
                }else{
                    start= mid+1;
                }
            }
        }
        return ans;
    }
    
}
