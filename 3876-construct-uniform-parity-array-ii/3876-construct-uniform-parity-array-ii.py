class Solution(object):
    def uniformArray(self, nums1):
        odds, evens = 0, 0
        min_odd, min_even = float('inf'), float('inf')
        for x in nums1:
            if x % 2:
                odds += 1
                min_odd = min(min_odd, x)
            else:
                evens += 1
                min_even = min(min_even, x)
        if odds == 0 or evens == 0:
            return True
        can_all_odd = True
        for x in nums1:
            if x % 2 == 0:  
                if (x - min_odd) < 1 or (x - min_odd) % 2 == 0:
                    can_all_odd = False
                    break
        if can_all_odd:
            return True
        for x in nums1:
            if x % 2 == 1: 
                if (x - min_even) < 1 or (x - min_even) % 2 == 1:
                    return False
        return True

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna