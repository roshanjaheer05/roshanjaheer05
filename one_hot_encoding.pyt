def one_hot_encoding(arr):
    result={}
    n=len(arr)
    for colour in arr:
        if colour is not result:
            result[colour]=[0]*n
        for i in range(n):
            result[arr[i]][i]=1
        return result
    arr=['red','blue','red']
print(one_hot_encoding(arr))