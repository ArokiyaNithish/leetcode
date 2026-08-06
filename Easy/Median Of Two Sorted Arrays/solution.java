                else:
                    return float(max(maxLeftX, maxLeftY))
            elif maxLeftX > minRightY:
                # We are too far right in partitionX, move left
                high = partitionX - 1
            else:
                # We are too far left in partitionX, move right
                low = partitionX + 1
                
        raise ValueError("Input arrays are not sorted.")
