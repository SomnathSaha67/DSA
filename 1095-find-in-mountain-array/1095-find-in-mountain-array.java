/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution{
  public int findInMountainArray(int target, MountainArray mountainArr){
    int n= mountainArr.length();
    int peak= findPeak(mountainArr, n);
    int firstTry= binarySearch(mountainArr, target, 0, peak, true);
    if (firstTry!=-1)
      return firstTry;
    return binarySearch(mountainArr, target, peak+1, n-1, false);
  }
  private int findPeak(MountainArray arr, int n){
    int start=0, end= n-1;
    while(start<end){
      int mid= start+(end-start)/2;
      if (arr.get(mid)<arr.get(mid+1))
        start= mid+1;
      else
        end= mid;
    }
    return start;
  }
  private int binarySearch(MountainArray arr, int target, int start, int end, boolean isAsc){
    int ans=-1;
    while(start<=end){
      int mid= start+(end-start)/2;
      int val= arr.get(mid);
      if (val==target){
        ans= mid;
        end= mid-1;
      } else if(isAsc){
        if(target<val)
          end= mid-1;
        else
          start= mid+1;
      } else{
        if(target<val)
          start= mid+1;
        else
          end= mid-1;
      }
    }
    return ans;
  }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna