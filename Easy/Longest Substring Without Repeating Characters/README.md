# [longest-substring-without-repeating-characters] Longest Substring Without Repeating Characters

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=flat-square) ![Platform: Leetcode](https://img.shields.io/badge/Platform-Leetcode-FFA116?style=flat-square)

## Problem Metadata
- **Submission Date:** August 6, 2026 at 04:22 PM
- **Language:** `python`
- **Runtime:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Problem ListProblem ListDebugging...Submit11StreakProtect your streak!00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionAcceptedAcceptedEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result3. Longest Substring Without Repeating CharactersSolvedMediumTopicsCompaniesHintGiven a string s, find the length of the longest substring without duplicate characters.

 
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.


Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.


Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


 
Constraints:


	0 <= s.length <= 105
	s consists of English letters, digits, symbols and spaces.

 Discover moreCalculators & Reference ToolsSeen this question in a real interview before?1/6YesNoAccepted10,022,415/25.3MAcceptance Rate39.7%TopicsStaffHash TableStringSliding WindowCompaniesHint 1There are less than 100 unique characters. We can check all substrings with length at most 100 for example. This is a good enough approximation.Similar QuestionsLongest Substring with At Most Two Distinct CharactersMediumLongest Substring with At Most K Distinct CharactersMediumSubarrays with K Different IntegersHardMaximum Erasure ValueMediumNumber of Equal Count SubstringsMediumMinimum Consecutive Cards to Pick UpMediumLongest Nice SubarrayMediumOptimal Partition of StringMediumCount Complete Subarrays in an ArrayMediumFind Longest Special Substring That Occurs Thrice IIMediumFind Longest Special Substring That Occurs Thrice IMediumDiscussion (923)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestVadlamani SourabMar 10, 2024When I attempted this question a few months ago I was stumped and demoralized by my ineptitude. Now coming across this question today, it was a breeze. To all those who felt the same way I felt when I struggled with this question, stick with it, the grind is worth it, and you will see personal growth. Don't give up, skeleton! Read more1.3K34michaelg02Dec 10, 2019The wording of the question was unclear for me. Example 3 does cover this where "wke" was the longest not "wkew", but the wording of the question suggests that the substring can have multiple of the same character as long as it is not repeating.
"wkew" would pass because the substring does not have two w's in a row.
Instead of:
Given a string, find the length of the longest substring without repeating characters.
I think this is a better wording:
Given a string, find the length of the longest substring without duplicate characters. Read more81921LightChimeraAug 28, 2023986 / 987 testcases passed T_T Read more54524ooPoMay 26, 2019Do not try to use brute force to pass the problem. Read more42329Priyansh SinghDec 26, 2022Some test cases:
" "
"dvdf"
"ckilbkd"
"tmmzuxt" Read more15510Salheen BakhetAug 28, 2017Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
I do not understand that in the Example # 3, it mentions 'wke' as the longest substring. Why not "kew" selected as the longest one? Help here is much appreciated. Read more27235Code2OfferJan 21, 2024https://jr46mg.csb.app/   So I tried to visualize it  with my code in React.js. Hope it helps someone Read more8116anthonyhuangMay 24, 2018I have some problem understanding the problem, this test case "dvdf "says the output should be 3, while I suppose it should be 2.
"dv" or "df" is what I think. It should be substring not subsequence like the question mentioned. Should it confined to "Consistent String"? Read more15529uakrongradSep 17, 2021I think the task could be better explained by asking the tester to find the length of the longest non repeating set of continous characters in the string. Read more1114Sanyukta Sanjay KateDec 30, 2019Did anyone get an error as - " is not a valid value of type string for an input which was a string with space (" ")? Read more659123493Copyright © 2026 LeetCode. All rights reserved.45.5K923966 OnlineSubscribe to unlock.Thanks for using LeetCode! To view this solution you must subscribe to premium.SubscribePython3Auto1112131415161718192021            # move the start pointer past its previous occurrence            if current_char in char_map and char_map[current_char] >= start:                start = char_map[current_char] + 1                        # Update the latest index of the character            char_map[current_char] = end                        # Calculate window size and update max_length if it's the largest so far            max_length = max(max_length, end - start + 1)                    return max_lengthSavedUpgrade to Cloud SavingLn 21, Col 26AcceptedRuntime: 0 msCase 1Case 2Case 3Inputs ="abcabcbb"Output3Expected3Contribute a testcaseInput9123›"abcabcbb""bbbbb""pwwkew"Output9123›313Expected9123›313 All SubmissionsAccepted1036 / 1036 testcases passedArokiya Nithish Jsubmitted at Aug 06, 2026 16:18AnalysisSolution👑 Unlock the Full LeetCode ExperienceCompany problems, Ask Leet, and expert editorials — all in one plan.Runtime181msBeats18.62%Memory19.86MBBeats10.03%Created with Highcharts 11.1.02ms42ms82ms123ms163ms203ms244ms284ms0%10%20%30%40%
                  
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
21        return max_lengthView more More challenges1695. Maximum Erasure Value2401. Longest Nice Subarray2982. Find Longest Special Substring That Occurs Thrice II0/5FindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Memory:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Problem ListProblem ListDebugging...Submit11StreakProtect your streak!00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionAcceptedAcceptedEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result3. Longest Substring Without Repeating CharactersSolvedMediumTopicsCompaniesHintGiven a string s, find the length of the longest substring without duplicate characters.

 
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.


Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.


Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


 
Constraints:


	0 <= s.length <= 105
	s consists of English letters, digits, symbols and spaces.

 Discover moreCalculators & Reference ToolsSeen this question in a real interview before?1/6YesNoAccepted10,022,415/25.3MAcceptance Rate39.7%TopicsStaffHash TableStringSliding WindowCompaniesHint 1There are less than 100 unique characters. We can check all substrings with length at most 100 for example. This is a good enough approximation.Similar QuestionsLongest Substring with At Most Two Distinct CharactersMediumLongest Substring with At Most K Distinct CharactersMediumSubarrays with K Different IntegersHardMaximum Erasure ValueMediumNumber of Equal Count SubstringsMediumMinimum Consecutive Cards to Pick UpMediumLongest Nice SubarrayMediumOptimal Partition of StringMediumCount Complete Subarrays in an ArrayMediumFind Longest Special Substring That Occurs Thrice IIMediumFind Longest Special Substring That Occurs Thrice IMediumDiscussion (923)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestVadlamani SourabMar 10, 2024When I attempted this question a few months ago I was stumped and demoralized by my ineptitude. Now coming across this question today, it was a breeze. To all those who felt the same way I felt when I struggled with this question, stick with it, the grind is worth it, and you will see personal growth. Don't give up, skeleton! Read more1.3K34michaelg02Dec 10, 2019The wording of the question was unclear for me. Example 3 does cover this where "wke" was the longest not "wkew", but the wording of the question suggests that the substring can have multiple of the same character as long as it is not repeating.
"wkew" would pass because the substring does not have two w's in a row.
Instead of:
Given a string, find the length of the longest substring without repeating characters.
I think this is a better wording:
Given a string, find the length of the longest substring without duplicate characters. Read more81921LightChimeraAug 28, 2023986 / 987 testcases passed T_T Read more54524ooPoMay 26, 2019Do not try to use brute force to pass the problem. Read more42329Priyansh SinghDec 26, 2022Some test cases:
" "
"dvdf"
"ckilbkd"
"tmmzuxt" Read more15510Salheen BakhetAug 28, 2017Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
I do not understand that in the Example # 3, it mentions 'wke' as the longest substring. Why not "kew" selected as the longest one? Help here is much appreciated. Read more27235Code2OfferJan 21, 2024https://jr46mg.csb.app/   So I tried to visualize it  with my code in React.js. Hope it helps someone Read more8116anthonyhuangMay 24, 2018I have some problem understanding the problem, this test case "dvdf "says the output should be 3, while I suppose it should be 2.
"dv" or "df" is what I think. It should be substring not subsequence like the question mentioned. Should it confined to "Consistent String"? Read more15529uakrongradSep 17, 2021I think the task could be better explained by asking the tester to find the length of the longest non repeating set of continous characters in the string. Read more1114Sanyukta Sanjay KateDec 30, 2019Did anyone get an error as - " is not a valid value of type string for an input which was a string with space (" ")? Read more659123493Copyright © 2026 LeetCode. All rights reserved.45.5K923966 OnlineSubscribe to unlock.Thanks for using LeetCode! To view this solution you must subscribe to premium.SubscribePython3Auto1112131415161718192021            # move the start pointer past its previous occurrence            if current_char in char_map and char_map[current_char] >= start:                start = char_map[current_char] + 1                        # Update the latest index of the character            char_map[current_char] = end                        # Calculate window size and update max_length if it's the largest so far            max_length = max(max_length, end - start + 1)                    return max_lengthSavedUpgrade to Cloud SavingLn 21, Col 26AcceptedRuntime: 0 msCase 1Case 2Case 3Inputs ="abcabcbb"Output3Expected3Contribute a testcaseInput9123›"abcabcbb""bbbbb""pwwkew"Output9123›313Expected9123›313 All SubmissionsAccepted1036 / 1036 testcases passedArokiya Nithish Jsubmitted at Aug 06, 2026 16:18AnalysisSolution👑 Unlock the Full LeetCode ExperienceCompany problems, Ask Leet, and expert editorials — all in one plan.Runtime181msBeats18.62%Memory19.86MBBeats10.03%Created with Highcharts 11.1.02ms42ms82ms123ms163ms203ms244ms284ms0%10%20%30%40%
                  
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
21        return max_lengthView more More challenges1695. Maximum Erasure Value2401. Longest Nice Subarray2982. Find Longest Special Substring That Occurs Thrice II0/5FindHeaderBarSizeFindTabBarSizeFindBorderBarSize
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