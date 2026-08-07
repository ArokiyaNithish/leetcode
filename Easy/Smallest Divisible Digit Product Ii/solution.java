import math

class Solution:
    def smallestNumber(self, num: str, t: int) -> str:
        # Step 1: Check prime factors of t.
        # Digits 1-9 only contain prime factors 2, 3, 5, 7.
        temp = t
        for p in [2, 3, 5, 7]:
            while temp % p == 0:
                temp //= p
        if temp > 1:
            return "-1"

        # Step 2: Memoized function to get the shortest & lexicographically smallest array of digits
        # whose product is divisible by the remaining `rem`.
        memo = {}
        def get_opt(rem):
            if rem == 1:
                return []
            if rem in memo:
                return memo[rem]

            best = None
            for d in range(2, 10):
                g = math.gcd(rem, d)
                if g > 1:
                    cand = get_opt(rem // g)
                    if cand is not None:
                        new_cand = sorted(cand + [d])
                        
                        # We want the shortest length combination first. 
                        # If lengths are equal, we pick the lexicographically smaller sequence.
                        if best is None:
                            best = new_cand
                        else:
                            if len(new_cand) < len(best):
                                best = new_cand
                            elif len(new_cand) == len(best) and new_cand < best:
                                best = new_cand
            memo[rem] = best
            return best
        
        # Step 3: Check if the original `num` itself is valid.
        if '0' not in num:
            rem = t
            for char in num:
                rem //= math.gcd(rem, int(char))
            if rem == 1:
                return num
        
        # Determine the maximum index we can start diverging at. 
        # We can't keep a prefix that includes a '0'.
        z = num.find('0')
        if z == -1:
            z = len(num) - 1
        
        # Precompute prefix remainders.
        prefix_rem = [t]
        for i in range(len(num)):
            curr_d = int(num[i]) if num[i] != '0' else 1
            prefix_rem.append(prefix_rem[-1] // math.gcd(prefix_rem[-1], curr_d))
            
        N = len(num)
        
        # Step 4: Traverse backward to find the right-most divergence point
        for i in range(z, -1, -1):
            start_d = int(num[i]) + 1
            for d in range(start_d, 10):
                rem = prefix_rem[i]
                rem //= math.gcd(rem, d)
                
                opt = get_opt(rem)
                
                # Check if we can fit the required combination in the remaining length
                if opt is not None and len(opt) <= N - 1 - i:
                    res = num[:i] + str(d) + "1" * (N - 1 - i - len(opt)) + "".join(map(str, opt))
                    return res
        
        # Step 5: If we cannot form a number of the same length, we increase the length by 1.
        opt = get_opt(t)
        if opt is not None:
            res = "1" * (N + 1 - len(opt)) + "".join(map(str, opt))
            return res
            
        return "-1"