# [smallest-divisible-digit-product-ii] Smallest Divisible Digit Product Ii

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=flat-square) ![Platform: Leetcode](https://img.shields.io/badge/Platform-Leetcode-FFA116?style=flat-square)

## Problem Metadata
- **Submission Date:** August 7, 2026 at 12:30 PM
- **Language:** `Java`
- **Runtime:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Daily QuestionDaily QuestionPending...Speed UpDebugging...Submit11StreakMiss me yet?00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionJudging...Judging...EditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result3348. Smallest Divisible Digit Product IIHardTopicsCompaniesHintYou are given a string num which represents a positive integer, and an integer t.

A number is called zero-free if none of its digits are 0.

Return a string representing the smallest zero-free number greater than or equal to num such that the product of its digits is divisible by t. If no such number exists, return "-1".

 
Example 1:


Input: num = "1234", t = 256

Output: "1488"

Explanation:

The smallest zero-free number that is greater than 1234 and has the product of its digits divisible by 256 is 1488, with the product of its digits equal to 256.


Example 2:


Input: num = "12355", t = 50

Output: "12355"

Explanation:

12355 is already zero-free and has the product of its digits divisible by 50, with the product of its digits equal to 150.


Example 3:


Input: num = "11111", t = 26

Output: "-1"

Explanation:

No number greater than 11111 has the product of its digits divisible by 26.


 
Constraints:


	2 <= num.length <= 2 * 105
	num consists only of digits in the range ['0', '9'].
	num does not contain leading zeros.
	1 <= t <= 1014

 Seen this question in a real interview before?1/6YesNoAccepted19,643/60.6KAcceptance Rate32.4%TopicsPrincipalMathStringBacktrackingGreedyNumber TheoryBiweekly Contest 143CompaniesHint 1t should only have 2, 3, 5 and 7 as prime factors.Hint 2Find the shortest suffix that must be changed.Hint 3Try to form the string greedily.Similar QuestionsSmallest Number With Given Digit ProductMediumDiscussion (161)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestRadhaKrishnShiHariVanshNov 09, 20240.1 % acceptence , 4 accepted 4K submission
I think First time in Leetcode History Read more1015Piyush_Negi25Jul 18, 202510.6% acceptance rate?
Bro, I’ve had better odds texting my crush Read more70Anmol Khuranaa day agoWhen you realize best approach for this problem is to SKIP IT. Read more43Depth-Last-SearchNov 09, 2024What a question , even hints are not able to give me hint lol Read more363be_fighterNov 10, 2024Probably tuffest question on leetcode till now !!! Read more23Edwards_ScottNov 09, 2024Who the hell designed those test cases? TLE Forever.. Read more17Shivam KapdiaDec 08, 2024Each semicolon, a step towards the dark,
Creator of this question waits with a devil’s mark. Read more26asmitsrivas0Nov 24, 2024After spending 2 to 3 days on it, come up with these testcases after so many wrong submission, try to make your own logic using these testcase the way I did, you will be able to solve this one:

num="10" , t="320"
num="12", t=1968570"
num="59", t=8
num="78", t=42
num="4093", t=180
num="4121863", t=4741632000
num="19", t=2
num="30", t=9
9)num="9999999999999999999", t=99995938560000
 Read moreTip163czjnbbNov 09, 2024Mark. Hardest up to now, 31 (LCCN and LCUS combined) solved it in BC143. Read more12MitproAug 06, 2026To all of you guys saying cooked tomorrow, I DO NOT CARE, EVERY BODY KNOWS THIS IS THE POTD TOMORROW, SO DO NOT COMMENT SOME USELESS THINGS Read more113123417Copyright © 2026 LeetCode. All rights reserved.1381616458 OnlinePython3Auto76777879808182838485                    res = num[:i] + str(d) + "1" * (N - 1 - i - len(opt)) + "".join(map(str,                     opt))                    return res                # Step 5: If we cannot form a number of the same length, we increase the length by 1.        opt = get_opt(t)        if opt is not None:            res = "1" * (N + 1 - len(opt)) + "".join(map(str, opt))            return res                    return "-1"SavedLn 85, Col 20AcceptedRuntime: 0 msCase 1Case 2Case 3Inputnum ="1234"t =256Output"1488"Expected"1488"Contribute a testcaseInput9123456›"1234"256"12355"50"11111"26Output9123›"1488""12355""-1"Expected9123›"1488""12355""-1" All SubmissionsPending...Speed Uppreparing runtime environmentFindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Memory:** N/A
- **Problem Link:** [Link to Problem](https://leetcode.com/problems/smallest-divisible-digit-product-ii/)

## Technical Complexity
- **Time Complexity:** O(N) *(Estimated)*
- **Space Complexity:** O(N) (Can be optimized to O(1)) *(Estimated)*

## Implementation Approach
Tabulation (Bottom-Up) Dynamic Programming.

## Solution Explanation
We define sub-problems and store their results in a lookup table (dp array) to avoid recalculating the same sub-problems repeatedly.

### Alternative Implementation
Memoized Top-Down Recursion (O(N) time, O(N) recursion stack space).

### Key Interview Takeaways & Notes
Tests ability to recognize overlapping sub-problems and optimal substructure.

> [!WARNING]
> **Common Pitfalls:** Setting up incorrect base cases, or indexing out of bounds on the dp state cache.

## Flashcards & Active Recall
- **Q:** What is the optimal time complexity of Smallest Divisible Digit Product Ii?
  - **A:** Generally, it can be optimized to linear time using auxiliary structures or two pointers.
- **Q:** What edge cases should you test for in Smallest Divisible Digit Product Ii?
  - **A:** Check empty input arrays, single elements, negative integers, and extreme value limits.

---
*Auto-synchronized via [LeetCode GitHub AutoSync](https://github.com/ArokiyaNithish/Arokiya-Nithish)*