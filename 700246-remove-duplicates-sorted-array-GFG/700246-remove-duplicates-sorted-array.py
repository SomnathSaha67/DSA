class Solution:
    def removeDuplicates(self, arr):
        # code here 
        l= list(set(arr))
        l.sort()
        return l

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna