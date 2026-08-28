class Solution:
    def factorial(self, n: int) -> int:
        # code here
        mul=1
        while(n>0):
            mul*=n
            n-=1
        return mul

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna