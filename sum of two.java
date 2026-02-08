public class Main {
    public int[] twosum(int[] nums,int target){
    for(int i=0;i<nums.length;i++){
    for(int j=i+1;j<nums.length;j++){
    if(num[i]+num[j]==target){
    return new int[] {i,j};
    }
    }
    }
    return new int[0];
}
}