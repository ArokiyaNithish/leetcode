# [median-of-two-sorted-arrays] Median Of Two Sorted Arrays

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=flat-square) ![Platform: Leetcode](https://img.shields.io/badge/Platform-Leetcode-FFA116?style=flat-square)

## Problem Metadata
- **Submission Date:** August 6, 2026 at 04:33 PM
- **Language:** `python`
- **Runtime:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Problem ListProblem ListDebugging...Submit11StreakSame time tomorrow? 👀00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionAcceptedAcceptedEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result4. Median of Two Sorted ArraysSolvedHardTopicsCompaniesGiven two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.


Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


 
Constraints:


	nums1.length == m
	nums2.length == n
	0 <= m <= 1000
	0 <= n <= 1000
	1 <= m + n <= 2000
	-106 <= nums1[i], nums2[i] <= 106

 Seen this question in a real interview before?1/6YesNoAccepted4,492,076/9.5MAcceptance Rate47.3%TopicsMid LevelArrayBinary SearchDivide and ConquerCompaniesSimilar QuestionsMedian of a Row Wise Sorted MatrixMediumDiscussion (978)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:Bestkevin_125Jan 03, 2023I got this exact question in an interview last week. I almost gave up because I knew I'm unable to come up with the optimal O(log(n+m)) solution. I quickly did a naive median(sorted(nums1 + nums2)) function and briefly mentioned the optimal approach. The interviewers laughed and said they don't even expect people can implement this within 45 min.
Today I received a call telling me I've passed the interview. What a relief! Read more3.3KShow 44 RepliesReplymoonlight16Aug 21, 2019Ok, sorry.  I'm trying to bottle up my disgust for the interviewing process in the silicon valley.  But I couldn't help it after looking at the solution for this one...
I actually was asked this question in an interview with VMware.  And after reviewing the solution I'm astonished at how/why this question is ever asked.  Isn't it insane to ask this sort of question in a 20-50min interview?  And in the end, does it really tell you anything about the candidate?  Either you get a) a stumped candidate or b) someone who remembers how to solve it because they've seen it before.
I'm trying to review the overall approach in my head.  I find myself just memorizing the solution.  I'm pretty certain this process isn't just about memorizing the solutions.  But if you've seen the solution, it becomes somewhat familiar.  10 or 20 years down the road and you'll never encounter it in industry and will have forgotten the solution.  So you end up just having to recall how its solved, i.e. "oh yeah, i remember how this one is solved in O(logn) complexity".   I doubt most candidates could solve this in a short 20-50 min interview. Read more1KShow 43 RepliesReplyhoney-grapesApr 27, 2022Hi,
I am wondering why .sort() is used in most of the solutions when the time complexity requirement is O(log(m+n))? Read more387Show 25 RepliesReplyQuinnFeb 15, 2020the description says a log(n+m) solution exists, but many of us did a naive median(sorted(nums1 + nums2)) function which worked great even tho it's way worse than log(n+m).
Test cases should be harder to force us to think harder, or it should be marked easy or medium. Read more598Show 19 RepliesReplyRudraksh JadhavOct 26, 2023Interviewer: Can you tell me how can we find the median of two sorted arrays in logarithmic TC?
Me: (Call disconnected) Read more492Show 6 RepliesReplyMadhav SarpalSep 21, 2023God save the person getting this question in an interview. Read more247Show 5 RepliesReplyAlex KylloFeb 04, 2015I submitted two solutions, one with O(m+n) complexity (merge the entire arrays first and then find the median), and one with O(log(m+n)) complexity (divide-and-conquer to find K smallest element of the two arrays and then calculate median) and latter was only 2ms faster. Suggest providing a test case that's sufficiently large to make the difference between logarithmic and linear runtime performance obvious. Read more366Show 12 RepliesReplyGurlop Kishore PaniSep 21, 2023After avoiding this question through my whole life, finally, today I will look up its solution. Read more169Show 6 RepliesReplySnorlaxJul 25, 2021Rating: 3. This is marked as Hard problem, as you will find that the expected time compelxity is O(ln(m+n)). Therefore, you can't merge the two sorted arrays into one sorted array and find the median. As the merging operation it self takes O(m + n). I give this problem a low rating, for reason that in reality, you barely need to optimize a solution like this, and the expected solution adds too much cognitive load to a problem than can be addressed pretty easily with a little sacrifice on space.
What can you learn from solving this problem? Nothing.
This should not be used for interview. Read more274Show 12 RepliesReplydpintoJan 18, 2019The problem statement in the description states that we can assume there are no empty arrays but the test case inputs includes few examples with empty arrays. Read more78Show 3 RepliesReply12345699Copyright © 2026 LeetCode. All rights reserved.32.5K978540 OnlineMedian of Two Sorted ArraysMedian of Two Sorted ArraysLeetCode1367825Apr 22, 2024EditorialPremium VideoVideo Solution

 Subscribe to unlockThanks for using LeetCode! To view this solution video you must subscribe to premium.Subscribe
Solution

Overview
In this problem, we are given two sorted arrays, nums1 and nums2. We need to return the median of these two arrays.

Approach 1: Merge Sort
Intuition
Let's start with the straightforward approach. If we put the elements of two arrays in one array A and arrange them in order. Assume the merged arrays has a length of n, then the median is:
- A[n / 2], if n is odd.
- The average of A[n / 2] and A[n / 2 + 1], if n is even.
However, we do not really need to merge and sort these arrays. Note that both arrays are already sorted, so the smallest element is either the first element of nums1 or the first element of nums2. Therefore, we can set two pointers p1 and p2 at the start of each array, then we can get the smallest element from the nums1 and nums2 by comparing the values nums1[p1] and nums2[p2].
Please refer to the following slide as an example:
1 / 12

Algorithm


Get the total size of two arrays m + n

If m + n is odd, we are looking for the (m + n) / 2-th element.
If m + n is even, we are looking for the average of the (m + n) / 2-th and the (m + n) / 2 + 1-th elements.



Set two pointers p1 and p2 at the beginning of arrays nums1 and nums2.


If both p1 and p2 are in bounds of the arrays, compare the values at p1 and p2:

If nums1[p1] is smaller than nums2[p2], we move p1 one place to the right.
Otherwise, we move p2 one place to the right.

If p1 is outside nums1, just move p2 one place to the right.
If p2 is outside nums2, just move p1 one place to the right.


Get the target elements and calculate the median:

If m + n is odd, repeat step 3 by (m + n + 1) / 2 times and return the element from the last step.
If m + n is even, repeat step 3 by (m + n) / 2 + 1 times and return the average of the elements from the last two steps.



Implementation

Complexity Analysis
Let m be the size of array nums1 and n be the size of array nums2.


Time complexity: O(m+n)

We get the smallest element by comparing two values at p1 and p2, it takes O(1) to compare two elements and move the corresponding pointer to the right.
We need to traverse half of the arrays before reaching the median element(s).
To sum up, the time complexity is O(m+n).



Space complexity: O(1)

We only need to maintain two pointers p1 and p2.





Approach 2: Binary Search, Recursive
Intuition
Because the inputs are sorted arrays and the problem asks for a logarithmic time limit, we strongly feel that binary search (or a similar approach) is a promising method. While we're not sure how to cast the same pattern as a normal binary search on this problem, let's go over some steps of a regular binary search and see if we can get any inspiration. (If you are not familiar with binary search, you can refer to our Binary Search Explore Card)
Here we use binary search to find target in a sorted array A:


Locate the middle index (element) of A.


Compare the value of the middle element with target.


Reduce the search space by cutting the current array in half and discarding the half which is guaranteed not to contain target.


Repeat the above process until we either empty the array (move to half a the length of 0) or find target.



At each step, the search space is cut in half, so we can quickly get the result. Now back to this problem where we have two sorted arrays. For the sake of convenience, let's call them A and B.

Similarly, we can get and compare their middle values A_mid and B_mid. Without loss of generality in this example we assume A_mid <= B_mid initially, as shown in the yellow boxes.

What does this comparison imply?
It implies that we can compare sections of A and B.

For the rest of this article, we will use ≤ to represent the relative magnitude of values in arrays. For example, Aleft​≤Aright​ means that every element in Aleft​ is no larger than any element in Aright​. We also 'compare' elements in an array with a single element similarly, for example, Aleft​≤Amid​ means that every element in Aleft​ is no larger than the element Amid​.
This may not be the most standard way of expressing it, but is easy enough to understand.

Recall that both arrays are sorted, so we know that:

Aleft​≤Amid​
Bmid​≤Bright​

