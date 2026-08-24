class Solution:
    def stoneGameVIII(self, stones: list[int]) -> int:
        n = len(stones)
        
        # Calculate prefix sums
        # The sum of removing stones up to index i is exactly prefix_sum[i]
        prefix_sum = [0] * n
        prefix_sum[0] = stones[0]
        for i in range(1, n):
            prefix_sum[i] = prefix_sum[i-1] + stones[i]
            
        # dp represents the max score difference a player can achieve 
        # given the available choices.
        # Base case: picking all remaining stones (index n-1)
        dp = prefix_sum[-1]
        
        # Iterate backwards from n-2 down to 1
        # (We stop at 1 because a player must take x > 1 stones, 
        # so index 0 is not a valid move)
        for i in range(n - 2, 0, -1):
            # Option 1: Don't pick at index i, meaning we defer to a future index -> dp
            # Option 2: Pick at index i, score difference is prefix_sum[i] - dp
            dp = max(dp, prefix_sum[i] - dp)
            
        return dp