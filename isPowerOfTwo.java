import java.util.*;
class Main{
public boolean isPowerOfTwo(int n){
    while(n<0)
    return false;
    while(n%2==0){
        n=n/2;
    }
    return n==1;
}
}