Combine these observations with the comparison we just made:
Amid​≤Bmid​
We have the following result:
Aleft​≤Amid​≤Bmid​≤Bright​
Thus,
Aleft​≤Bright​
As shown in the picture below:

Since A is sorted, we know that Aleft​≤Aright​.

Now we know that A_left is smaller than two halves: A_right and B_right. Although we still don't know where exactly these elements are, what we do know is A_left doesn't intersect with A_right + B_right! There is an invisible boundary between the A_left segment and the mixed segment A_right + B_right. As shown in the picture below, the dashed line divides all sorted elements into two halves.

We can apply all the same logic to the mixed segment Aleft​ + Bleft​ and Bright​, which also do not intersect. You can try to prove it yourself as an exercise.

It looks somewhat clearer, we have clearly separated some subarrays. How do we continue to leverage this knowledge and use the cut-in-half method repeatedly?

The following step is the most important one.
Remember that we are looking for the median of sorted A + B which is one or two target values. We regard the index of the target value in the sorted(A + B) as k. For example:


If the lengths of A and B are 6 and 5, the target index is k = (6 + 5 + 1) / 2 = 6, we shall look for the 6th smallest element.


If the lengths of A and B are 6 and 6, the target indexes are k = (6 + 6) / 2 = 6 and k + 1 = 7, we shall look for the 6th and the 7th smallest elements.


Depending on whether the total number of elements is odd or even, we need the kth (and maybe the (k+1)th) elements. What matters is that we set an index k at the beginning and we want to find the kth smallest element using the Binary Search-like algorithm discussed previously (for convenience, we will discuss only the kth element for now).
However, during the Binary Search-like algorithm, we keep removing one half of an array, so the index k might not stay unchanged. Suppose we removed 3 elements that are smaller than the original kth smallest element, we shall look for the (k−3)th smallest element from the remaining arrays.

More specifically:
If k is larger than half the total number of elements in sorted(A + B), it means that the kth element is in the second (larger) half of sorted(A + B), thus Aleft​ (or Bleft​, the smaller of the two smaller sections according to the comparison) is guaranteed not to contain this element, and we can safely cut this half, and reduce k by the length of the removed half.
If k is not larger than half the total number of elements in sorted(A + B), it means that the kth element is in the first (smaller) half of sorted(A + B), thus Bright​ (or Aright​, the larger of the two larger sections according to the comparison) is guaranteed not to contain this element, and we can safely discard it. Note that we don't need to modify k this time, since we removed one larger half that doesn't affect the order of the kth smallest element.
We can continue our search like above in the remaining arrays. The long arrow that starts from the bottom and points to the top-left indicates that we are repeating the process. Once we cut off part of either A or B, we regard the remaining arrays as modified A and B and restart this algorithm. Note that the following picture represents one case only: we consider the case that a_value < b_value, thus we remove either the smaller half of A or the larger half of B. If the comparison result is a_value >= b_value, we shall remove either the smaller half of B or the larger half of A.

That's it. We cut one of the two arrays in half at each step, so this approach has a logarithmic time complexity which we will discuss in detail later.

One more thing!

In the previous picture, we repeat all processes using the modified arrays, but this is just for the sake of understanding. We won't create copies of two arrays repeatedly, because that would introduce a linear time complexity at least. Instead, we just treat a part of the original array as the modified array for the next step, so that we can repeat the process on the original array without making any duplication. To do this, we need to maintain four pointers, two pointers for each array, e.g., a_start and a_end represent an inclusive range [a_start, a_end] of A.

Algorithm
Let's define a function that helps us find the kth smallest element from two inclusive ranges [a_start, a_end] and [b_start, b_end] from arrays A and B.


If the range (for example, a range of A) is empty, in other words a_start > a_end, it means all elements in A are passed, we just return the (k - a_start)-th element from the other array B. Vice versa if b_start > b_end.


Otherwise, get the middle indexes of the two ranges: a_index = (a_start + a_end) / 2, b_index = (b_start + b_end) / 2.


Get the middle values of the two ranges: a_value = A[a_index], b_value = B[b_index].


Cut one array in half, according to:

If a_index + b_index < k, cut one smaller half.

If a_value < b_value, cut the smaller half of A.
Otherwise, cut the smaller half of B.


Otherwise, cut one larger half.

If b_value < a_value, cut the larger half of B.
Otherwise, cut the larger half of A.





Repeat step 1 using the new starting and ending indexes of A and B.


Then we move on to find the median elements, and get the length of both arrays na = len(A) and nb = len(B).

If the total number of elements in A and B is odd, we just use the above function to find the middle element, that is k = (na + nb) / 2.
Otherwise, we use the function to find two middle elements: k = (na + nb) / 2 - 1 and k = (na + nb) / 2, and return their average.

Implementation

Complexity Analysis
Let m be the size of array nums1 and n be the size of array nums2.


Time complexity: O(log(m⋅n))

At each step, we cut one half off from either nums1 or nums2. If one of the arrays is emptied, we can directly get the target from the other array in a constant time. Therefore, the total time spent depends on when one of the arrays is cut into an empty array.
In the worst-case scenario, we may need to cut both arrays before finding the target element.
One of the two arrays is cut in half at each step, thus it takes logarithmic time to empty an array. The time to empty two arrays are independent of each other.

  


Therefore, the time complexity is O(logm+logn).
O(logm+logn)=O(log(m⋅n))



Space complexity: O(logm+logn)


Similar to the analysis on time complexity, the recursion steps depend on the number of iterations before we cut an array into an empty array. In the worst-case scenario, we need O(logm+logn) recursion steps.


However, during the recursive self-call, we only need to maintain 4 pointers: a_start, a_end, b_start and b_end. The last step of the function is to call itself, so if tail call optimization is implemented, the call stack always has O(1) records.


Please refer to Tail Call for more information on tail call optimization.






