class Solution:
    def factorial(self, n: int) -> int:
        # code here
        mul=1
        while(n>0):
            mul*=n
            n-=1
        return mul