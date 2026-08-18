from collections import defaultdict
from typing import List

class Solution:
    def largestInteger(self, nums: List[int], k: int) -> int:
        # Dictionary to store the number of subarrays each integer appears in
        subarray_counts = defaultdict(int)
        n = len(nums)
        
        # Iterate over all subarrays of size k
        for i in range(n - k + 1):
            subarray = nums[i:i+k]
            # Use a set to get unique elements in the current subarray
            unique_elements = set(subarray)
            
            # Increment the count for each unique element
            for num in unique_elements:
                subarray_counts[num] += 1
                
        # Find the maximum integer that appears in exactly 1 subarray
        max_almost_missing = -1
        for num, count in subarray_counts.items():
            if count == 1:
                max_almost_missing = max(max_almost_missing, num)
                
        return max_almost_missing