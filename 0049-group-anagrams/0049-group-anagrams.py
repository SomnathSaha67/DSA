class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        anagram_dict={}
        for word in strs:

            key= tuple(sorted(word))

            if key not in anagram_dict: anagram_dict[key]=[]
            anagram_dict[key].append(word)
        return list(anagram_dict.values())

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna