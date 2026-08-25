# [smallest-missing-multiple-of-k] Smallest Missing Multiple Of K

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=flat-square) ![Platform: Leetcode](https://img.shields.io/badge/Platform-Leetcode-FFA116?style=flat-square)

## Problem Metadata
- **Submission Date:** August 25, 2026 at 06:44 AM
- **Language:** `Java`
- **Runtime:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Daily QuestionDaily QuestionJudging...Speed UpDebugging...Submit100:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionJudging...Judging...EditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result3718. Smallest Missing Multiple of KEasyTopicsCompaniesHintGiven an integer array nums and an integer k, return the smallest positive multiple of k that is missing from nums.

A multiple of k is any positive integer divisible by k.

 
Example 1:


Input: nums = [8,2,3,4,6], k = 2

Output: 10

Explanation:

The multiples of k = 2 are 2, 4, 6, 8, 10, 12... and the smallest multiple missing from nums is 10.


Example 2:


Input: nums = [1,4,7,10,15], k = 5

Output: 5

Explanation:

The multiples of k = 5 are 5, 10, 15, 20... and the smallest multiple missing from nums is 5.


 
Constraints:


	1 <= nums.length <= 100
	1 <= nums[i] <= 100
	1 <= k <= 100

 Seen this question in a real interview before?1/6YesNoAccepted55,327/86.6KAcceptance Rate63.9%TopicsMid LevelArrayHash TableWeekly Contest 472CompaniesHint 1Add the values in nums to a hash setHint 2Iterate through the positive multiples of k and return the first one not in the hash setDiscussion (28)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestVarun TyagiOct 19, 2025Happy Diwali Leetcoders 🎇🪔 Read more285matthewjinmpOct 24, 2025i would be working at walmart if sets were never invented. thank god Read more5RcptOct 20, 2025Test cases ##358 and 560 of 664:
[42,13,99,13,71,32,64,32,63,44,6,22,8,2,55,88,43,40,71,80,95,32,46,19]
44
[73,56,63,98,5,42,29,10,55,11,41,24,62,31,46,95,76,74,26,37,22,58,99,93,97,15,88,4,14,33,69,40,14,93,37,26,60,94,29,95,4,54,100,10,44,60,58,58,72,82,29,56,36,49,77,12,74,52,85,51,13,14,47]
99 Read more4akash_106Oct 19, 2025Approach Overview


Track Multiples: Use a fixed-size array to keep track of which multiples of k are present in the input.


Iterate Input: For each number, if it is a multiple of k, mark the corresponding index in the tracking array.


Find Missing Multiple: Loop through the tracking array from the smallest multiple to the largest (1×k to 100×k) and return the first one that is not marked.


Edge Case: If all multiples in the given range exist, return the next multiple after the range.

 Read more3Shreyank001an hour agosolution from my side: simple C++, hash-set, O(n);
https://leetcode.com/problems/smallest-missing-multiple-of-k/solutions/8480874/easy-c-find-the-smallest-missing-multipl-gkio Read more2NIKHIL_RAJPUT_01Oct 19, 2025sort the array then check for each index  for multiple of k . starts from k Read moreTip42anoob375 minutes agowhen they want to hire you Read more1Chidipothu Jaswin37 minutes agoTip: The input may contain Duplicate Values. Be careful. Read more1Marco Lin Yian hour agoAre we sure Alice and Bob are completely gone? Read more11Kuldeepan hour agoOne of my most favourite things is to
"Just hash it!" :) Read more1123Copyright © 2026 LeetCode. All rights reserved.8028950 OnlineSmallest Missing Multiple of KSmallest Missing Multiple of KLeetCode1790Aug 19, 2026EditorialApproach: Enumeration + Hash Table
Intuition
We need to find the smallest positive integer that is a multiple of k and does not appear in the array nums.
First, we put all elements of nums into a hash set seen to support O(1) average-time lookups. Then, starting from k, we enumerate its positive multiples k,2k,3k,… until we find the first multiple that does not appear in seen. This value is the answer.
Implementation

Complexity Analysis
Let n be the length of the array nums.


Time complexity: O(n).
Constructing the hash set takes O(n) time. We may need to enumerate at most n+1 multiples of k, and each lookup takes O(1) average time.


Space complexity: O(n).
The hash set stores at most n distinct elements.


 Comments (2)Sort by:BestComment💡 Article Commenting Rules1. This comment section is for questions and comments regarding this LeetCode article. All posts must respect our LeetCode Community Rules.2. Concerns about errors or bugs in the article, problem description, or test cases should be posted on LeetCode Feedback, so that our team can address them.eunicean hour agoint missingMultiple(vector<int>& nums, int k) {
    uint64_t b[2] = {0, 0};

    for (auto& n : nums)
        if (!(n % k)) {
            int i = n / k - 1;
            b[i >> 6] |= 1ULL << (i & 63);
        }

    int z = ++b[0] == 0; b[1]++;
    return (z * 64 + bit_width(b[z] & -b[z])) * k;
}
 Read more2MariaAug 24, 2026One line solution for this task Read more1122Python3Auto12345678910class Solution:    def missingMultiple(self, nums: list[int], k: int) -> int:        num_set = set(nums)                multiple = k                while multiple in num_set:            multiple += k                    return multipleSavedUpgrade to Cloud SavingLn 10, Col 24AcceptedRuntime: 0 msCase 1Case 2Inputnums =[8,2,3,4,6]k =2Output10Expected10Contribute a testcaseInput91234›[8,2,3,4,6]2[1,4,7,10,15]5Output912›105Expected912›105 All SubmissionsJudging...Speed Uppreparing runtime environmentFindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Memory:** N/A
- **Problem Link:** [Link to Problem](https://leetcode.com/problems/smallest-missing-multiple-of-k/)

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