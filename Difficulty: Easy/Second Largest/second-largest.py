class Solution:
    def getSecondLargest(self, arr):
        # code here
        a= set(arr)
        if len(a)<=1:
            return -1
        else:
            l= list(a)
            l.sort()
            return l[-2]
                