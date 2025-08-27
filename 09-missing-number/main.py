def missingNumber(nums):
    n = len(nums)
    soma_esperada = n * (n + 1) // 2
    soma_real = sum(nums)
    return soma_esperada - soma_real

print(missingNumber([3,0,1]))           
print(missingNumber([0,1]))                  
print(missingNumber([9,6,4,2,3,5,7,0,1]))