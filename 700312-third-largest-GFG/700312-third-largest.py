class Solution:
    def thirdLargest(self,arr):
        # code here
        if len(arr) == 2:
            return -1
        elif len(arr)==1:
            return -1
        else:
            arr.sort(reverse=True)
            return arr[2]

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna