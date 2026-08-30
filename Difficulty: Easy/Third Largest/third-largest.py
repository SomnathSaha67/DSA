class Solution:
    def thirdLargest(self,arr):
        # code here
        if len(arr) == 2:
            return -1
        elif len(arr)==1:
            return -1
        else:
            arr.sort(reverse=True)
            return arr[2]