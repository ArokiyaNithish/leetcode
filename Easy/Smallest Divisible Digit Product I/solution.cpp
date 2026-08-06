            while num > 0:
                product *= num % 10
                num //= 10
            return product
        
        # Start checking from n upwards
        current = n
        while True:
            if get_digit_product(current) % t == 0:
                return current
            current += 1

