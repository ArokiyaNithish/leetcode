from typing import List
from functools import lru_cache

class Solution:
    def stoneGameV(self, stoneValue: List[int]) -> int:
        n = len(stoneValue)
        
        # Precompute prefix sums to query subarray sums in O(1) time
        # prefix[i] will store the sum of stoneValue[0...i-1]
        prefix = [0] * (n + 1)
        for i in range(n):
            prefix[i+1] = prefix[i] + stoneValue[i]
            
        @lru_cache(None)
        def dp(i: int, j: int) -> int:
            # Base case: only one stone left, game ends, score is 0
            if i == j:
                return 0
            
            max_score = 0
            
            # Try splitting the row at every possible index k
            for k in range(i, j):
                # Calculate sums using the prefix sum array
                left_sum = prefix[k+1] - prefix[i]
                right_sum = prefix[j+1] - prefix[k+1]
                
                # Bob throws away the right row
                if left_sum < right_sum:
                    max_score = max(max_score, left_sum + dp(i, k))
                
                # Bob throws away the left row
                elif left_sum > right_sum:
                    max_score = max(max_score, right_sum + dp(k+1, j))
                
                # Values are equal, Alice decides which row to throw away
                else:
                    max_score = max(max_score, left_sum + max(dp(i, k), dp(k+1, j)))
                    
            return max_score

        # Start the game with the full array of stones
        return dp(0, n - 1)