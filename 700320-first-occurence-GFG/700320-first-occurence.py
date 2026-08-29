class Solution:
    def firstOccurence(self,txt,pat):
        #code here
        if pat in txt:
            return txt.find(pat)
        else:
            return -1

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna