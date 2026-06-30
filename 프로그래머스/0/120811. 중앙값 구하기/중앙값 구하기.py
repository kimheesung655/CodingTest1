def solution(array):
    median = 0
    sorted_array = sorted(array)
    n = len(sorted_array)
    if n % 2 == 1:
        median = sorted_array[n // 2]
    else:
        median = (sorted_array[n//2-1] + sorted_array[n//2]) / 2
    return median