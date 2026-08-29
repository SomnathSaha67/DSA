class Solution:
    def combineStrings(self, a: str, b: str) -> str:
        # code here
        newstr=""
        if len(a)<len(b):
            newstr= a+b+a
        else:
            newstr= b+a+b
        return newstr
        