def maxSubarray(nums):
    melhor = atual = nums[0]
    for x in nums[1:]:
        atual = max(x, atual + x)
        melhor = max(melhor, atual)
    return melhor

print(maxSubarray([-2,1,-3,4,-1,2,1,-5,4])) 
print(maxSubarray([1]))                     
print(maxSubarray([5,4,-1,7,8]))  