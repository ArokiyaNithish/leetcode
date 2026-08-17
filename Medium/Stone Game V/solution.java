                    if m < j:
                        res = max(res, max_r[m + 1][j])
                        
                dp[i][j] = res
                
                # Update the auxiliary arrays for future queries
                max_l[i][j] = max(max_l[i][j - 1], total_sum + dp[i][j])
                max_r[i][j] = max(max_r[i + 1][j], total_sum + dp[i][j])
                
        return dp[0][n - 1]
