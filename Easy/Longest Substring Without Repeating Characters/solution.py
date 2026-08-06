1class Solution:
2    def lengthOfLongestSubstring(self, s: str) -> int:
3        char_map = {}
4        start = 0
5        max_length = 0
6        
7        for end in range(len(s)):
8            current_char = s[end]
9            
10            # If we've seen the character and it's inside the current window,
11            # move the start pointer past its previous occurrence
12            if current_char in char_map and char_map[current_char] >= start:
13                start = char_map[current_char] + 1
14            
15            # Update the latest index of the character
16            char_map[current_char] = end
17            
18            # Calculate window size and update max_length if it's the largest so far
19            max_length = max(max_length, end - start + 1)
20            
21        return max_length