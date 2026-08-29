class Solution:
    def combineStrings(self, a: str, b: str) -> str:
        # code here
        newstr=""
        if len(a)<len(b):
            newstr= a+b+a
        else:
            newstr= b+a+b
        return newstr
        

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna