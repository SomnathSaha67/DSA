class Solution:
    def gcd(self, a, b):
        # code here
        if b==0:
            return a
        return self.gcd(b, a%b)
        

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna