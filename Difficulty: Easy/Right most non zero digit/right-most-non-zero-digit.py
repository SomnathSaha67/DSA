class Solution:
    def rightmostNonZeroDigit (self, arr):
        # code here 
        if 0 in arr: return -1
        res=c2=c5=1
        for x in arr:
            while x%2==0:x//=2;c2+=1
            while x%5==0:x//=5;c5+=1
            res=(res*(x%10))%10
        res=(res*pow(2,c2-c5,10))%10 if c2>c5 else (res*pow(5,c5-c2,10))%10
        return res or -1