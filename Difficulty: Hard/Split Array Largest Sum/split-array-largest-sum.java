class Solution {
    public int splitArray(int[] arr, int k) {
        // code here
        int start=0, end=0;
        for(int num:arr){
            start= Math.max(start, num);
            end+= num;
        }
        while(start<end){
            int mid= start+(end-start)/2;
            int sum=0, pieces=1;
            for (int num:arr){
                if (sum+num>mid){
                    sum= num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if (pieces>k){
                start= mid+1;
            }
            else{
                end= mid;
            }
        }
        return start;
    }
};