class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max= Integer.MIN_VALUE;
        int maxSecond= Integer.MIN_VALUE;
        for (int ele:arr){
            if (ele>max){
                maxSecond= max;
                max= ele;
            }
            else if(ele>maxSecond && ele!=max){
                maxSecond= ele;
            }
        }
        return (maxSecond == Integer.MIN_VALUE) ? -1 : maxSecond;
    }
}