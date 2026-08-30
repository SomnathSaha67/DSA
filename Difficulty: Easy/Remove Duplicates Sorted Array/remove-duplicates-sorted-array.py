class Solution:
    def removeDuplicates(self, arr):
        # code here 
        l= list(set(arr))
        l.sort()
        return l