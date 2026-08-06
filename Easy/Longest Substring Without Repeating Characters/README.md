# [longest-substring-without-repeating-characters] Longest Substring Without Repeating Characters

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=flat-square) ![Platform: Leetcode](https://img.shields.io/badge/Platform-Leetcode-FFA116?style=flat-square)

## Problem Metadata
- **Submission Date:** August 6, 2026 at 04:27 PM
- **Language:** `python`
- **Runtime:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Problem ListProblem ListDebugging...Submit11StreakWell Done!00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionAcceptedAcceptedEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result All SubmissionsAccepted1036 / 1036 testcases passedArokiya Nithish Jsubmitted at Aug 06, 2026 16:27AnalysisSolution👑 Unlock the Full LeetCode ExperienceCompany problems, Ask Leet, and expert editorials — all in one plan.Runtime178msBeats19.10%Memory19.93MBBeats5.22%Created with Highcharts 11.1.02ms42ms82ms123ms163ms203ms244ms284ms0%10%20%30%40%
                  
                Created with Highcharts 11.1.02ms42ms82ms123ms163ms203ms244ms284msCodePython31class Solution:
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
21        return max_lengthView more More challenges2401. Longest Nice Subarray2799. Count Complete Subarrays in an Array2981. Find Longest Special Substring That Occurs Thrice I0/5Python3Auto12345678910class Solution:    def lengthOfLongestSubstring(self, s: str) -> int:        char_map = {}        start = 0        max_length = 0                for end in range(len(s)):            current_char = s[end]                        # If we've seen the character and it's inside the current window,SavedLn 1, Col 1You must run your code firstFindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Memory:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Problem ListProblem ListDebugging...Submit11StreakWell Done!00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionAcceptedAcceptedEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result All SubmissionsAccepted1036 / 1036 testcases passedArokiya Nithish Jsubmitted at Aug 06, 2026 16:27AnalysisSolution👑 Unlock the Full LeetCode ExperienceCompany problems, Ask Leet, and expert editorials — all in one plan.Runtime178msBeats19.10%Memory19.93MBBeats5.22%Created with Highcharts 11.1.02ms42ms82ms123ms163ms203ms244ms284ms0%10%20%30%40%
                  
                Created with Highcharts 11.1.02ms42ms82ms123ms163ms203ms244ms284msCodePython31class Solution:
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
21        return max_lengthView more More challenges2401. Longest Nice Subarray2799. Count Complete Subarrays in an Array2981. Find Longest Special Substring That Occurs Thrice I0/5Python3Auto12345678910class Solution:    def lengthOfLongestSubstring(self, s: str) -> int:        char_map = {}        start = 0        max_length = 0                for end in range(len(s)):            current_char = s[end]                        # If we've seen the character and it's inside the current window,SavedLn 1, Col 1You must run your code firstFindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Problem Link:** [Link to Problem](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

## Technical Complexity
- **Time Complexity:** O(N) *(Estimated)*
- **Space Complexity:** O(1) *(Estimated)*

## Implementation Approach
Iterative linear scan optimization.

## Solution Explanation
The solution processes elements sequentially, applying state updates dynamically to solve the constraint.

### Alternative Implementation
A recursive depth-first or division approach could be implemented with recursive memory overhead.

### Key Interview Takeaways & Notes
This question tests your mastery of loop bounds, array indexing, and state caching.

> [!WARNING]
> **Common Pitfalls:** Handling null or empty inputs, off-by-one index bounds, and overflowing integers.

## Flashcards & Active Recall
- **Q:** What is the optimal time complexity of Longest Substring Without Repeating Characters?
  - **A:** Generally, it can be optimized to linear time using auxiliary structures or two pointers.
- **Q:** What edge cases should you test for in Longest Substring Without Repeating Characters?
  - **A:** Check empty input arrays, single elements, negative integers, and extreme value limits.

---
*Auto-synchronized via [LeetCode GitHub AutoSync](https://github.com/ArokiyaNithish/Arokiya-Nithish)*