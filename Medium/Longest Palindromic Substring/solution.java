class Solution:
    def longestPalindrome(self, s: str) -> str:
        if not s or len(s) < 2:
            return s

        start, end = 0, 0

        def expand_around_center(left: int, right: int) -> int:
            # Expand outwards as long as characters match and are within bounds
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1
            # Return the length of the valid palindrome
            return right - left - 1

        for i in range(len(s)):
            # Check for odd length palindromes (e.g., "aba" centered at 'b')
            len1 = expand_around_center(i, i)
            # Check for even length palindromes (e.g., "abba" centered between 'b' and 'b')
            len2 = expand_around_center(i, i + 1)
            
            # Take the maximum length found for this center
            max_len = max(len1, len2)

            # If a longer palindrome is found, update the start and end indices
            if max_len > end - start:
                start = i - (max_len - 1) // 2
                end = i + max_len // 2

        return s[start:end + 1]