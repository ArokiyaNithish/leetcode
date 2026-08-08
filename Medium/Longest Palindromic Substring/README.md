# [longest-palindromic-substring] Longest Palindromic Substring

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-orange?style=flat-square) ![Platform: Leetcode](https://img.shields.io/badge/Platform-Leetcode-FFA116?style=flat-square)

## Problem Metadata
- **Submission Date:** August 8, 2026 at 12:51 PM
- **Language:** `Java`
- **Runtime:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Problem ListProblem ListDebugging...Submit22StreaksReady to Practice?00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionAcceptedAcceptedEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result5. Longest Palindromic SubstringSolvedMediumTopicsCompaniesHintGiven a string s, return the longest palindromic substring in s.

 
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.


Example 2:

Input: s = "cbbd"
Output: "bb"


 
Constraints:


	1 <= s.length <= 1000
	s consist of only digits and English letters.

 Seen this question in a real interview before?1/6YesNoAccepted4,982,963/13MAcceptance Rate38.4%TopicsTwo PointersStringDynamic ProgrammingManacherCompaniesHint 1How can we reuse a previously computed palindrome to compute a larger palindrome?Hint 2If “aba” is a palindrome, is “xabax” a palindrome? Similarly is “xabay” a palindrome?Hint 3Complexity based hint:
If we use brute-force and check whether for every start and end position a substring is a palindrome we have O(n^2) start - end pairs and O(n) palindromic checks. Can we reduce the time for palindromic checks to O(1) by reusing some previous computation.Similar QuestionsShortest PalindromeHardPalindrome PermutationEasyPalindrome PairsHardLongest Palindromic SubsequenceMediumPalindromic SubstringsMediumMaximum Number of Non-overlapping Palindrome SubstringsHardDiscussion (665)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestZenMasterVNov 05, 2022Seems like too many of the  coding wunderkinds here lack basic reading comprehension skills
" Please don't post any solutions in this discussion tab"
It's almost the rule to find the exact opposite for the discussion of every question. I don't want to see your damned solution! Read more1.7K14Akhil ChauhanOct 27, 2023More like longest palindromic nightmare Read more5053SwetNov 04, 2022It took me an hour to solve this even though it's not that difficult but anyhow came to the conclusion that I need to do more practice. Read more25910sanemdeepakJan 16, 2019For input "ac" test case is expecting "a" as output, how is just "a" a palindromic string? Read more22623napoleonNov 08, 2013My Solution Is Naive, It Cost O(n^2), Is there Any Solution faster? Read more13721gRD5EsjlZxOct 02, 2024im to stupid for this(((( Read more683Tomas SandvenApr 25, 2023I'm getting "Time Limit Exceeded" with 141/141 testcases passed and "Last Executed Input" is:
s =
Did I break it? Read moreFeedback619Rohit SinghJan 13, 2025Am I the only one, who doesn't found it medium but hard instead. Read more43384danieNov 14, 2016I submitted my solution, and received a Time Limit Exceeded on this test case:
"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
So I copied and pasted the TC into a custom test case, and started to think about what I could tweak. However, I ended up accidentally hitting Run Code, but instead of getting a Time Limit Exceeded result, it passed:
Is this supposed to happen and I just need to make my code more efficient, or is this a bug? Read moreRead more5412miklerAug 25, 2017So I think I finally understood logic of test creators.
Even if you write a classical DP or memorization solution for this one you will timeout on latest tests.
I think they consider it edge cases. Because if you add one simple line it will pass! OMG.
I have leet code for this. Instead of solving problems I spend hours optimizing the constants.
if s == s[::-1]: return s Read more385123467Copyright © 2026 LeetCode. All rights reserved.33K665457 OnlinePython3Auto21222324252627282930                        # Take the maximum length found for this center            max_len = max(len1, len2)            # If a longer palindrome is found, update the start and end indices            if max_len > end - start:                start = i - (max_len - 1) // 2                end = i + max_len // 2        return s[start:end + 1]SavedLn 30, Col 32AcceptedRuntime: 0 msCase 1Case 2Inputs ="babad"Output"aba"Expected"bab"Contribute a testcaseInput912›"babad""cbbd"Output912›"aba""bb"Expected912›"bab""bb" All SubmissionsAccepted144 / 144 testcases passedArokiya Nithish Jsubmitted at Aug 08, 2026 12:50AnalysisSolution👑 Unlock the Full LeetCode ExperienceCompany problems, Ask Leet, and expert editorials — all in one plan.Runtime247msBeats70.83%Memory19.54MBBeats13.21%Created with Highcharts 11.1.056ms1129ms2202ms3276ms4349ms5422ms6495ms7568ms0%25%50%75%
                  
                Created with Highcharts 11.1.056ms1129ms2202ms3276ms4349ms5422ms6495ms7568msCodePython31class Solution:
2    def longestPalindrome(self, s: str) -> str:
3        if not s or len(s) < 2:
4            return s
5
6        start, end = 0, 0
7
8        def expand_around_center(left: int, right: int) -> int:
9            # Expand outwards as long as characters match and are within bounds
10            while left >= 0 and right < len(s) and s[left] == s[right]:
11                left -= 1
12                right += 1
13            # Return the length of the valid palindrome
14            return right - left - 1
15
16        for i in range(len(s)):
17            # Check for odd length palindromes (e.g., "aba" centered at 'b')
18            len1 = expand_around_center(i, i)
19            # Check for even length palindromes (e.g., "abba" centered between 'b' and 'b')
20            len2 = expand_around_center(i, i + 1)
21            
22            # Take the maximum length found for this center
23            max_len = max(len1, len2)
24
25            # If a longer palindrome is found, update the start and end indices
26            if max_len > end - start:
27                start = i - (max_len - 1) // 2
28                end = i + max_len // 2
29
30        return s[start:end + 1]View more More challenges266. Palindrome Permutation336. Palindrome Pairs2472. Maximum Number of Non-overlapping Palindrome Substrings0/5FindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Memory:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Problem ListProblem ListDebugging...Submit22StreaksReady to Practice?00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionAcceptedAcceptedEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result5. Longest Palindromic SubstringSolvedMediumTopicsCompaniesHintGiven a string s, return the longest palindromic substring in s.

 
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.


Example 2:

Input: s = "cbbd"
Output: "bb"


 
Constraints:


	1 <= s.length <= 1000
	s consist of only digits and English letters.

 Seen this question in a real interview before?1/6YesNoAccepted4,982,963/13MAcceptance Rate38.4%TopicsTwo PointersStringDynamic ProgrammingManacherCompaniesHint 1How can we reuse a previously computed palindrome to compute a larger palindrome?Hint 2If “aba” is a palindrome, is “xabax” a palindrome? Similarly is “xabay” a palindrome?Hint 3Complexity based hint:
If we use brute-force and check whether for every start and end position a substring is a palindrome we have O(n^2) start - end pairs and O(n) palindromic checks. Can we reduce the time for palindromic checks to O(1) by reusing some previous computation.Similar QuestionsShortest PalindromeHardPalindrome PermutationEasyPalindrome PairsHardLongest Palindromic SubsequenceMediumPalindromic SubstringsMediumMaximum Number of Non-overlapping Palindrome SubstringsHardDiscussion (665)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestZenMasterVNov 05, 2022Seems like too many of the  coding wunderkinds here lack basic reading comprehension skills
" Please don't post any solutions in this discussion tab"
It's almost the rule to find the exact opposite for the discussion of every question. I don't want to see your damned solution! Read more1.7K14Akhil ChauhanOct 27, 2023More like longest palindromic nightmare Read more5053SwetNov 04, 2022It took me an hour to solve this even though it's not that difficult but anyhow came to the conclusion that I need to do more practice. Read more25910sanemdeepakJan 16, 2019For input "ac" test case is expecting "a" as output, how is just "a" a palindromic string? Read more22623napoleonNov 08, 2013My Solution Is Naive, It Cost O(n^2), Is there Any Solution faster? Read more13721gRD5EsjlZxOct 02, 2024im to stupid for this(((( Read more683Tomas SandvenApr 25, 2023I'm getting "Time Limit Exceeded" with 141/141 testcases passed and "Last Executed Input" is:
s =
Did I break it? Read moreFeedback619Rohit SinghJan 13, 2025Am I the only one, who doesn't found it medium but hard instead. Read more43384danieNov 14, 2016I submitted my solution, and received a Time Limit Exceeded on this test case:
"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
So I copied and pasted the TC into a custom test case, and started to think about what I could tweak. However, I ended up accidentally hitting Run Code, but instead of getting a Time Limit Exceeded result, it passed:
Is this supposed to happen and I just need to make my code more efficient, or is this a bug? Read moreRead more5412miklerAug 25, 2017So I think I finally understood logic of test creators.
Even if you write a classical DP or memorization solution for this one you will timeout on latest tests.
I think they consider it edge cases. Because if you add one simple line it will pass! OMG.
I have leet code for this. Instead of solving problems I spend hours optimizing the constants.
if s == s[::-1]: return s Read more385123467Copyright © 2026 LeetCode. All rights reserved.33K665457 OnlinePython3Auto21222324252627282930                        # Take the maximum length found for this center            max_len = max(len1, len2)            # If a longer palindrome is found, update the start and end indices            if max_len > end - start:                start = i - (max_len - 1) // 2                end = i + max_len // 2        return s[start:end + 1]SavedLn 30, Col 32AcceptedRuntime: 0 msCase 1Case 2Inputs ="babad"Output"aba"Expected"bab"Contribute a testcaseInput912›"babad""cbbd"Output912›"aba""bb"Expected912›"bab""bb" All SubmissionsAccepted144 / 144 testcases passedArokiya Nithish Jsubmitted at Aug 08, 2026 12:50AnalysisSolution👑 Unlock the Full LeetCode ExperienceCompany problems, Ask Leet, and expert editorials — all in one plan.Runtime247msBeats70.83%Memory19.54MBBeats13.21%Created with Highcharts 11.1.056ms1129ms2202ms3276ms4349ms5422ms6495ms7568ms0%25%50%75%
                  
                Created with Highcharts 11.1.056ms1129ms2202ms3276ms4349ms5422ms6495ms7568msCodePython31class Solution:
2    def longestPalindrome(self, s: str) -> str:
3        if not s or len(s) < 2:
4            return s
5
6        start, end = 0, 0
7
8        def expand_around_center(left: int, right: int) -> int:
9            # Expand outwards as long as characters match and are within bounds
10            while left >= 0 and right < len(s) and s[left] == s[right]:
11                left -= 1
12                right += 1
13            # Return the length of the valid palindrome
14            return right - left - 1
15
16        for i in range(len(s)):
17            # Check for odd length palindromes (e.g., "aba" centered at 'b')
18            len1 = expand_around_center(i, i)
19            # Check for even length palindromes (e.g., "abba" centered between 'b' and 'b')
20            len2 = expand_around_center(i, i + 1)
21            
22            # Take the maximum length found for this center
23            max_len = max(len1, len2)
24
25            # If a longer palindrome is found, update the start and end indices
26            if max_len > end - start:
27                start = i - (max_len - 1) // 2
28                end = i + max_len // 2
29
30        return s[start:end + 1]View more More challenges266. Palindrome Permutation336. Palindrome Pairs2472. Maximum Number of Non-overlapping Palindrome Substrings0/5FindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Problem Link:** [Link to Problem](https://leetcode.com/problems/longest-palindromic-substring/)

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
- **Q:** What is the optimal time complexity of Longest Palindromic Substring?
  - **A:** Generally, it can be optimized to linear time using auxiliary structures or two pointers.
- **Q:** What edge cases should you test for in Longest Palindromic Substring?
  - **A:** Check empty input arrays, single elements, negative integers, and extreme value limits.

---
*Auto-synchronized via [LeetCode GitHub AutoSync](https://github.com/ArokiyaNithish/Arokiya-Nithish)*