def two_sum(nums, target):
     see_numbers = {}

     for index, number in enumerate(nums):
          complement = target - number

          if complement in see_numbers:
               return [see_numbers[complement], index]
          see_numbers[number] = index

print(two_sum([2, 7, 11, 15], 9)) 
print(two_sum([3, 2, 4], 6))      
print(two_sum([3, 3], 6)) 




    
