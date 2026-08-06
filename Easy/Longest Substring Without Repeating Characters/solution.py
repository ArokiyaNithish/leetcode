class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_map = {}
        start = 0
        max_length = 0
        
        for end in range(len(s)):
            current_char = s[end]
            
            # If we've seen the character and it's inside the current window,
            # move the start pointer past its previous occurrence
            if current_char in char_map and char_map[current_char] >= start:
                start = char_map[current_char] + 1
            
            # Update the latest index of the character
            char_map[current_char] = end
            
            # Calculate window size and update max_length if it's the largest so far
            max_length = max(max_length, end - start + 1)
            
        return max_length