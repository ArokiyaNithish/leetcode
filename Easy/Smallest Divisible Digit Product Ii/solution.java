                    res = num[:i] + str(d) + "1" * (N - 1 - i - len(opt)) + "".join(map(str, 
                    opt))
                    return res
        
        # Step 5: If we cannot form a number of the same length, we increase the length by 1.
        opt = get_opt(t)
        if opt is not None:
            res = "1" * (N + 1 - len(opt)) + "".join(map(str, opt))
            return res
            
        return "-1"
