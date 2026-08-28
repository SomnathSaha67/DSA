class Solution:
    def checkYear (self, n):
        # code here
        if((n%100!=0 and n%4==0) or n%400==0):
            return True
        else:
            return False
        

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna