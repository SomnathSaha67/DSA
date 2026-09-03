class Solution(object):
    def uniformArray(self, nums1):
        min_odd, min_even = float('inf'), float('inf')
        has_odd, has_even = False, False
        for x in nums1:
            if x & 1:
                has_odd = True
                if x < min_odd:
                    min_odd = x
            else:
                has_even = True
                if x < min_even:
                    min_even = x
        if not has_odd or not has_even:
            return True
        ok = True
        for x in nums1:
            if (x & 1) == 0:
                diff = x - min_odd
                if diff < 1 or (diff & 1) == 0:
                    ok = False
                    break
        if ok:
            return True
        for x in nums1:
            if (x & 1) == 1:
                diff = x - min_even
                if diff < 1 or (diff & 1) == 1:
                    return False
        return True

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna