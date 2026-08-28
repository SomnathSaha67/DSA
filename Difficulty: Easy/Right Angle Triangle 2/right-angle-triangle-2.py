class Solution:
    def printPattern(self, n):
        # First row
        print("*")
    
        # Middle rows
        for i in range(2, n):
            print("*" + " " * (2 * (i - 2) + 1) + "*")
    
        # Last row
        if n > 1:
            print("* " * n)