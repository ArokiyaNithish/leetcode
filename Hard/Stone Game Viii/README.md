# [stone-game-viii] Stone Game Viii

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-red?style=flat-square) ![Platform: Leetcode](https://img.shields.io/badge/Platform-Leetcode-FFA116?style=flat-square)

## Problem Metadata
- **Submission Date:** August 24, 2026 at 06:29 AM
- **Language:** `Java`
- **Runtime:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Daily QuestionDaily QuestionDebugging...Submit100:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionAcceptedAcceptedEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result1872. Stone Game VIIISolvedHardTopicsCompaniesHintAlice and Bob take turns playing a game, with Alice starting first.

There are n stones arranged in a row. On each player's turn, while the number of stones is more than one, they will do the following:


	Choose an integer x > 1, and remove the leftmost x stones from the row.
	Add the sum of the removed stones' values to the player's score.
	Place a new stone, whose value is equal to that sum, on the left side of the row.


The game stops when only one stone is left in the row.

The score difference between Alice and Bob is (Alice's score - Bob's score). Alice's goal is to maximize the score difference, and Bob's goal is the minimize the score difference.

Given an integer array stones of length n where stones[i] represents the value of the ith stone from the left, return the score difference between Alice and Bob if they both play optimally.

 
Example 1:

Input: stones = [-1,2,-3,4,-5]
Output: 5
Explanation:
- Alice removes the first 4 stones, adds (-1) + 2 + (-3) + 4 = 2 to her score, and places a stone of
  value 2 on the left. stones = [2,-5].
- Bob removes the first 2 stones, adds 2 + (-5) = -3 to his score, and places a stone of value -3 on
  the left. stones = [-3].
The difference between their scores is 2 - (-3) = 5.


Example 2:

Input: stones = [7,-6,5,10,5,-2,-6]
Output: 13
Explanation:
- Alice removes all stones, adds 7 + (-6) + 5 + 10 + 5 + (-2) + (-6) = 13 to her score, and places a
  stone of value 13 on the left. stones = [13].
The difference between their scores is 13 - 0 = 13.


Example 3:

Input: stones = [-10,-12]
Output: -22
Explanation:
- Alice can only make one move, which is to remove both stones. She adds (-10) + (-12) = -22 to her
  score and places a stone of value -22 on the left. stones = [-22].
The difference between their scores is (-22) - 0 = -22.


 
Constraints:


	n == stones.length
	2 <= n <= 105
	-104 <= stones[i] <= 104

 Discover moreLanguage ResourcesProgrammingSeen this question in a real interview before?1/6YesNoAccepted15,426/27.7KAcceptance Rate55.6%TopicsSenior StaffArrayMathDynamic ProgrammingMinimaxPrefix SumGame TheoryZero-Sum GameWeekly Contest 242CompaniesHint 1Let's note that the only thing that matters is how many stones were removed so we can maintain dp[numberOfRemovedStones]Hint 2dp[x] = max(sum of all elements up to y - dp[y]) for all y > xSimilar QuestionsStone GameMediumStone Game IIMediumStone Game IIIHardStone Game IVHardStone Game VHardStone Game VIMediumStone Game VIIMediumStone Game VIIIHardStone Game IXMediumDiscussion (34)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestSparsh goyalFeb 16, 2026We may get Stone Game-X before GTA 6 Read more19Big ChungusJul 16, 2024For all hints, and also all solutions: don't label your DP array as dp. We know it's dynamic programming. Instead, name your DP array something like minCost or whatever it is you're solving for.
The hint is unintelligible with just dp. Most of us can determine based on the 2e5 max problem size that this is dynamic programming problem already. The real question is "how can we get the right recurrence relation, and solve for it efficiently?" Read more7biabiaRunFeb 02, 2024I don't understand example 2. Why would Alice remove all the stones instead of just the first 5?
Alice gets 21 (7,-6,5,10,5)
Bob gets 19 (21,-2)
Alice gets 13 (19, -6)
Wouldn't the result be 15 (21 - 19 + 13)? which is larger than 13 (the answer)? Read more51A--Aug 04, 2026Alice and Bob are playing with our lives.. Read more4dugg2014May 23, 2021[25,-35,-37,4,34,43,16,-33,0,-17,-31,-42,-42,38,12,-5,-43,-10,-37,12] result is 38;
the sum is -148. if alice not get -10 at first time , bob will get only to -10 and alice will fail. so alice must get to -10.
the result is 12.
I think alice and bob  is not very intelligent , or I am fool. Read more4Luca34 minutes agoI HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS Read moreFeedback32luckysinghaniyaaaa44 minutes agowe all knew tht alice and bob will return Read more3Mayank Singh Bishtan hour agoDamn! Its always these Alice and Bob playing some weird game. Read more3Leoooooooan hour agoNooooo Alice and Bob still have no other games to play... 🥀 Read more3Norsuman371Jun 07, 2025gimme an up if you followed them so far! Read more31234Copyright © 2026 LeetCode. All rights reserved.49934803 OnlinePython3Auto16171819202122232425                # Iterate backwards from n-2 down to 1        # (We stop at 1 because a player must take x > 1 stones,         # so index 0 is not a valid move)        for i in range(n - 2, 0, -1):            # Option 1: Don't pick at index i, meaning we defer to a future index -> dp            # Option 2: Pick at index i, score difference is prefix_sum[i] - dp            dp = max(dp, prefix_sum[i] - dp)                    return dpSavedLn 25, Col 18AcceptedRuntime: 37 msCase 1Case 2Case 3Inputstones =[-1,2,-3,4,-5]Output5Expected5Contribute a testcaseInput9123›[-1,2,-3,4,-5][7,-6,5,10,5,-2,-6][-10,-12]Output9123›513-22Expected9123›513-22 All SubmissionsAccepted80 / 80 testcases passedArokiya Nithish Jsubmitted at Aug 24, 2026 06:28AnalysisSolution👑 Unlock the Full LeetCode ExperienceCompany problems, Ask Leet, and expert editorials — all in one plan.Runtime656msBeats82.25%Memory32.54MBBeats89.94%Created with Highcharts 11.1.0579ms626ms673ms719ms766ms813ms0%5%10%
                  
                Created with Highcharts 11.1.0579ms626ms673ms719ms766ms813msCodePython31class Solution:
2    def stoneGameVIII(self, stones: list[int]) -> int:
3        n = len(stones)
4        
5        # Calculate prefix sums
6        # The sum of removing stones up to index i is exactly prefix_sum[i]
7        prefix_sum = [0] * n
8        prefix_sum[0] = stones[0]
9        for i in range(1, n):
10            prefix_sum[i] = prefix_sum[i-1] + stones[i]
11            
12        # dp represents the max score difference a player can achieve 
13        # given the available choices.
14        # Base case: picking all remaining stones (index n-1)
15        dp = prefix_sum[-1]
16        
17        # Iterate backwards from n-2 down to 1
18        # (We stop at 1 because a player must take x > 1 stones, 
19        # so index 0 is not a valid move)
20        for i in range(n - 2, 0, -1):
21            # Option 1: Don't pick at index i, meaning we defer to a future index -> dp
22            # Option 2: Pick at index i, score difference is prefix_sum[i] - dp
23            dp = max(dp, prefix_sum[i] - dp)
24            
25        return dpView more More challenges1686. Stone Game VI1690. Stone Game VII2029. Stone Game IX0/5FindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Memory:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Daily QuestionDaily QuestionDebugging...Submit100:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionAcceptedAcceptedEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result1872. Stone Game VIIISolvedHardTopicsCompaniesHintAlice and Bob take turns playing a game, with Alice starting first.

There are n stones arranged in a row. On each player's turn, while the number of stones is more than one, they will do the following:


	Choose an integer x > 1, and remove the leftmost x stones from the row.
	Add the sum of the removed stones' values to the player's score.
	Place a new stone, whose value is equal to that sum, on the left side of the row.


The game stops when only one stone is left in the row.

The score difference between Alice and Bob is (Alice's score - Bob's score). Alice's goal is to maximize the score difference, and Bob's goal is the minimize the score difference.

Given an integer array stones of length n where stones[i] represents the value of the ith stone from the left, return the score difference between Alice and Bob if they both play optimally.

 
Example 1:

Input: stones = [-1,2,-3,4,-5]
Output: 5
Explanation:
- Alice removes the first 4 stones, adds (-1) + 2 + (-3) + 4 = 2 to her score, and places a stone of
  value 2 on the left. stones = [2,-5].
- Bob removes the first 2 stones, adds 2 + (-5) = -3 to his score, and places a stone of value -3 on
  the left. stones = [-3].
The difference between their scores is 2 - (-3) = 5.


Example 2:

Input: stones = [7,-6,5,10,5,-2,-6]
Output: 13
Explanation:
- Alice removes all stones, adds 7 + (-6) + 5 + 10 + 5 + (-2) + (-6) = 13 to her score, and places a
  stone of value 13 on the left. stones = [13].
The difference between their scores is 13 - 0 = 13.


Example 3:

Input: stones = [-10,-12]
Output: -22
Explanation:
- Alice can only make one move, which is to remove both stones. She adds (-10) + (-12) = -22 to her
  score and places a stone of value -22 on the left. stones = [-22].
The difference between their scores is (-22) - 0 = -22.


 
Constraints:


	n == stones.length
	2 <= n <= 105
	-104 <= stones[i] <= 104

 Discover moreLanguage ResourcesProgrammingSeen this question in a real interview before?1/6YesNoAccepted15,426/27.7KAcceptance Rate55.6%TopicsSenior StaffArrayMathDynamic ProgrammingMinimaxPrefix SumGame TheoryZero-Sum GameWeekly Contest 242CompaniesHint 1Let's note that the only thing that matters is how many stones were removed so we can maintain dp[numberOfRemovedStones]Hint 2dp[x] = max(sum of all elements up to y - dp[y]) for all y > xSimilar QuestionsStone GameMediumStone Game IIMediumStone Game IIIHardStone Game IVHardStone Game VHardStone Game VIMediumStone Game VIIMediumStone Game VIIIHardStone Game IXMediumDiscussion (34)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestSparsh goyalFeb 16, 2026We may get Stone Game-X before GTA 6 Read more19Big ChungusJul 16, 2024For all hints, and also all solutions: don't label your DP array as dp. We know it's dynamic programming. Instead, name your DP array something like minCost or whatever it is you're solving for.
The hint is unintelligible with just dp. Most of us can determine based on the 2e5 max problem size that this is dynamic programming problem already. The real question is "how can we get the right recurrence relation, and solve for it efficiently?" Read more7biabiaRunFeb 02, 2024I don't understand example 2. Why would Alice remove all the stones instead of just the first 5?
Alice gets 21 (7,-6,5,10,5)
Bob gets 19 (21,-2)
Alice gets 13 (19, -6)
Wouldn't the result be 15 (21 - 19 + 13)? which is larger than 13 (the answer)? Read more51A--Aug 04, 2026Alice and Bob are playing with our lives.. Read more4dugg2014May 23, 2021[25,-35,-37,4,34,43,16,-33,0,-17,-31,-42,-42,38,12,-5,-43,-10,-37,12] result is 38;
the sum is -148. if alice not get -10 at first time , bob will get only to -10 and alice will fail. so alice must get to -10.
the result is 12.
I think alice and bob  is not very intelligent , or I am fool. Read more4Luca34 minutes agoI HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS I HATE THIS Read moreFeedback32luckysinghaniyaaaa44 minutes agowe all knew tht alice and bob will return Read more3Mayank Singh Bishtan hour agoDamn! Its always these Alice and Bob playing some weird game. Read more3Leoooooooan hour agoNooooo Alice and Bob still have no other games to play... 🥀 Read more3Norsuman371Jun 07, 2025gimme an up if you followed them so far! Read more31234Copyright © 2026 LeetCode. All rights reserved.49934803 OnlinePython3Auto16171819202122232425                # Iterate backwards from n-2 down to 1        # (We stop at 1 because a player must take x > 1 stones,         # so index 0 is not a valid move)        for i in range(n - 2, 0, -1):            # Option 1: Don't pick at index i, meaning we defer to a future index -> dp            # Option 2: Pick at index i, score difference is prefix_sum[i] - dp            dp = max(dp, prefix_sum[i] - dp)                    return dpSavedLn 25, Col 18AcceptedRuntime: 37 msCase 1Case 2Case 3Inputstones =[-1,2,-3,4,-5]Output5Expected5Contribute a testcaseInput9123›[-1,2,-3,4,-5][7,-6,5,10,5,-2,-6][-10,-12]Output9123›513-22Expected9123›513-22 All SubmissionsAccepted80 / 80 testcases passedArokiya Nithish Jsubmitted at Aug 24, 2026 06:28AnalysisSolution👑 Unlock the Full LeetCode ExperienceCompany problems, Ask Leet, and expert editorials — all in one plan.Runtime656msBeats82.25%Memory32.54MBBeats89.94%Created with Highcharts 11.1.0579ms626ms673ms719ms766ms813ms0%5%10%
                  
                Created with Highcharts 11.1.0579ms626ms673ms719ms766ms813msCodePython31class Solution:
2    def stoneGameVIII(self, stones: list[int]) -> int:
3        n = len(stones)
4        
5        # Calculate prefix sums
6        # The sum of removing stones up to index i is exactly prefix_sum[i]
7        prefix_sum = [0] * n
8        prefix_sum[0] = stones[0]
9        for i in range(1, n):
10            prefix_sum[i] = prefix_sum[i-1] + stones[i]
11            
12        # dp represents the max score difference a player can achieve 
13        # given the available choices.
14        # Base case: picking all remaining stones (index n-1)
15        dp = prefix_sum[-1]
16        
17        # Iterate backwards from n-2 down to 1
18        # (We stop at 1 because a player must take x > 1 stones, 
19        # so index 0 is not a valid move)
20        for i in range(n - 2, 0, -1):
21            # Option 1: Don't pick at index i, meaning we defer to a future index -> dp
22            # Option 2: Pick at index i, score difference is prefix_sum[i] - dp
23            dp = max(dp, prefix_sum[i] - dp)
24            
25        return dpView more More challenges1686. Stone Game VI1690. Stone Game VII2029. Stone Game IX0/5FindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Problem Link:** [Link to Problem](https://leetcode.com/problems/stone-game-viii/)

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