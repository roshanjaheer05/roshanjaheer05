def reverse_order(s):
    vowels="aeiouAEIOU"
    s=list(s)
    i=0;
    j=len(s)-1
    while i<j:
        if s[i] is not vowels:
           i+=1
        elif s[j] is not vowels:
           j-=1
        else:
            s[i],s[j]=s[j],s[i]
            i+=1
            j-=1
    return"".join(s)
print(reverse_vowels("hello"))
print(reverse_vowels("leetcode"))    