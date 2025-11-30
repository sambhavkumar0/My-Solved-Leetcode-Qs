//given array nums: return answer such that answer[i] is equal to product of all elements of nums except nums[i]..

public class Answer {
    public static void productExceptSelf(int[] nums) {

        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        /**
          calculate the left Prefix and right Suffix Product.
        */
        for (int i=0,j= nums.length-1; i < nums.length; i++, j--) {
            if (i == 0) {
                leftProduct[i] = nums[i];
                rightProduct[j] = nums[j];
            }else {
                leftProduct[i] = leftProduct[i-1] * nums[i];
                rightProduct[j] = rightProduct[j+1] * nums[j];
            }
        }
    
        for (int i=0; i < nums.length; i++) {
    
            if (i == 0) {
                nums[i] = rightProduct[1];
            }else if (i == (nums.length - 1)) {
                nums[i] = leftProduct[i-1];
            }else {
                nums[i] = leftProduct[i-1] * rightProduct[i+1];
            }
        }
       for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ,");
       }
}
public static void main(String[] args) {
    int[] nums={1,2,3,4};//expected output:24,12,8,6
    productExceptSelf(nums);

}}