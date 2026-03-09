import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;i<s.length();j++){
                if(isPalindrome(s,i,j)){
                    count++;
                }
            }
        }
        System.out.println("Total Palindrome:"+count);
    }
    static boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
           i++;
           j--;
        }
        return true;
    }
}