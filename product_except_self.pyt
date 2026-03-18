def product_except_self(nums):
    total=1
    for num in nums:
        total*=num
    return[total//num for num in nums]
print(product_except_self([1,2,3,4]))