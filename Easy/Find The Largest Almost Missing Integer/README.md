# [find-the-largest-almost-missing-integer] Find The Largest Almost Missing Integer

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=flat-square) ![Platform: Leetcode](https://img.shields.io/badge/Platform-Leetcode-FFA116?style=flat-square)

## Problem Metadata
- **Submission Date:** August 18, 2026 at 06:22 AM
- **Language:** `Java`
- **Runtime:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Daily QuestionDaily QuestionDebugging...Submit22StreakCome back soon! 00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionAcceptedAcceptedEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result3471. Find the Largest Almost Missing IntegerSolvedEasyTopicsCompaniesHintYou are given an integer array nums and an integer k.

An integer x is almost missing from nums if x appears in exactly one subarray of size k within nums.

Return the largest almost missing integer from nums. If no such integer exists, return -1.
A subarray is a contiguous sequence of elements within an array.
 
Example 1:


Input: nums = [3,9,2,1,7], k = 3

Output: 7

Explanation:


	1 appears in 2 subarrays of size 3: [9, 2, 1] and [2, 1, 7].
	2 appears in 3 subarrays of size 3: [3, 9, 2], [9, 2, 1], [2, 1, 7].
	3 appears in 1 subarray of size 3: [3, 9, 2].
	7 appears in 1 subarray of size 3: [2, 1, 7].
	9 appears in 2 subarrays of size 3: [3, 9, 2], and [9, 2, 1].


We return 7 since it is the largest integer that appears in exactly one subarray of size k.


Example 2:


Input: nums = [3,9,7,2,1,7], k = 4

Output: 3

Explanation:


	1 appears in 2 subarrays of size 4: [9, 7, 2, 1], [7, 2, 1, 7].
	2 appears in 3 subarrays of size 4: [3, 9, 7, 2], [9, 7, 2, 1], [7, 2, 1, 7].
	3 appears in 1 subarray of size 4: [3, 9, 7, 2].
	7 appears in 3 subarrays of size 4: [3, 9, 7, 2], [9, 7, 2, 1], [7, 2, 1, 7].
	9 appears in 2 subarrays of size 4: [3, 9, 7, 2], [9, 7, 2, 1].


We return 3 since it is the largest and only integer that appears in exactly one subarray of size k.


Example 3:


Input: nums = [0,0], k = 1

Output: -1

Explanation:

There is no integer that appears in only one subarray of size 1.


 
Constraints:


	1 <= nums.length <= 50
	0 <= nums[i] <= 50
	1 <= k <= nums.length

 Discover morejobsPersonalized learning pathsSeen this question in a real interview before?1/6YesNoAccepted39,173/103.4KAcceptance Rate37.9%TopicsMid LevelArrayHash TableWeekly Contest 439CompaniesHint 1Solve the problem for three different cases: k = 1, k = n, and 1 < k < nHint 2If k = 1, return the largest element that occurs exactly once in numsHint 3If k = n, return the largest element in numsHint 4If 1 < k < n, all elements different from nums[0] and nums[n - 1] will occur in more than one subarray of size k. Hence, the answer is the largest of nums[0] and nums[n - 1] if they both occur exactly once in the array. If one of them occurs more than once, return the other. If both of them occur more than once, return -1.Similar QuestionsMissing NumberEasyDiscussion (73)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestSung JinwooMar 02, 2025This description is the type of shit that archaeologists will be deciphering 1000 years from now. Read more856RohitMar 02, 2025Change the Title to
Solve the Toughest Easy Problem. Read more543Shubham TyagiMar 02, 2025[0,0] k=2
-_- Read more482Anshika ChhabraMar 02, 2025Number of hints is directly proportional to the number of edge cases XD Read more241omkar_is_lavathMar 02, 2025this was full of edge cases this is the first time i didn't solve an easy question Read more184RUSHIKESH THORATMar 02, 2025i wrote the most ugliest code for thi shit wtf was thsi Read more161omarghanimaMar 02, 2025Horrible question Read more8Harsh SharmaMar 02, 2025Today's 1st ques be like 🤡 Read more6I_Cannot_Afford_To_LoseMar 04, 2025absolutely garbage question. Read more5IneedchezzborgerMar 04, 2025This was the most infuriating "Easy" problem I ever had the displeasure of solving on this platform. Read more412348Copyright © 2026 LeetCode. All rights reserved.120731045 OnlinePython3Auto1920212223242526                        # Find the maximum integer that appears in exactly 1 subarray        max_almost_missing = -1        for num, count in subarray_counts.items():            if count == 1:                max_almost_missing = max(max_almost_missing, num)                        return max_almost_missingSavedLn 26, Col 34You must run your code first All SubmissionsAccepted900 / 900 testcases passedArokiya Nithish Jsubmitted at Aug 18, 2026 06:22AnalysisSolution👑 Unlock the Full LeetCode ExperienceCompany problems, Ask Leet, and expert editorials — all in one plan.Runtime12msBeats5.74%Memory19.21MBBeats75.41%Created with Highcharts 11.1.02ms4ms6ms8ms10ms0%10%20%30%40%
                  
                Created with Highcharts 11.1.02ms4ms6ms8ms10msCodePython31from collections import defaultdict
2from typing import List
3
4class Solution:
5    def largestInteger(self, nums: List[int], k: int) -> int:
6        # Dictionary to store the number of subarrays each integer appears in
7        subarray_counts = defaultdict(int)
8        n = len(nums)
9        
10        # Iterate over all subarrays of size k
11        for i in range(n - k + 1):
12            subarray = nums[i:i+k]
13            # Use a set to get unique elements in the current subarray
14            unique_elements = set(subarray)
15            
16            # Increment the count for each unique element
17            for num in unique_elements:
18                subarray_counts[num] += 1
19                
20        # Find the maximum integer that appears in exactly 1 subarray
21        max_almost_missing = -1
22        for num, count in subarray_counts.items():
23            if count == 1:
24                max_almost_missing = max(max_almost_missing, num)
25                
26        return max_almost_missingView more More challenges268. Missing Number0/5FindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Memory:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Daily QuestionDaily QuestionDebugging...Submit22StreakCome back soon! 00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionAcceptedAcceptedEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result3471. Find the Largest Almost Missing IntegerSolvedEasyTopicsCompaniesHintYou are given an integer array nums and an integer k.

An integer x is almost missing from nums if x appears in exactly one subarray of size k within nums.

Return the largest almost missing integer from nums. If no such integer exists, return -1.
A subarray is a contiguous sequence of elements within an array.
 
Example 1:


Input: nums = [3,9,2,1,7], k = 3

Output: 7

Explanation:


	1 appears in 2 subarrays of size 3: [9, 2, 1] and [2, 1, 7].
	2 appears in 3 subarrays of size 3: [3, 9, 2], [9, 2, 1], [2, 1, 7].
	3 appears in 1 subarray of size 3: [3, 9, 2].
	7 appears in 1 subarray of size 3: [2, 1, 7].
	9 appears in 2 subarrays of size 3: [3, 9, 2], and [9, 2, 1].


We return 7 since it is the largest integer that appears in exactly one subarray of size k.


Example 2:


Input: nums = [3,9,7,2,1,7], k = 4

Output: 3

Explanation:


	1 appears in 2 subarrays of size 4: [9, 7, 2, 1], [7, 2, 1, 7].
	2 appears in 3 subarrays of size 4: [3, 9, 7, 2], [9, 7, 2, 1], [7, 2, 1, 7].
	3 appears in 1 subarray of size 4: [3, 9, 7, 2].
	7 appears in 3 subarrays of size 4: [3, 9, 7, 2], [9, 7, 2, 1], [7, 2, 1, 7].
	9 appears in 2 subarrays of size 4: [3, 9, 7, 2], [9, 7, 2, 1].


We return 3 since it is the largest and only integer that appears in exactly one subarray of size k.


Example 3:


Input: nums = [0,0], k = 1

Output: -1

Explanation:

There is no integer that appears in only one subarray of size 1.


 
Constraints:


	1 <= nums.length <= 50
	0 <= nums[i] <= 50
	1 <= k <= nums.length

 Discover morejobsPersonalized learning pathsSeen this question in a real interview before?1/6YesNoAccepted39,173/103.4KAcceptance Rate37.9%TopicsMid LevelArrayHash TableWeekly Contest 439CompaniesHint 1Solve the problem for three different cases: k = 1, k = n, and 1 < k < nHint 2If k = 1, return the largest element that occurs exactly once in numsHint 3If k = n, return the largest element in numsHint 4If 1 < k < n, all elements different from nums[0] and nums[n - 1] will occur in more than one subarray of size k. Hence, the answer is the largest of nums[0] and nums[n - 1] if they both occur exactly once in the array. If one of them occurs more than once, return the other. If both of them occur more than once, return -1.Similar QuestionsMissing NumberEasyDiscussion (73)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestSung JinwooMar 02, 2025This description is the type of shit that archaeologists will be deciphering 1000 years from now. Read more856RohitMar 02, 2025Change the Title to
Solve the Toughest Easy Problem. Read more543Shubham TyagiMar 02, 2025[0,0] k=2
-_- Read more482Anshika ChhabraMar 02, 2025Number of hints is directly proportional to the number of edge cases XD Read more241omkar_is_lavathMar 02, 2025this was full of edge cases this is the first time i didn't solve an easy question Read more184RUSHIKESH THORATMar 02, 2025i wrote the most ugliest code for thi shit wtf was thsi Read more161omarghanimaMar 02, 2025Horrible question Read more8Harsh SharmaMar 02, 2025Today's 1st ques be like 🤡 Read more6I_Cannot_Afford_To_LoseMar 04, 2025absolutely garbage question. Read more5IneedchezzborgerMar 04, 2025This was the most infuriating "Easy" problem I ever had the displeasure of solving on this platform. Read more412348Copyright © 2026 LeetCode. All rights reserved.120731045 OnlinePython3Auto1920212223242526                        # Find the maximum integer that appears in exactly 1 subarray        max_almost_missing = -1        for num, count in subarray_counts.items():            if count == 1:                max_almost_missing = max(max_almost_missing, num)                        return max_almost_missingSavedLn 26, Col 34You must run your code first All SubmissionsAccepted900 / 900 testcases passedArokiya Nithish Jsubmitted at Aug 18, 2026 06:22AnalysisSolution👑 Unlock the Full LeetCode ExperienceCompany problems, Ask Leet, and expert editorials — all in one plan.Runtime12msBeats5.74%Memory19.21MBBeats75.41%Created with Highcharts 11.1.02ms4ms6ms8ms10ms0%10%20%30%40%
                  
                Created with Highcharts 11.1.02ms4ms6ms8ms10msCodePython31from collections import defaultdict
2from typing import List
3
4class Solution:
5    def largestInteger(self, nums: List[int], k: int) -> int:
6        # Dictionary to store the number of subarrays each integer appears in
7        subarray_counts = defaultdict(int)
8        n = len(nums)
9        
10        # Iterate over all subarrays of size k
11        for i in range(n - k + 1):
12            subarray = nums[i:i+k]
13            # Use a set to get unique elements in the current subarray
14            unique_elements = set(subarray)
15            
16            # Increment the count for each unique element
17            for num in unique_elements:
18                subarray_counts[num] += 1
19                
20        # Find the maximum integer that appears in exactly 1 subarray
21        max_almost_missing = -1
22        for num, count in subarray_counts.items():
23            if count == 1:
24                max_almost_missing = max(max_almost_missing, num)
25                
26        return max_almost_missingView more More challenges268. Missing Number0/5FindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Problem Link:** [Link to Problem](https://leetcode.com/problems/find-the-largest-almost-missing-integer/)

## Technical Complexity
- **Time Complexity:** O(N) *(Estimated)*
- **Space Complexity:** O(1) *(Estimated)*

## Implementation Approach
Processes elements sequentially with dynamic pointer tracking and constant auxiliary memory.

## Solution Explanation
Traverse the collection with state tracking to solve the constraints in a single pass without extra allocations.

> [!WARNING]
> **Common Pitfalls:** Handling empty input collections, null pointers, and edge boundary conditions.

---
*Auto-synchronized via [LeetCode GitHub AutoSync](https://github.com/ArokiyaNithish/Arokiya-Nithish)*