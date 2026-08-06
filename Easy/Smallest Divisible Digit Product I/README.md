# [smallest-divisible-digit-product-i] Smallest Divisible Digit Product I

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=flat-square) ![Platform: Leetcode](https://img.shields.io/badge/Platform-Leetcode-FFA116?style=flat-square)

## Problem Metadata
- **Submission Date:** August 6, 2026 at 03:41 PM
- **Language:** `cpp`
- **Runtime:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Daily QuestionDaily QuestionDebugging...Submit00StreaksMiss me yet?00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result3345. Smallest Divisible Digit Product IEasyTopicsCompaniesHintYou are given two integers n and t. Return the smallest number greater than or equal to n such that the product of its digits is divisible by t.

 
Example 1:


Input: n = 10, t = 2

Output: 10

Explanation:

The digit product of 10 is 0, which is divisible by 2, making it the smallest number greater than or equal to 10 that satisfies the condition.


Example 2:


Input: n = 15, t = 3

Output: 16

Explanation:

The digit product of 16 is 6, which is divisible by 3, making it the smallest number greater than or equal to 15 that satisfies the condition.


 
Constraints:


	1 <= n <= 100
	1 <= t <= 10

 Discover moreMathVisual Art & DesignSeen this question in a real interview before?1/6YesNoAccepted106,945/150.9KAcceptance Rate70.9%TopicsMid LevelMathEnumerationBiweekly Contest 143CompaniesHint 1You have to check at most 10 numbers.Hint 2Apply a brute-force approach by checking each possible number.Similar QuestionsSmallest Number With Given Digit ProductMediumDiscussion (61)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestDanielleJul 30, 2026I'm a time traveller...
The editorial will be written on August 1, and this will be POTD On August 6. Read more109Show 18 RepliesReplyLeetAsian699 hours agoChat we're cooked tmr Read more47Show 1 RepliesReplyshining_starNov 09, 2024Thank you soo much Mr. 3345 Number Question that u came in today's contest otherwise i'll had nothing to do today
Only 1/4 Today Read more29ReplyVamsiSep 23, 2025it is my 600 th problem Read more20Show 2 RepliesReplymonalisa6 hours agoTomorrow the question will be
Smallest Divisible Digit Product II Read more17ReplyeuniceAug 05, 2026If you want non-brute force:
It can be done using GCD (Euclidian algorithm). Read more14Show 2 RepliesReplyabhay_codecracker7 hours agoPOTD gang attendance  !!!!! Read more20ReplyNalin Kumar Singh6 hours agoCan't wait for Smallest Divisible Digit Product II to show up tomorrow and humble the entire community and me with digit DP, state compression, and existential crisis. 💀 Read more8Show 1 RepliesReplyAuthor KevinNov 10, 2024this really was a 3 line solution problem but it took me 3 tries just because of the given description wrong perception ! Read moreFeedback7Show 1 RepliesReplyAdarsh SachanNov 10, 2024wow, so much emptiness here🫥 Read more5Show 1 RepliesReply1234567Copyright © 2026 LeetCode. All rights reserved.205615857 OnlineSmallest Divisible Digit Product ISmallest Divisible Digit Product ILeetCode27581Aug 01, 2026EditorialApproach: Enumeration
Intuition
We simply enumerate integers starting from n. Within at most 10 attempts, we are guaranteed to encounter an integer whose last digit is 0. Since the product of its digits is then 0, it is divisible by any positive integer t. Therefore, a valid answer is guaranteed to be found within the next 10 integers.
Implementation

Complexity Analysis
Let n be the integer given in the problem.


Time complexity: O(10logn).


Space complexity: O(1).


 Comments (7)Sort by:BestComment💡 Article Commenting Rules1. This comment section is for questions and comments regarding this LeetCode article. All posts must respect our LeetCode Community Rules.2. Concerns about errors or bugs in the article, problem description, or test cases should be posted on LeetCode Feedback, so that our team can address them.susnesnoc10 hours agoAmong any 10 consecutive integers there's exactly one multiple of 10, which has a 0 digit and thus product 0 (divisible by any t). So the answer is always within [n, n+9]
class Solution {
public:
    int smallestNumber(int n, int t) {
        for (int i = n; i <= n + 9; ++i) {
            int product = 1; 
            for (int v = i; v > 0; v /= 10)
                product *= v % 10;
            if (product % t == 0) return i;
        }
        return -1; // unreachable.
    }
}; Read more61Maria2 hours agoOne line solution for this task Read more1GrindAndGrow2 hours agoclass Solution {
public:
int smallestNumber(int n, int t) {
int pro = 1;
int rem = 0;
while (n<=100) {
pro=1;
int temp=n;
while (temp > 0) {
rem = temp % 10;
pro = pro * rem;
temp = temp / 10;
}
if (pro % t == 0) {
return n;
}
n++;
}
return pro;
}
}; Read more1stasf252 hours agoONE-liner for this task Read more1Juvy2 hours agoReal O(1)
lt = [[1,2,3,4,5,6,7,8,9,10],[2,2,3,4,5,6,7,8,9,10],[3,4,3,4,5,6,7,8,9,10],[4,4,6,4,5,6,7,8,9,10],[5,6,6,8,5,6,7,8,9,10],[6,6,6,8,10,6,7,8,9,10],[7,8,9,8,10,10,7,8,9,10],[8,8,9,8,10,10,10,8,9,10],[9,10,9,10,10,10,10,10,9,10],[10,10,10,10,10,10,10,10,10,10],[11,12,13,14,15,16,17,18,19,20],[12,12,13,14,15,16,17,18,19,20],[13,14,13,14,15,16,17,18,19,20],[14,14,16,14,15,16,17,18,19,20],[15,16,16,18,15,16,17,18,19,20],[16,16,16,18,20,16,17,18,19,20],[17,18,19,18,20,20,17,18,19,20],[18,18,19,18,20,20,20,18,19,20],[19,20,19,20,20,20,20,20,19,20],[20,20,20,20,20,20,20,20,20,20],[21,21,23,22,25,23,27,24,29,25],[22,22,23,22,25,23,27,24,29,25],[23,23,23,24,25,23,27,24,29,25],[24,24,26,24,25,26,27,24,29,25],[25,25,26,26,25,26,27,28,29,25],[26,26,26,26,30,26,27,28,29,30],[27,27,29,28,30,29,27,28,29,30],[28,28,29,28,30,29,30,28,29,30],[29,29,29,30,30,29,30,30,29,30],[30,30,30,30,30,30,30,30,30,30],[31,32,31,34,35,32,37,38,33,40],[32,32,32,34,35,32,37,38,33,40],[33,34,33,34,35,34,37,38,33,40],[34,34,34,34,35,34,37,38,36,40],[35,36,35,38,35,36,37,38,36,40],[36,36,36,38,40,36,37,38,36,40],[37,38,37,38,40,38,37,38,39,40],[38,38,38,38,40,38,40,38,39,40],[39,40,39,40,40,40,40,40,39,40],[40,40,40,40,40,40,40,40,40,40],[41,41,43,41,45,43,47,42,49,45],[42,42,43,42,45,43,47,42,49,45],[43,43,43,43,45,43,47,44,49,45],[44,44,46,44,45,46,47,44,49,45],[45,45,46,45,45,46,47,46,49,45],[46,46,46,46,50,46,47,46,49,50],[47,47,49,47,50,49,47,48,49,50],[48,48,49,48,50,49,50,48,49,50],[49,49,49,49,50,49,50,50,49,50],[50,50,50,50,50,50,50,50,50,50],[51,52,53,54,51,56,57,58,59,52],[52,52,53,54,52,56,57,58,59,52],[53,54,53,54,53,56,57,58,59,54],[54,54,56,54,54,56,57,58,59,54],[55,56,56,58,55,56,57,58,59,56],[56,56,56,58,56,56,57,58,59,56],[57,58,59,58,57,60,57,58,59,58],[58,58,59,58,58,60,60,58,59,58],[59,60,59,60,59,60,60,60,59,60],[60,60,60,60,60,60,60,60,60,60],[61,61,61,62,65,61,67,64,63,65],[62,62,62,62,65,62,67,64,63,65],[63,63,63,64,65,63,67,64,63,65],[64,64,64,64,65,64,67,64,66,65],[65,65,65,66,65,65,67,68,66,65],[66,66,66,66,70,66,67,68,66,70],[67,67,67,68,70,67,67,68,69,70],[68,68,68,68,70,68,70,68,69,70],[69,69,69,70,70,69,70,70,69,70],[70,70,70,70,70,70,70,70,70,70],[71,72,73,74,75,76,71,78,79,80],[72,72,73,74,75,76,72,78,79,80],[73,74,73,74,75,76,73,78,79,80],[74,74,76,74,75,76,74,78,79,80],[75,76,76,78,75,76,75,78,79,80],[76,76,76,78,80,76,76,78,79,80],[77,78,79,78,80,80,77,78,79,80],[78,78,79,78,80,80,78,78,79,80],[79,80,79,80,80,80,79,80,79,80],[80,80,80,80,80,80,80,80,80,80],[81,81,83,81,85,83,87,81,89,85],[82,82,83,82,85,83,87,82,89,85],[83,83,83,83,85,83,87,83,89,85],[84,84,86,84,85,86,87,84,89,85],[85,85,86,85,85,86,87,85,89,85],[86,86,86,86,90,86,87,86,89,90],[87,87,89,87,90,89,87,87,89,90],[88,88,89,88,90,89,90,88,89,90],[89,89,89,89,90,89,90,89,89,90],[90,90,90,90,90,90,90,90,90,90],[91,92,91,94,95,92,97,98,91,100],[92,92,92,94,95,92,97,98,92,100],[93,94,93,94,95,94,97,98,93,100],[94,94,94,94,95,94,97,98,94,100],[95,96,95,98,95,96,97,98,95,100],[96,96,96,98,100,96,97,98,96,100],[97,98,97,98,100,98,97,98,97,100],[98,98,98,98,100,98,100,98,98,100],[99,100,99,100,100,100,100,100,99,100],[100,100,100,100,100,100,100,100,100,100]];
class Solution:   
    def smallestNumber(self, n: int, t: int) -> int:
        return lt[n - 1][t - 1] Read more0Lahari_rao_212 hours agoclass Solution {
public int smallestNumber(int n, int t) {
int product=1;
int n1=n ;
while(n1>0)
{  product *= (n1%10);
n1 = (n1/10);
}
if(product % t == 0 )
return n;
     return smallestNumber(n+1, t);
}
} Read more0Akash_Kumar4 hours agoThis is my Solution
class Solution {
public int smallestNumber(int n, int t) {
while(helper(n) % t != 0){
n++;
}
return n;
}
public int helper(int n){
int product = 1;
while(n > 0){
int r = n % 10;
product *= r;
n /= 10;
}
return product;
}
} Read more0187Python3Auto67891011121314151617            while num > 0:                product *= num % 10                num //= 10            return product                # Start checking from n upwards        current = n        while True:            if get_digit_product(current) % t == 0:                return current            current += 1SavedLn 16, Col 25AcceptedRuntime: 0 msCase 1Case 2Inputn =10t =2Output10Expected10Contribute a testcaseInput91234›102153Output912›1016Expected912›1016FindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Memory:** N/A
- **Problem Link:** [Link to Problem](https://leetcode.com/problems/smallest-divisible-digit-product-i/)

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
- **Q:** What is the optimal time complexity of Smallest Divisible Digit Product I?
  - **A:** Generally, it can be optimized to linear time using auxiliary structures or two pointers.
- **Q:** What edge cases should you test for in Smallest Divisible Digit Product I?
  - **A:** Check empty input arrays, single elements, negative integers, and extreme value limits.

---
*Auto-synchronized via [LeetCode GitHub AutoSync](https://github.com/ArokiyaNithish/Arokiya-Nithish)*