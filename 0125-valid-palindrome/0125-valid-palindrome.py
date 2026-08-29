class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        newstr=""
        orgstr=""
        if s.isspace():
            return True
        else:
            for c in s:
                if c.isdigit():
                    newstr+=c
                elif c.isalpha():
                    newstr+=c
            for c in s:
                if c.isdigit():
                    orgstr+=c
                elif c.isalpha():
                    orgstr+=c
            return orgstr.lower()==newstr[::-1].lower()

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna