//given array nums: return answer such that answer[i] is equal to product of all elements of nums except nums[i]..

public class Answer {
    public static int[] productExceptSelf(int[] nums) {

        int n=nums.length;
        int[] res=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=res[i-1]*nums[i-1];

        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            res[i]=res[i]*right;
            right=right*nums[i];
    }
    return res;
}
public static void main(String[] args) {
    int[] nums={2,4,6,8};
    int[] j=new int[nums.length];
    for(int i=0; i<nums.length; i++) {
       j= productExceptSelf(nums);

}
for(int k=0; k<nums.length; k++) {
    System.out.println(j[k]);
}
}}