class Solution(object):
    def uniformArray(self, nums1):
        """
        :type nums1: List[int]
        :rtype: bool
        """
        odds= [x for x in nums1 if x%2==1]
        evens= [x for x in nums1 if x%2==0]
        if not odds or not evens:
            return True
        min_odd = min(odds)
        if all(((x - min_odd) % 2 == 1 and x - min_odd >= 1) or (x % 2 == 1) for x in nums1):
            return True
        min_even = min(evens)
        if all(((x - min_even) % 2 == 0 and x - min_even >= 1) or (x % 2 == 0) for x in nums1):
            return True
        return False

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna