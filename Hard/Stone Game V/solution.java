from typing import List

class Solution:
    def stoneGameV(self, stoneValue: List[int]) -> int:
        n = len(stoneValue)
        
        # prefix[i] stores sum of stoneValue[0...i-1]
        prefix = [0] * (n + 1)
        for i in range(n):
            prefix[i + 1] = prefix[i] + stoneValue[i]
            
        # dp[i][j] stores the max score for subarray i...j
        dp = [[0] * n for _ in range(n)]
        
        # max_l[i][j] stores max(sum(i, k) + dp[i][k]) for k in range i...j
        max_l = [[0] * n for _ in range(n)]
        
        # max_r[i][j] stores max(sum(k, j) + dp[k][j]) for k in range i...j
        max_r = [[0] * n for _ in range(n)]
        
        # Base cases initialization
        for i in range(n):
            max_l[i][i] = stoneValue[i]
            max_r[i][i] = stoneValue[i]
            
        # Bottom-up DP: iterate starting points backwards, and end points forwards
        for i in range(n - 2, -1, -1):
            m = i  # sliding split pointer
            
            for j in range(i + 1, n):
                total_sum = prefix[j + 1] - prefix[i]
                
                # Advance m as long as the left half is strictly less than the right half
                # (i.e., left_sum * 2 < total_sum)
                while m < j and (prefix[m + 1] - prefix[i]) * 2 < total_sum:
                    m += 1
                
                res = 0
                
                # If we found an exact equilibrium where left_sum == right_sum
                if (prefix[m + 1] - prefix[i]) * 2 == total_sum:
                    # Alice gets to choose the absolute best option from either the left or the right side
                    res = max(max_l[i][m], max_r[m + 1][j])
                else:
                    # For all split points < m, Bob throws away the right row (we keep left)
                    if m > i:
                        res = max(res, max_l[i][m - 1])
                    # For all split points >= m, Bob throws away the left row (we keep right)
                    if m < j:
                        res = max(res, max_r[m + 1][j])
                        
                dp[i][j] = res
                
                # Update the auxiliary arrays for future queries
                max_l[i][j] = max(max_l[i][j - 1], total_sum + dp[i][j])
                max_r[i][j] = max(max_r[i + 1][j], total_sum + dp[i][j])
                
        return dp[0][n - 1]