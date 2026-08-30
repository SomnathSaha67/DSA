class Solution:

    def lessThan(self, arr, k):
        #code here
        lst= [e for e in arr if e<k]
        return lst