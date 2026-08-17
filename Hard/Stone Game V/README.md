# [stone-game-v] Stone Game V

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-red?style=flat-square) ![Platform: Leetcode](https://img.shields.io/badge/Platform-Leetcode-FFA116?style=flat-square)

## Problem Metadata
- **Submission Date:** August 17, 2026 at 05:41 AM
- **Language:** `Java`
- **Runtime:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Daily QuestionDaily QuestionDebugging...Submit00StreaksReady to Practice?00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionTime Limit ExceededTime Limit ExceededEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result1563. Stone Game VAttemptedHardTopicsCompaniesHintThere are several stones arranged in a row, and each stone has an associated value which is an integer given in the array stoneValue.

In each round of the game, Alice divides the row into two non-empty rows (i.e. left row and right row), then Bob calculates the value of each row which is the sum of the values of all the stones in this row. Bob throws away the row which has the maximum value, and Alice's score increases by the value of the remaining row. If the value of the two rows are equal, Bob lets Alice decide which row will be thrown away. The next round starts with the remaining row.

The game ends when there is only one stone remaining. Alice's score is initially zero.

Return the maximum score that Alice can obtain.

 
Example 1:

Input: stoneValue = [6,2,3,4,5,5]
Output: 18
Explanation: In the first round, Alice divides the row to [6,2,3], [4,5,5]. The left row has the value 11 and the right row has value 14. Bob throws away the right row and Alice's score is now 11.
In the second round Alice divides the row to [6], [2,3]. This time Bob throws away the left row and Alice's score becomes 16 (11 + 5).
The last round Alice has only one choice to divide the row which is [2], [3]. Bob throws away the right row and Alice's score is now 18 (16 + 2). The game ends because only one stone is remaining in the row.


Example 2:

Input: stoneValue = [7,7,7,7,7,7,7]
Output: 28


Example 3:

Input: stoneValue = [4]
Output: 0


 
Constraints:


	1 <= stoneValue.length <= 500
	1 <= stoneValue[i] <= 106

 Seen this question in a real interview before?1/6YesNoAccepted29,478/68.5KAcceptance Rate43.0%TopicsPrincipalArrayMathDynamic ProgrammingGame TheoryWeekly Contest 203CompaniesHint 1We need to try all possible divisions for the current row to get the max score.Hint 2As calculating all possible divisions will lead us to calculate some sub-problems more than once, we need to think of dynamic programming.Similar QuestionsStone GameMediumStone Game IIMediumStone Game IIIHardStone Game IVHardStone Game VIMediumStone Game VIIMediumStone Game VIIIHardStone Game IXMediumDiscussion (44)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestIlia OzhmegovMay 28, 2023Playing with stones in the 5th game... I'm genuinely sorry for the poor kids Read more28bui quang tuanDec 26, 2024Cannot pass in python with On3 solution but can easily pass in another languages.
On2 solution is way too hard to come up with.
I do really want to see the editorial of this problem. Read more12sdk__Oct 26, 2024Forcing the premise at this point... Bob doesn't even do anything in this one..... Read more9Fahad MubeenJun 11, 2024Use the concept of DP with 'partitioning'. Additionally, to find the sum of a subarray, calculate the prefix sum beforehand. This approach will reduce the time complexity by a factor of the array size, preventing a (TLE) error. Read moreTip8Kartikey SinghJun 22, 2023VERY GOOD PROBLEM
CLASSIC DP Read more81PratyushJul 28, 2024should have told this in question itself
when the score is tie, Alice lets bob decide which pile to use and bob this time is in Alice's team. He will also try to maximize the score Read moreFeedback4Norsuman371May 24, 2025Man, i followed the next math geniuses of the century to their fifth round! pew! Read more3Mr PeanutButterAug 20, 2024Looking at the testcases, I first thought that I have to just bisect the array, but later realizes that it's not always true ...
Anyhow, this is really a fun question to solve ... Read more3Carl MachaalaniJan 27, 2021Why does [10,9,8,7,6,5,4,3,2,1] output 37?! Read more54ArashAug 23, 2020
Pick [2,4,6] vs [3,5,5] -> Bob throws away right, Alice scores  = 2 + 4 + 6 = 12
Pick [2,4] vs [6] -> Bob lets Alice pick since they're equal so Alices throws away [6]. Alice score = 12 + 2 + 4 = 18
Pick [2] vs [4] -> Bob throws away right. Alice score = 18 + 2 = 20
Game Over
 Read more8212345Copyright © 2026 LeetCode. All rights reserved.71544353 OnlinePython3Auto34353637383940414243                    max_score = max(max_score, right_sum + dp(k+1, j))                                # Values are equal, Alice decides which row to throw away                else:                    max_score = max(max_score, left_sum + max(dp(i, k), dp(k+1, j)))                                return max_score        # Start the game with the full array of stones        return dp(0, n - 1)SavedLn 43, Col 28AcceptedRuntime: 0 msCase 1Case 2Case 3InputstoneValue =[6,2,3,4,5,5]Output18Expected18Contribute a testcaseInput9123›[6,2,3,4,5,5][7,7,7,7,7,7,7][4]Output9123›18280Expected9123›18280 All SubmissionsTime Limit Exceeded131 / 132 testcases passedAnalysisLast Executed InputUse TestcasestoneValue =[1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000,1000000View moreCodePython31from typing import List
2from functools import lru_cache
3
4class Solution:
5    def stoneGameV(self, stoneValue: List[int]) -> int:
6        n = len(stoneValue)
7        
8        # Precompute prefix sums to query subarray sums in O(1) time
9        # prefix[i] will store the sum of stoneValue[0...i-1]
10        prefix = [0] * (n + 1)
11        for i in range(n):
12            prefix[i+1] = prefix[i] + stoneValue[i]
13            
14        @lru_cache(None)
15        def dp(i: int, j: int) -> int:
16            # Base case: only one stone left, game ends, score is 0
17            if i == j:
18                return 0
19            
20            max_score = 0
21            
22            # Try splitting the row at every possible index k
23            for k in range(i, j):
24                # Calculate sums using the prefix sum array
25                left_sum = prefix[k+1] - prefix[i]
26                right_sum = prefix[j+1] - prefix[k+1]
27                
28                # Bob throws away the right row
29                if left_sum < right_sum:
30                    max_score = max(max_score, left_sum + dp(i, k))
31                
32                # Bob throws away the left row
33                elif left_sum > right_sum:
34                    max_score = max(max_score, right_sum + dp(k+1, j))
35                
36                # Values are equal, Alice decides which row to throw away
37                else:
38                    max_score = max(max_score, left_sum + max(dp(i, k), dp(k+1, j)))
39                    
40            return max_score
41
42        # Start the game with the full array of stones
43        return dp(0, n - 1)View more 0/5FindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Memory:** N/A
- **Problem Link:** [Link to Problem](https://leetcode.com/problems/stone-game-v/)

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