Approach 3: A Better Binary Search
Intuition
Recall the previous approach where we perform a binary search over the 'merged' array consisting of nums1 and nums2, resulting in a time complexity of O(log(m⋅n)). We could further improve the algorithm by performing the binary search only on the smaller array of nums1 and nums2, thus the time complexity is reduced to O(log(min(m,n))).
The main idea is similar to approach 2, where we need to find a point of partition in both arrays such that the maximum of the smaller half is less than or equal to the minimum of the larger half.
However, instead of partitioning over the merged arrays, we can only focus on partitioning the smaller array (let's call this array A). Suppose the partition index is partitionA, we specify that the smaller half contains (m + n + 1) / 2 elements, and we can use this feature to our advantage by directly making partitionB equal to (m + n + 1) / 2 - partitionA, thus the smaller halves of both arrays always contain a total of (m + n + 1) / 2 elements, as shown in the picture below.

The next step is to compare these edge elements.

If both maxLeftA <= minRightB and maxLeftB <= minRightA hold, it means that we have partitioned arrays at the correct place.

The smaller half consists of two sections A_left and B_left
THe larger half consists of two sections A_right and B_right

We just need to find the maximum value from the smaller half as max(A[maxLeftA], B[maxLeftB]) and the minimum value from the larger half as min(A[minRightA], B[minRightB]). The median value depends on these four boundary values and the total length of the input arrays and we can compute it by situation.

If maxLeftA > minRightB, it implies that maxLeftA is too large to be in the smaller half and we should look for a smaller partition value of A.

Otherwise, it denotes that minRightA is too small to be in the larger half and we should look for a larger partition value of A.


Algorithm


Assuming nums1 to be the smaller array (If nums2 is smaller, we can swap them). Let m, n represent the size of nums1 and nums2, respectively.


Define the search space for the partitioning index partitionA by setting boundaries as left = 0 and right = m.


While left <= right holds, do the following.


Compute the partition index of nums1 as partitionA = (left + right) / 2. Consequently, the partition index of nums2 is (m + n + 1) / 2 - partitionA.


Obtain the edge elements:

Determine the maximum value of the section A_left as maxLeftA = nums1[partitionA - 1]. If partitionA - 1 < 0, set it as maxLeftA = float(-inf).
Determine the minimum value of the section A_right as minRightA = nums1[partitionA]. If partitionA >= m, set it as minRightA = float(inf).
Determine the maximum value of the section B_left as maxLeftB = nums2[partitionB - 1]. If partitionB - 1 < 0, set it as maxLeftB = float(-inf).
Determine the maximum value of the section B_right as minRightB = nums2[partitionB]. If partitionB >= n, set it as minRightB = float(inf).



Compare and recalculate: Compare maxLeftA with minRightB and maxLeftB with minRightA.

If maxLeftA > minRightB, it means the maxLeftA is too large to be in the smaller half, so we update right = partitionA - 1 to move to the left half of the search space.
If maxLeftB > minRightA, it means that we are too far on the left side for partitionA and we need to go to the right half of the search space by updating left = partitionA + 1.

Repeat step 4.


When both maxLeftA <= minRightB and maxLeftB <= minRightA are true:

If (m + n) % 2 = 0, the median value is the average of the maximum value of the smaller half and the minimum value of the larger half, given by answer = (max(maxLeftA, maxLeftB) + min(minRightA, minRightB)) / 2.
Otherwise, the median value is the maximum value of the smaller half, given by answer = max(maxLeftA, maxLeftB).



Implementation

Complexity Analysis
Let m be the size of array nums1 and n be the size of array nums2.


Time complexity: O(log(min(m,n)))

We perform a binary search over the smaller array of size min(m,n).



Space complexity: O(1)

The algorithm only requires a constant amount of additional space to store and update a few parameters during the binary search.



 Comments (252)Sort by:BestComment💡 Article Commenting Rules1. This comment section is for questions and comments regarding this LeetCode article. All posts must respect our LeetCode Community Rules.2. Concerns about errors or bugs in the article, problem description, or test cases should be posted on LeetCode Feedback, so that our team can address them.Gin IchimaruJun 15, 2023This is simply put... torture. Read more1.2K8William ChenJun 21, 2023This problem hurts my soul... Read more6683manofleetJul 02, 2023I hate this problem so much it is unreal Read more338yeezy_sznJul 10, 2023bro why. i can't believe this is one of the top 20 questions asked by companies.. Read more40710DavitJun 18, 2023When I thought I'd finally be able to do one of this hard (but actually hard) problems because I came up with using binary search, I started hitting hundreds of roablocks and had to quit after 1h+ of trying...
Then I read the solution and learnt there's a whole world of things you gotta find out to make it work, and my soul was crushed again by LeetCode :( Read more1613goolkinJul 21, 2023Understanding the problem is easy, but implementation makes you wanna die. Read more1521touchstoneAug 03, 2023WTF am i putting myself through, if i saw this problem in my interview, i'll happily leave haha Read more1994Jeetaksh GandhiJun 13, 2023This is probably the longest Editorial, which also shows the importance of this problem. Read more1603Sneh BansalJun 11, 2023Oh God why!! 🤕 Read more751gtsohardJun 10, 2023is the comment wrong?? it shows we remove the larger right half, but we are actually removing the smaller left half lol.
# If k is in the right half of A + B, remove the larger right half.             if a_index + b_index < k:                 if a_value > b_value:                     return solve(k, a_start, a_end, b_index + 1, b_end)                 else:                     return solve(k, a_index + 1, a_end, b_start, b_end) Read more314123426583252
@property --beam-angle-_r_4q_ {
  syntax: "<angle>";
  initial-value: 0deg;
  inherits: true;
}

@property --beam-opacity-_r_4q_ {
  syntax: "<number>";
  initial-value: 0;
  inherits: true;
}

[data-beam="_r_4q_"] {
  position: relative;
  border-radius: 9999px;
  overflow: hidden;
}

[data-beam="_r_4q_"][data-active] {
  animation:
    beam-spin-_r_4q_ 1.96s linear infinite,
    beam-fade-in-_r_4q_ 0.6s ease forwards;
}

[data-beam="_r_4q_"][data-fading] {
  animation:
    beam-spin-_r_4q_ 1.96s linear infinite,
    beam-fade-out-_r_4q_ 0.5s ease forwards;
}

[data-beam="_r_4q_"][data-active]::after,
[data-beam="_r_4q_"][data-fading]::after {
  content: "";
  position: absolute;
  inset: 0;
  border-radius: 9998px;
  padding: 1px;
  clip-path: inset(0 round 9999px);
  background: conic-gradient(
        from var(--beam-angle-_r_4q_),
        transparent 0%, transparent 54%,
        rgba(255, 255, 255, 0.1) 57%,
        rgba(255, 255, 255, 0.3) 60%,
        rgba(255, 255, 255, 0.6) 63%,
        rgba(255, 255, 255, 0.75) 66%,
        rgba(255, 255, 255, 0.6) 69%,
        rgba(255, 255, 255, 0.3) 72%,
        rgba(255, 255, 255, 0.1) 75%,
        transparent 78%, transparent 100%
      ),radial-gradient(ellipse 9px 18px at 2% 68%, rgb(60, 140, 200), transparent),
    radial-gradient(ellipse 4px 8px at 2% 68%, rgb(50, 120, 180), transparent),
    radial-gradient(ellipse 59px 9px at 72% -3%, rgb(100, 80, 220), transparent),
    radial-gradient(ellipse 42px 7px at 74% 100%, rgb(80, 100, 255), transparent),
    radial-gradient(ellipse 10px 17px at 100% 27%, rgb(120, 70, 240), transparent),
    radial-gradient(ellipse 10px 18px at 100% 27%, rgb(90, 80, 220), transparent),
    radial-gradient(ellipse 5px 10px at 100% 27%, rgb(70, 110, 255), transparent),
    radial-gradient(ellipse 11px 12px at 100% 27%, rgb(110, 90, 230), transparent);
  -webkit-mask:
    conic-gradient(
      from var(--beam-angle-_r_4q_),
      transparent 0%, transparent 30%,
      rgba(255, 255, 255, 0.1) 36%, rgba(255, 255, 255, 0.35) 44%,
      white 52%, white 80%,
      rgba(255, 255, 255, 0.35) 86%, rgba(255, 255, 255, 0.1) 92%,
      transparent 95%, transparent 100%
    ),
    linear-gradient(#fff 0 0) content-box,
    linear-gradient(#fff 0 0);
  -webkit-mask-composite: source-in, xor;
  mask:
    conic-gradient(
      from var(--beam-angle-_r_4q_),
      transparent 0%, transparent 30%,
      rgba(255, 255, 255, 0.1) 36%, rgba(255, 255, 255, 0.35) 44%,
      white 52%, white 80%,
      rgba(255, 255, 255, 0.35) 86%, rgba(255, 255, 255, 0.1) 92%,
      transparent 95%, transparent 100%
    ),
    linear-gradient(#fff 0 0) content-box,
    linear-gradient(#fff 0 0);
  mask-composite: intersect, exclude;
  pointer-events: none;
  z-index: 2;
  opacity: calc(var(--beam-opacity-_r_4q_) * 0.48 * var(--beam-strength, 1));
  
}

[data-beam="_r_4q_"][data-active]::before,
[data-beam="_r_4q_"][data-fading]::before {
  content: "";
  position: absolute;
  inset: 0;
  border-radius: 9999px;
  clip-path: inset(0 round 9999px);
  background: radial-gradient(ellipse 9px 18px at 2% 68%, rgba(60, 140, 200, 0.5), transparent),
    radial-gradient(ellipse 4px 8px at 2% 68%, rgba(50, 120, 180, 0.45), transparent),
    radial-gradient(ellipse 59px 9px at 72% -3%, rgba(100, 80, 220, 0.35), transparent),
    radial-gradient(ellipse 42px 7px at 74% 100%, rgba(80, 100, 255, 0.35), transparent),
    radial-gradient(ellipse 10px 17px at 100% 27%, rgba(120, 70, 240, 0.3), transparent),
    radial-gradient(ellipse 10px 18px at 100% 27%, rgba(90, 80, 220, 0.4), transparent),
    radial-gradient(ellipse 5px 10px at 100% 27%, rgba(70, 110, 255, 0.3), transparent),
    radial-gradient(ellipse 11px 12px at 100% 27%, rgba(110, 90, 230, 0.3), transparent);
  box-shadow: inset 0 0 5px 1px rgba(255, 255, 255, 0.3);
  -webkit-mask-image: conic-gradient(
    from var(--beam-angle-_r_4q_),
    transparent 0%, transparent 22%,
    rgba(255, 255, 255, 0.12) 28%, rgba(255, 255, 255, 0.4) 36%,
    white 46%, white 82%,
    rgba(255, 255, 255, 0.4) 88%, rgba(255, 255, 255, 0.12) 94%,
    transparent 97%, transparent 100%
  );
  -webkit-mask-composite: source-over;
  mask-image: conic-gradient(
    from var(--beam-angle-_r_4q_),
    transparent 0%, transparent 22%,
    rgba(255, 255, 255, 0.12) 28%, rgba(255, 255, 255, 0.4) 36%,
    white 46%, white 82%,
    rgba(255, 255, 255, 0.4) 88%, rgba(255, 255, 255, 0.12) 94%,
    transparent 97%, transparent 100%
  );
  mask-composite: add;
  pointer-events: none;
  z-index: 1;
  opacity: calc(var(--beam-opacity-_r_4q_) * 0.70 * var(--beam-strength, 1));
  
}

[data-beam="_r_4q_"] [data-beam-bloom] {
  display: none;
  position: absolute;
  inset: 0;
  border-radius: 9998px;
  clip-path: inset(0 round 9999px);
  background: conic-gradient(
        from var(--beam-angle-_r_4q_),
        transparent 0%, transparent 58%,
        rgba(255, 255, 255, 0.03) 62%,
        rgba(255, 255, 255, 0.08) 65%,
        rgba(255, 255, 255, 0.2) 67%,
        rgba(255, 255, 255, 0.45) 69%,
        rgba(255, 255, 255, 0.85) 70%,
        rgba(255, 255, 255, 0.85) 70.5%,
        rgba(255, 255, 255, 0.45) 71.5%,
        rgba(255, 255, 255, 0.2) 73%,
        rgba(255, 255, 255, 0.08) 75%,
        rgba(255, 255, 255, 0.03) 78%,
        transparent 82%
      );
  -webkit-mask: linear-gradient(#fff 0 0) content-box, linear-gradient(#fff 0 0);
  -webkit-mask-composite: xor;
  mask: linear-gradient(#fff 0 0) content-box, linear-gradient(#fff 0 0);
  mask-composite: exclude;
  padding: 1px;
  filter: blur(8px) brightness(1.30) saturate(1.20);
  pointer-events: none;
  z-index: 3;
  opacity: 0;
}

[data-beam="_r_4q_"][data-active] [data-beam-bloom],
[data-beam="_r_4q_"][data-fading] [data-beam-bloom] {
  display: block;
  opacity: calc(var(--beam-opacity-_r_4q_) * 0.80 * var(--beam-strength, 1));
}

@keyframes beam-spin-_r_4q_ {
  to { --beam-angle-_r_4q_: 360deg; }
}

@keyframes beam-fade-in-_r_4q_ {
  to { --beam-opacity-_r_4q_: 1; }
}

@keyframes beam-fade-out-_r_4q_ {
  from { --beam-opacity-_r_4q_: 1; }
  to { --beam-opacity-_r_4q_: 0; }
}

LeetSort byAllMy SolutionPython3JavaC++PythonJavaScriptCC#TypeScriptGoRustPHPSwiftKotlinDartRubyScalaElixirRacketErlangPython MLHTMLBashPandasArrayBinary SearchDivide and ConquerBinary TreeSortingMerge SortTwo PointersMathHeap (Priority Queue)IteratorRecursionBinary Search TreeProbability and StatisticsDynamic ProgrammingBrainteaserOrdered SetLinked ListBit ManipulationQueueStackGreedySimulationHash TableCountingData StreamSliding WindowShortest PathDepth-First SearchQuickselectSuffix ArrayStringCombinatoricsDesignBinary Indexed TreeMatrixString MatchingBrute-Force SearchStrongly Connected ComponentTrieMemoizationInteractiveCounting SortUnion-FindHash FunctionTopological SortBacktrackingNumber TheoryTreeBubble SortYour last submission beat 100% of other submissions' runtime.Share my solutionLeetCode・ Open・Apr 22, 2024Median of Two Sorted ArraysEditorial5831.3M252Sidhant Singh・ Open・Sep 21, 2023✅99%🔥||✅Journey From Brute Force to Most 🔥Optimized ✅Three Approaches||🔥Easy to understandTwo PointersBinary SearchSortingC++2+6K467.1K102niits・ Open・May 07, 2025【Video】Divide each array into two groupsArrayBinary SearchDivide and ConquerC++3+2.2K105.6K8vaishnavi_k15・ Open・18 hours agoEASY SOLUTION 100% BEATS!!!!!!!!!ArrayBinary SearchC++1130coding_simp・ Open・Oct 02, 2022C++ || SOLUTIONArrayCBinary TreeC++791149K35stellari・ Open・Jun 22, 2015Very concise O(log(min(M,N))) iterative solution with detailed explanationBinary Tree2K444.9K218Deep Saini・ Open・Aug 05, 2026Optimal O(log(min(m, n))) Binary Search ApproachC++1700hungry_bits・ Open・Aug 04, 2026⭐⭐[ 100% Beats ] Runtime | Two Pointers +  Binary Search | C++ | Java | Python3 | Easy Explanation Binary SearchDivide and ConquerC++Java1+11750Sounak Ghosh・ Open・Aug 02, 2026Partition-Based Binary Search Approach in C++ArrayBinary SearchDivide and ConquerC++21150Loginov Kirill・ Open・Apr 21, 2025Merging Sorted Arrays for Median – The Cleanest Shortcut You'll SeeArrayBinary SearchDivide and ConquerPython1+15425.9K7Gourab・ Open・Mar 11, 2023✅ best JAVA solution 😎 | beats 100%Java35992.5K34Ayush Bansal・ Open・Jul 17, 2024Easy and Simple C++ approach | Binary search✅ArrayBinary SearchC++19425.1K2vanAmsen・ Open・Sep 21, 2023✅ 94.96% Binary Search & Two PointersTwo PointersBinary SearchPHPC++6+16757.9K15clue・ Open・Jan 08, 2015Intuitive Python O(log (m+n)) solution, by kth smallest in the two sorted arrays, 252msPython676162.9K59Cheng_Zhang・ Open・Nov 02, 2015Concise JAVA solution based on Binary Search544180.1K71Python3Auto24252627282930313233                else:                    return float(max(maxLeftX, maxLeftY))            elif maxLeftX > minRightY:                # We are too far right in partitionX, move left                high = partitionX - 1            else:                # We are too far left in partitionX, move right                low = partitionX + 1                        raise ValueError("Input arrays are not sorted.")SavedLn 33, Col 57AcceptedRuntime: 0 msCase 1Case 2Inputnums1 =[1,3]nums2 =[2]Output2.00000Expected2.00000Contribute a testcaseInput91234›[1,3][2][1,2][3,4]Output912›2.000002.50000Expected912›2.000002.50000 All SubmissionsAccepted2099 / 2099 testcases passedArokiya Nithish Jsubmitted at Aug 06, 2026 16:32AnalysisSolution👑 Unlock the Full LeetCode ExperienceCompany problems, Ask Leet, and expert editorials — all in one plan.Runtime0msBeats100.00%Memory19.54MBBeats41.82%Created with Highcharts 11.1.018.6mb18.8mb19mb19.2mb19.4mb19.6mb0%20%40%
                  
                Created with Highcharts 11.1.018.6mb18.8mb19mb19.2mb19.4mb19.6mbCodePython31class Solution:
2    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
3        # Ensure nums1 is the smaller array to minimize binary search range
4        if len(nums1) > len(nums2):
5            nums1, nums2 = nums2, nums1
6            
7        m, n = len(nums1), len(nums2)
8        low, high = 0, m
9        
10        while low <= high:
11            partitionX = (low + high) // 2
12            partitionY = (m + n + 1) // 2 - partitionX
13            
14            maxLeftX = float('-inf') if partitionX == 0 else nums1[partitionX - 1]
15            minRightX = float('inf') if partitionX == m else nums1[partitionX]
16            
17            maxLeftY = float('-inf') if partitionY == 0 else nums2[partitionY - 1]
18            minRightY = float('inf') if partitionY == n else nums2[partitionY]
19            
20            if maxLeftX <= minRightY and maxLeftY <= minRightX:
21                # We have partitioned the arrays correctly
22                if (m + n) % 2 == 0:
23                    return (max(maxLeftX, maxLeftY) + min(minRightX, minRightY)) / 2.0
24                else:
25                    return float(max(maxLeftX, maxLeftY))
26            elif maxLeftX > minRightY:
27                # We are too far right in partitionX, move left
28                high = partitionX - 1
29            else:
30                # We are too far left in partitionX, move right
31                low = partitionX + 1
32                
33        raise ValueError("Input arrays are not sorted.")View more 0/5FindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Memory:** !function(){try{var d=document.documentElement,c=d.classList;c.remove('light','dark');var e=localStorage.getItem('lc-theme');if('system'===e||(!e&&true)){var t='(prefers-color-scheme: dark)',m=window.matchMedia(t);if(m.media!==t||m.matches){d.style.colorScheme = 'dark';c.add('dark')}else{d.style.colorScheme = 'light';c.add('light')}}else if(e){c.add(e|| '')}if(e==='light'||e==='dark')d.style.colorScheme=e}catch(e){}}()Problem ListProblem ListDebugging...Submit11StreakSame time tomorrow? 👀00:00:00Arokiya Nithish JAccess all features with our Premium subscription!My ListsNotebookProgressPointsTry New FeaturesOrdersMy PlaygroundsSettingsAppearanceAppearanceSystem DefaultLightDarkSign OutSystem DefaultLightDarkPremiumDescriptionDescriptionAcceptedAcceptedEditorialEditorialSolutionsSolutionsSubmissionsSubmissionsCodeCodeTestcaseTestcaseTest ResultTest Result4. Median of Two Sorted ArraysSolvedHardTopicsCompaniesGiven two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.


Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


 
Constraints:


	nums1.length == m
	nums2.length == n
	0 <= m <= 1000
	0 <= n <= 1000
	1 <= m + n <= 2000
	-106 <= nums1[i], nums2[i] <= 106

 Seen this question in a real interview before?1/6YesNoAccepted4,492,076/9.5MAcceptance Rate47.3%TopicsMid LevelArrayBinary SearchDivide and ConquerCompaniesSimilar QuestionsMedian of a Row Wise Sorted MatrixMediumDiscussion (978)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:Bestkevin_125Jan 03, 2023I got this exact question in an interview last week. I almost gave up because I knew I'm unable to come up with the optimal O(log(n+m)) solution. I quickly did a naive median(sorted(nums1 + nums2)) function and briefly mentioned the optimal approach. The interviewers laughed and said they don't even expect people can implement this within 45 min.
Today I received a call telling me I've passed the interview. What a relief! Read more3.3KShow 44 RepliesReplymoonlight16Aug 21, 2019Ok, sorry.  I'm trying to bottle up my disgust for the interviewing process in the silicon valley.  But I couldn't help it after looking at the solution for this one...
I actually was asked this question in an interview with VMware.  And after reviewing the solution I'm astonished at how/why this question is ever asked.  Isn't it insane to ask this sort of question in a 20-50min interview?  And in the end, does it really tell you anything about the candidate?  Either you get a) a stumped candidate or b) someone who remembers how to solve it because they've seen it before.
I'm trying to review the overall approach in my head.  I find myself just memorizing the solution.  I'm pretty certain this process isn't just about memorizing the solutions.  But if you've seen the solution, it becomes somewhat familiar.  10 or 20 years down the road and you'll never encounter it in industry and will have forgotten the solution.  So you end up just having to recall how its solved, i.e. "oh yeah, i remember how this one is solved in O(logn) complexity".   I doubt most candidates could solve this in a short 20-50 min interview. Read more1KShow 43 RepliesReplyhoney-grapesApr 27, 2022Hi,
I am wondering why .sort() is used in most of the solutions when the time complexity requirement is O(log(m+n))? Read more387Show 25 RepliesReplyQuinnFeb 15, 2020the description says a log(n+m) solution exists, but many of us did a naive median(sorted(nums1 + nums2)) function which worked great even tho it's way worse than log(n+m).
Test cases should be harder to force us to think harder, or it should be marked easy or medium. Read more598Show 19 RepliesReplyRudraksh JadhavOct 26, 2023Interviewer: Can you tell me how can we find the median of two sorted arrays in logarithmic TC?
Me: (Call disconnected) Read more492Show 6 RepliesReplyMadhav SarpalSep 21, 2023God save the person getting this question in an interview. Read more247Show 5 RepliesReplyAlex KylloFeb 04, 2015I submitted two solutions, one with O(m+n) complexity (merge the entire arrays first and then find the median), and one with O(log(m+n)) complexity (divide-and-conquer to find K smallest element of the two arrays and then calculate median) and latter was only 2ms faster. Suggest providing a test case that's sufficiently large to make the difference between logarithmic and linear runtime performance obvious. Read more366Show 12 RepliesReplyGurlop Kishore PaniSep 21, 2023After avoiding this question through my whole life, finally, today I will look up its solution. Read more169Show 6 RepliesReplySnorlaxJul 25, 2021Rating: 3. This is marked as Hard problem, as you will find that the expected time compelxity is O(ln(m+n)). Therefore, you can't merge the two sorted arrays into one sorted array and find the median. As the merging operation it self takes O(m + n). I give this problem a low rating, for reason that in reality, you barely need to optimize a solution like this, and the expected solution adds too much cognitive load to a problem than can be addressed pretty easily with a little sacrifice on space.
What can you learn from solving this problem? Nothing.
This should not be used for interview. Read more274Show 12 RepliesReplydpintoJan 18, 2019The problem statement in the description states that we can assume there are no empty arrays but the test case inputs includes few examples with empty arrays. Read more78Show 3 RepliesReply12345699Copyright © 2026 LeetCode. All rights reserved.32.5K978540 OnlineMedian of Two Sorted ArraysMedian of Two Sorted ArraysLeetCode1367825Apr 22, 2024EditorialPremium VideoVideo Solution

 Subscribe to unlockThanks for using LeetCode! To view this solution video you must subscribe to premium.Subscribe
Solution

Overview
In this problem, we are given two sorted arrays, nums1 and nums2. We need to return the median of these two arrays.

Approach 1: Merge Sort
Intuition
Let's start with the straightforward approach. If we put the elements of two arrays in one array A and arrange them in order. Assume the merged arrays has a length of n, then the median is:
- A[n / 2], if n is odd.
- The average of A[n / 2] and A[n / 2 + 1], if n is even.
However, we do not really need to merge and sort these arrays. Note that both arrays are already sorted, so the smallest element is either the first element of nums1 or the first element of nums2. Therefore, we can set two pointers p1 and p2 at the start of each array, then we can get the smallest element from the nums1 and nums2 by comparing the values nums1[p1] and nums2[p2].
Please refer to the following slide as an example:
1 / 12

Algorithm


Get the total size of two arrays m + n

If m + n is odd, we are looking for the (m + n) / 2-th element.
If m + n is even, we are looking for the average of the (m + n) / 2-th and the (m + n) / 2 + 1-th elements.



Set two pointers p1 and p2 at the beginning of arrays nums1 and nums2.


If both p1 and p2 are in bounds of the arrays, compare the values at p1 and p2:

If nums1[p1] is smaller than nums2[p2], we move p1 one place to the right.
Otherwise, we move p2 one place to the right.

If p1 is outside nums1, just move p2 one place to the right.
If p2 is outside nums2, just move p1 one place to the right.


Get the target elements and calculate the median:

If m + n is odd, repeat step 3 by (m + n + 1) / 2 times and return the element from the last step.
If m + n is even, repeat step 3 by (m + n) / 2 + 1 times and return the average of the elements from the last two steps.



Implementation

Complexity Analysis
Let m be the size of array nums1 and n be the size of array nums2.


Time complexity: O(m+n)

We get the smallest element by comparing two values at p1 and p2, it takes O(1) to compare two elements and move the corresponding pointer to the right.
We need to traverse half of the arrays before reaching the median element(s).
To sum up, the time complexity is O(m+n).



Space complexity: O(1)

We only need to maintain two pointers p1 and p2.





Approach 2: Binary Search, Recursive
Intuition
Because the inputs are sorted arrays and the problem asks for a logarithmic time limit, we strongly feel that binary search (or a similar approach) is a promising method. While we're not sure how to cast the same pattern as a normal binary search on this problem, let's go over some steps of a regular binary search and see if we can get any inspiration. (If you are not familiar with binary search, you can refer to our Binary Search Explore Card)
Here we use binary search to find target in a sorted array A:


Locate the middle index (element) of A.


Compare the value of the middle element with target.


Reduce the search space by cutting the current array in half and discarding the half which is guaranteed not to contain target.


Repeat the above process until we either empty the array (move to half a the length of 0) or find target.



At each step, the search space is cut in half, so we can quickly get the result. Now back to this problem where we have two sorted arrays. For the sake of convenience, let's call them A and B.

Similarly, we can get and compare their middle values A_mid and B_mid. Without loss of generality in this example we assume A_mid <= B_mid initially, as shown in the yellow boxes.

What does this comparison imply?
It implies that we can compare sections of A and B.

For the rest of this article, we will use ≤ to represent the relative magnitude of values in arrays. For example, Aleft​≤Aright​ means that every element in Aleft​ is no larger than any element in Aright​. We also 'compare' elements in an array with a single element similarly, for example, Aleft​≤Amid​ means that every element in Aleft​ is no larger than the element Amid​.
This may not be the most standard way of expressing it, but is easy enough to understand.

Recall that both arrays are sorted, so we know that:

Aleft​≤Amid​
Bmid​≤Bright​

Combine these observations with the comparison we just made:
Amid​≤Bmid​
We have the following result:
Aleft​≤Amid​≤Bmid​≤Bright​
Thus,
Aleft​≤Bright​
As shown in the picture below:

Since A is sorted, we know that Aleft​≤Aright​.

Now we know that A_left is smaller than two halves: A_right and B_right. Although we still don't know where exactly these elements are, what we do know is A_left doesn't intersect with A_right + B_right! There is an invisible boundary between the A_left segment and the mixed segment A_right + B_right. As shown in the picture below, the dashed line divides all sorted elements into two halves.

We can apply all the same logic to the mixed segment Aleft​ + Bleft​ and Bright​, which also do not intersect. You can try to prove it yourself as an exercise.

It looks somewhat clearer, we have clearly separated some subarrays. How do we continue to leverage this knowledge and use the cut-in-half method repeatedly?

The following step is the most important one.
Remember that we are looking for the median of sorted A + B which is one or two target values. We regard the index of the target value in the sorted(A + B) as k. For example:


If the lengths of A and B are 6 and 5, the target index is k = (6 + 5 + 1) / 2 = 6, we shall look for the 6th smallest element.


If the lengths of A and B are 6 and 6, the target indexes are k = (6 + 6) / 2 = 6 and k + 1 = 7, we shall look for the 6th and the 7th smallest elements.


Depending on whether the total number of elements is odd or even, we need the kth (and maybe the (k+1)th) elements. What matters is that we set an index k at the beginning and we want to find the kth smallest element using the Binary Search-like algorithm discussed previously (for convenience, we will discuss only the kth element for now).
However, during the Binary Search-like algorithm, we keep removing one half of an array, so the index k might not stay unchanged. Suppose we removed 3 elements that are smaller than the original kth smallest element, we shall look for the (k−3)th smallest element from the remaining arrays.

More specifically:
If k is larger than half the total number of elements in sorted(A + B), it means that the kth element is in the second (larger) half of sorted(A + B), thus Aleft​ (or Bleft​, the smaller of the two smaller sections according to the comparison) is guaranteed not to contain this element, and we can safely cut this half, and reduce k by the length of the removed half.
If k is not larger than half the total number of elements in sorted(A + B), it means that the kth element is in the first (smaller) half of sorted(A + B), thus Bright​ (or Aright​, the larger of the two larger sections according to the comparison) is guaranteed not to contain this element, and we can safely discard it. Note that we don't need to modify k this time, since we removed one larger half that doesn't affect the order of the kth smallest element.
We can continue our search like above in the remaining arrays. The long arrow that starts from the bottom and points to the top-left indicates that we are repeating the process. Once we cut off part of either A or B, we regard the remaining arrays as modified A and B and restart this algorithm. Note that the following picture represents one case only: we consider the case that a_value < b_value, thus we remove either the smaller half of A or the larger half of B. If the comparison result is a_value >= b_value, we shall remove either the smaller half of B or the larger half of A.

That's it. We cut one of the two arrays in half at each step, so this approach has a logarithmic time complexity which we will discuss in detail later.

One more thing!

In the previous picture, we repeat all processes using the modified arrays, but this is just for the sake of understanding. We won't create copies of two arrays repeatedly, because that would introduce a linear time complexity at least. Instead, we just treat a part of the original array as the modified array for the next step, so that we can repeat the process on the original array without making any duplication. To do this, we need to maintain four pointers, two pointers for each array, e.g., a_start and a_end represent an inclusive range [a_start, a_end] of A.

Algorithm
Let's define a function that helps us find the kth smallest element from two inclusive ranges [a_start, a_end] and [b_start, b_end] from arrays A and B.


If the range (for example, a range of A) is empty, in other words a_start > a_end, it means all elements in A are passed, we just return the (k - a_start)-th element from the other array B. Vice versa if b_start > b_end.


Otherwise, get the middle indexes of the two ranges: a_index = (a_start + a_end) / 2, b_index = (b_start + b_end) / 2.


Get the middle values of the two ranges: a_value = A[a_index], b_value = B[b_index].


Cut one array in half, according to:

If a_index + b_index < k, cut one smaller half.

If a_value < b_value, cut the smaller half of A.
Otherwise, cut the smaller half of B.


Otherwise, cut one larger half.

If b_value < a_value, cut the larger half of B.
Otherwise, cut the larger half of A.





Repeat step 1 using the new starting and ending indexes of A and B.


Then we move on to find the median elements, and get the length of both arrays na = len(A) and nb = len(B).

If the total number of elements in A and B is odd, we just use the above function to find the middle element, that is k = (na + nb) / 2.
Otherwise, we use the function to find two middle elements: k = (na + nb) / 2 - 1 and k = (na + nb) / 2, and return their average.

Implementation

Complexity Analysis
Let m be the size of array nums1 and n be the size of array nums2.


Time complexity: O(log(m⋅n))

At each step, we cut one half off from either nums1 or nums2. If one of the arrays is emptied, we can directly get the target from the other array in a constant time. Therefore, the total time spent depends on when one of the arrays is cut into an empty array.
In the worst-case scenario, we may need to cut both arrays before finding the target element.
One of the two arrays is cut in half at each step, thus it takes logarithmic time to empty an array. The time to empty two arrays are independent of each other.

  


Therefore, the time complexity is O(logm+logn).
O(logm+logn)=O(log(m⋅n))



Space complexity: O(logm+logn)


Similar to the analysis on time complexity, the recursion steps depend on the number of iterations before we cut an array into an empty array. In the worst-case scenario, we need O(logm+logn) recursion steps.


However, during the recursive self-call, we only need to maintain 4 pointers: a_start, a_end, b_start and b_end. The last step of the function is to call itself, so if tail call optimization is implemented, the call stack always has O(1) records.


Please refer to Tail Call for more information on tail call optimization.






Approach 3: A Better Binary Search
Intuition
Recall the previous approach where we perform a binary search over the 'merged' array consisting of nums1 and nums2, resulting in a time complexity of O(log(m⋅n)). We could further improve the algorithm by performing the binary search only on the smaller array of nums1 and nums2, thus the time complexity is reduced to O(log(min(m,n))).
The main idea is similar to approach 2, where we need to find a point of partition in both arrays such that the maximum of the smaller half is less than or equal to the minimum of the larger half.
However, instead of partitioning over the merged arrays, we can only focus on partitioning the smaller array (let's call this array A). Suppose the partition index is partitionA, we specify that the smaller half contains (m + n + 1) / 2 elements, and we can use this feature to our advantage by directly making partitionB equal to (m + n + 1) / 2 - partitionA, thus the smaller halves of both arrays always contain a total of (m + n + 1) / 2 elements, as shown in the picture below.

The next step is to compare these edge elements.

If both maxLeftA <= minRightB and maxLeftB <= minRightA hold, it means that we have partitioned arrays at the correct place.

The smaller half consists of two sections A_left and B_left
THe larger half consists of two sections A_right and B_right

We just need to find the maximum value from the smaller half as max(A[maxLeftA], B[maxLeftB]) and the minimum value from the larger half as min(A[minRightA], B[minRightB]). The median value depends on these four boundary values and the total length of the input arrays and we can compute it by situation.

If maxLeftA > minRightB, it implies that maxLeftA is too large to be in the smaller half and we should look for a smaller partition value of A.

Otherwise, it denotes that minRightA is too small to be in the larger half and we should look for a larger partition value of A.


Algorithm


Assuming nums1 to be the smaller array (If nums2 is smaller, we can swap them). Let m, n represent the size of nums1 and nums2, respectively.


Define the search space for the partitioning index partitionA by setting boundaries as left = 0 and right = m.


While left <= right holds, do the following.


Compute the partition index of nums1 as partitionA = (left + right) / 2. Consequently, the partition index of nums2 is (m + n + 1) / 2 - partitionA.


Obtain the edge elements:

Determine the maximum value of the section A_left as maxLeftA = nums1[partitionA - 1]. If partitionA - 1 < 0, set it as maxLeftA = float(-inf).
Determine the minimum value of the section A_right as minRightA = nums1[partitionA]. If partitionA >= m, set it as minRightA = float(inf).
Determine the maximum value of the section B_left as maxLeftB = nums2[partitionB - 1]. If partitionB - 1 < 0, set it as maxLeftB = float(-inf).
Determine the maximum value of the section B_right as minRightB = nums2[partitionB]. If partitionB >= n, set it as minRightB = float(inf).



Compare and recalculate: Compare maxLeftA with minRightB and maxLeftB with minRightA.

If maxLeftA > minRightB, it means the maxLeftA is too large to be in the smaller half, so we update right = partitionA - 1 to move to the left half of the search space.
If maxLeftB > minRightA, it means that we are too far on the left side for partitionA and we need to go to the right half of the search space by updating left = partitionA + 1.

Repeat step 4.


When both maxLeftA <= minRightB and maxLeftB <= minRightA are true:

If (m + n) % 2 = 0, the median value is the average of the maximum value of the smaller half and the minimum value of the larger half, given by answer = (max(maxLeftA, maxLeftB) + min(minRightA, minRightB)) / 2.
Otherwise, the median value is the maximum value of the smaller half, given by answer = max(maxLeftA, maxLeftB).



Implementation

Complexity Analysis
Let m be the size of array nums1 and n be the size of array nums2.


Time complexity: O(log(min(m,n)))

We perform a binary search over the smaller array of size min(m,n).



Space complexity: O(1)

The algorithm only requires a constant amount of additional space to store and update a few parameters during the binary search.



 Comments (252)Sort by:BestComment💡 Article Commenting Rules1. This comment section is for questions and comments regarding this LeetCode article. All posts must respect our LeetCode Community Rules.2. Concerns about errors or bugs in the article, problem description, or test cases should be posted on LeetCode Feedback, so that our team can address them.Gin IchimaruJun 15, 2023This is simply put... torture. Read more1.2K8William ChenJun 21, 2023This problem hurts my soul... Read more6683manofleetJul 02, 2023I hate this problem so much it is unreal Read more338yeezy_sznJul 10, 2023bro why. i can't believe this is one of the top 20 questions asked by companies.. Read more40710DavitJun 18, 2023When I thought I'd finally be able to do one of this hard (but actually hard) problems because I came up with using binary search, I started hitting hundreds of roablocks and had to quit after 1h+ of trying...
Then I read the solution and learnt there's a whole world of things you gotta find out to make it work, and my soul was crushed again by LeetCode :( Read more1613goolkinJul 21, 2023Understanding the problem is easy, but implementation makes you wanna die. Read more1521touchstoneAug 03, 2023WTF am i putting myself through, if i saw this problem in my interview, i'll happily leave haha Read more1994Jeetaksh GandhiJun 13, 2023This is probably the longest Editorial, which also shows the importance of this problem. Read more1603Sneh BansalJun 11, 2023Oh God why!! 🤕 Read more751gtsohardJun 10, 2023is the comment wrong?? it shows we remove the larger right half, but we are actually removing the smaller left half lol.
# If k is in the right half of A + B, remove the larger right half.             if a_index + b_index < k:                 if a_value > b_value:                     return solve(k, a_start, a_end, b_index + 1, b_end)                 else:                     return solve(k, a_index + 1, a_end, b_start, b_end) Read more314123426583252
@property --beam-angle-_r_4q_ {
  syntax: "<angle>";
  initial-value: 0deg;
  inherits: true;
}

@property --beam-opacity-_r_4q_ {
  syntax: "<number>";
  initial-value: 0;
  inherits: true;
}

[data-beam="_r_4q_"] {
  position: relative;
  border-radius: 9999px;
  overflow: hidden;
}

[data-beam="_r_4q_"][data-active] {
  animation:
    beam-spin-_r_4q_ 1.96s linear infinite,
    beam-fade-in-_r_4q_ 0.6s ease forwards;
}

[data-beam="_r_4q_"][data-fading] {
  animation:
    beam-spin-_r_4q_ 1.96s linear infinite,
    beam-fade-out-_r_4q_ 0.5s ease forwards;
}

[data-beam="_r_4q_"][data-active]::after,
[data-beam="_r_4q_"][data-fading]::after {
  content: "";
  position: absolute;
  inset: 0;
  border-radius: 9998px;
  padding: 1px;
  clip-path: inset(0 round 9999px);
  background: conic-gradient(
        from var(--beam-angle-_r_4q_),
        transparent 0%, transparent 54%,
        rgba(255, 255, 255, 0.1) 57%,
        rgba(255, 255, 255, 0.3) 60%,
        rgba(255, 255, 255, 0.6) 63%,
        rgba(255, 255, 255, 0.75) 66%,
        rgba(255, 255, 255, 0.6) 69%,
        rgba(255, 255, 255, 0.3) 72%,
        rgba(255, 255, 255, 0.1) 75%,
        transparent 78%, transparent 100%
      ),radial-gradient(ellipse 9px 18px at 2% 68%, rgb(60, 140, 200), transparent),
    radial-gradient(ellipse 4px 8px at 2% 68%, rgb(50, 120, 180), transparent),
    radial-gradient(ellipse 59px 9px at 72% -3%, rgb(100, 80, 220), transparent),
    radial-gradient(ellipse 42px 7px at 74% 100%, rgb(80, 100, 255), transparent),
    radial-gradient(ellipse 10px 17px at 100% 27%, rgb(120, 70, 240), transparent),
    radial-gradient(ellipse 10px 18px at 100% 27%, rgb(90, 80, 220), transparent),
    radial-gradient(ellipse 5px 10px at 100% 27%, rgb(70, 110, 255), transparent),
    radial-gradient(ellipse 11px 12px at 100% 27%, rgb(110, 90, 230), transparent);
  -webkit-mask:
    conic-gradient(
      from var(--beam-angle-_r_4q_),
      transparent 0%, transparent 30%,
      rgba(255, 255, 255, 0.1) 36%, rgba(255, 255, 255, 0.35) 44%,
      white 52%, white 80%,
      rgba(255, 255, 255, 0.35) 86%, rgba(255, 255, 255, 0.1) 92%,
      transparent 95%, transparent 100%
    ),
    linear-gradient(#fff 0 0) content-box,
    linear-gradient(#fff 0 0);
  -webkit-mask-composite: source-in, xor;
  mask:
    conic-gradient(
      from var(--beam-angle-_r_4q_),
      transparent 0%, transparent 30%,
      rgba(255, 255, 255, 0.1) 36%, rgba(255, 255, 255, 0.35) 44%,
      white 52%, white 80%,
      rgba(255, 255, 255, 0.35) 86%, rgba(255, 255, 255, 0.1) 92%,
      transparent 95%, transparent 100%
    ),
    linear-gradient(#fff 0 0) content-box,
    linear-gradient(#fff 0 0);
  mask-composite: intersect, exclude;
  pointer-events: none;
  z-index: 2;
  opacity: calc(var(--beam-opacity-_r_4q_) * 0.48 * var(--beam-strength, 1));
  
}

[data-beam="_r_4q_"][data-active]::before,
[data-beam="_r_4q_"][data-fading]::before {
  content: "";
  position: absolute;
  inset: 0;
  border-radius: 9999px;
  clip-path: inset(0 round 9999px);
  background: radial-gradient(ellipse 9px 18px at 2% 68%, rgba(60, 140, 200, 0.5), transparent),
    radial-gradient(ellipse 4px 8px at 2% 68%, rgba(50, 120, 180, 0.45), transparent),
    radial-gradient(ellipse 59px 9px at 72% -3%, rgba(100, 80, 220, 0.35), transparent),
    radial-gradient(ellipse 42px 7px at 74% 100%, rgba(80, 100, 255, 0.35), transparent),
    radial-gradient(ellipse 10px 17px at 100% 27%, rgba(120, 70, 240, 0.3), transparent),
    radial-gradient(ellipse 10px 18px at 100% 27%, rgba(90, 80, 220, 0.4), transparent),
    radial-gradient(ellipse 5px 10px at 100% 27%, rgba(70, 110, 255, 0.3), transparent),
    radial-gradient(ellipse 11px 12px at 100% 27%, rgba(110, 90, 230, 0.3), transparent);
  box-shadow: inset 0 0 5px 1px rgba(255, 255, 255, 0.3);
  -webkit-mask-image: conic-gradient(
    from var(--beam-angle-_r_4q_),
    transparent 0%, transparent 22%,
    rgba(255, 255, 255, 0.12) 28%, rgba(255, 255, 255, 0.4) 36%,
    white 46%, white 82%,
    rgba(255, 255, 255, 0.4) 88%, rgba(255, 255, 255, 0.12) 94%,
    transparent 97%, transparent 100%
  );
  -webkit-mask-composite: source-over;
  mask-image: conic-gradient(
    from var(--beam-angle-_r_4q_),
    transparent 0%, transparent 22%,
    rgba(255, 255, 255, 0.12) 28%, rgba(255, 255, 255, 0.4) 36%,
    white 46%, white 82%,
    rgba(255, 255, 255, 0.4) 88%, rgba(255, 255, 255, 0.12) 94%,
    transparent 97%, transparent 100%
  );
  mask-composite: add;
  pointer-events: none;
  z-index: 1;
  opacity: calc(var(--beam-opacity-_r_4q_) * 0.70 * var(--beam-strength, 1));
  
}

[data-beam="_r_4q_"] [data-beam-bloom] {
  display: none;
  position: absolute;
  inset: 0;
  border-radius: 9998px;
  clip-path: inset(0 round 9999px);
  background: conic-gradient(
        from var(--beam-angle-_r_4q_),
        transparent 0%, transparent 58%,
        rgba(255, 255, 255, 0.03) 62%,
        rgba(255, 255, 255, 0.08) 65%,
        rgba(255, 255, 255, 0.2) 67%,
        rgba(255, 255, 255, 0.45) 69%,
        rgba(255, 255, 255, 0.85) 70%,
        rgba(255, 255, 255, 0.85) 70.5%,
        rgba(255, 255, 255, 0.45) 71.5%,
        rgba(255, 255, 255, 0.2) 73%,
        rgba(255, 255, 255, 0.08) 75%,
        rgba(255, 255, 255, 0.03) 78%,
        transparent 82%
      );
  -webkit-mask: linear-gradient(#fff 0 0) content-box, linear-gradient(#fff 0 0);
  -webkit-mask-composite: xor;
  mask: linear-gradient(#fff 0 0) content-box, linear-gradient(#fff 0 0);
  mask-composite: exclude;
  padding: 1px;
  filter: blur(8px) brightness(1.30) saturate(1.20);
  pointer-events: none;
  z-index: 3;
  opacity: 0;
}

[data-beam="_r_4q_"][data-active] [data-beam-bloom],
[data-beam="_r_4q_"][data-fading] [data-beam-bloom] {
  display: block;
  opacity: calc(var(--beam-opacity-_r_4q_) * 0.80 * var(--beam-strength, 1));
}

@keyframes beam-spin-_r_4q_ {
  to { --beam-angle-_r_4q_: 360deg; }
}

@keyframes beam-fade-in-_r_4q_ {
  to { --beam-opacity-_r_4q_: 1; }
}

@keyframes beam-fade-out-_r_4q_ {
  from { --beam-opacity-_r_4q_: 1; }
  to { --beam-opacity-_r_4q_: 0; }
}

LeetSort byAllMy SolutionPython3JavaC++PythonJavaScriptCC#TypeScriptGoRustPHPSwiftKotlinDartRubyScalaElixirRacketErlangPython MLHTMLBashPandasArrayBinary SearchDivide and ConquerBinary TreeSortingMerge SortTwo PointersMathHeap (Priority Queue)IteratorRecursionBinary Search TreeProbability and StatisticsDynamic ProgrammingBrainteaserOrdered SetLinked ListBit ManipulationQueueStackGreedySimulationHash TableCountingData StreamSliding WindowShortest PathDepth-First SearchQuickselectSuffix ArrayStringCombinatoricsDesignBinary Indexed TreeMatrixString MatchingBrute-Force SearchStrongly Connected ComponentTrieMemoizationInteractiveCounting SortUnion-FindHash FunctionTopological SortBacktrackingNumber TheoryTreeBubble SortYour last submission beat 100% of other submissions' runtime.Share my solutionLeetCode・ Open・Apr 22, 2024Median of Two Sorted ArraysEditorial5831.3M252Sidhant Singh・ Open・Sep 21, 2023✅99%🔥||✅Journey From Brute Force to Most 🔥Optimized ✅Three Approaches||🔥Easy to understandTwo PointersBinary SearchSortingC++2+6K467.1K102niits・ Open・May 07, 2025【Video】Divide each array into two groupsArrayBinary SearchDivide and ConquerC++3+2.2K105.6K8vaishnavi_k15・ Open・18 hours agoEASY SOLUTION 100% BEATS!!!!!!!!!ArrayBinary SearchC++1130coding_simp・ Open・Oct 02, 2022C++ || SOLUTIONArrayCBinary TreeC++791149K35stellari・ Open・Jun 22, 2015Very concise O(log(min(M,N))) iterative solution with detailed explanationBinary Tree2K444.9K218Deep Saini・ Open・Aug 05, 2026Optimal O(log(min(m, n))) Binary Search ApproachC++1700hungry_bits・ Open・Aug 04, 2026⭐⭐[ 100% Beats ] Runtime | Two Pointers +  Binary Search | C++ | Java | Python3 | Easy Explanation Binary SearchDivide and ConquerC++Java1+11750Sounak Ghosh・ Open・Aug 02, 2026Partition-Based Binary Search Approach in C++ArrayBinary SearchDivide and ConquerC++21150Loginov Kirill・ Open・Apr 21, 2025Merging Sorted Arrays for Median – The Cleanest Shortcut You'll SeeArrayBinary SearchDivide and ConquerPython1+15425.9K7Gourab・ Open・Mar 11, 2023✅ best JAVA solution 😎 | beats 100%Java35992.5K34Ayush Bansal・ Open・Jul 17, 2024Easy and Simple C++ approach | Binary search✅ArrayBinary SearchC++19425.1K2vanAmsen・ Open・Sep 21, 2023✅ 94.96% Binary Search & Two PointersTwo PointersBinary SearchPHPC++6+16757.9K15clue・ Open・Jan 08, 2015Intuitive Python O(log (m+n)) solution, by kth smallest in the two sorted arrays, 252msPython676162.9K59Cheng_Zhang・ Open・Nov 02, 2015Concise JAVA solution based on Binary Search544180.1K71Python3Auto24252627282930313233                else:                    return float(max(maxLeftX, maxLeftY))            elif maxLeftX > minRightY:                # We are too far right in partitionX, move left                high = partitionX - 1            else:                # We are too far left in partitionX, move right                low = partitionX + 1                        raise ValueError("Input arrays are not sorted.")SavedLn 33, Col 57AcceptedRuntime: 0 msCase 1Case 2Inputnums1 =[1,3]nums2 =[2]Output2.00000Expected2.00000Contribute a testcaseInput91234›[1,3][2][1,2][3,4]Output912›2.000002.50000Expected912›2.000002.50000 All SubmissionsAccepted2099 / 2099 testcases passedArokiya Nithish Jsubmitted at Aug 06, 2026 16:32AnalysisSolution👑 Unlock the Full LeetCode ExperienceCompany problems, Ask Leet, and expert editorials — all in one plan.Runtime0msBeats100.00%Memory19.54MBBeats41.82%Created with Highcharts 11.1.018.6mb18.8mb19mb19.2mb19.4mb19.6mb0%20%40%
                  
                Created with Highcharts 11.1.018.6mb18.8mb19mb19.2mb19.4mb19.6mbCodePython31class Solution:
2    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
3        # Ensure nums1 is the smaller array to minimize binary search range
4        if len(nums1) > len(nums2):
5            nums1, nums2 = nums2, nums1
6            
7        m, n = len(nums1), len(nums2)
8        low, high = 0, m
9        
10        while low <= high:
11            partitionX = (low + high) // 2
12            partitionY = (m + n + 1) // 2 - partitionX
13            
14            maxLeftX = float('-inf') if partitionX == 0 else nums1[partitionX - 1]
15            minRightX = float('inf') if partitionX == m else nums1[partitionX]
16            
17            maxLeftY = float('-inf') if partitionY == 0 else nums2[partitionY - 1]
18            minRightY = float('inf') if partitionY == n else nums2[partitionY]
19            
20            if maxLeftX <= minRightY and maxLeftY <= minRightX:
21                # We have partitioned the arrays correctly
22                if (m + n) % 2 == 0:
23                    return (max(maxLeftX, maxLeftY) + min(minRightX, minRightY)) / 2.0
24                else:
25                    return float(max(maxLeftX, maxLeftY))
26            elif maxLeftX > minRightY:
27                # We are too far right in partitionX, move left
28                high = partitionX - 1
29            else:
30                # We are too far left in partitionX, move right
31                low = partitionX + 1
32                
33        raise ValueError("Input arrays are not sorted.")View more 0/5FindHeaderBarSizeFindTabBarSizeFindBorderBarSize
- **Problem Link:** [Link to Problem](https://leetcode.com/problems/median-of-two-sorted-arrays/)

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
- **Q:** What is the optimal time complexity of Median Of Two Sorted Arrays?
  - **A:** Generally, it can be optimized to linear time using auxiliary structures or two pointers.
- **Q:** What edge cases should you test for in Median Of Two Sorted Arrays?
  - **A:** Check empty input arrays, single elements, negative integers, and extreme value limits.

---
*Auto-synchronized via [LeetCode GitHub AutoSync](https://github.com/ArokiyaNithish/Arokiya-Nithish)*