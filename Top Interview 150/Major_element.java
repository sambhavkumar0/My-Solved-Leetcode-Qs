//major element:element that appears more than half the total length of the array.

class Major_element{
    public static int major(int[] nums){
        int major=nums[0],count=0;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                count++;
                major=nums[i];
            }
            else if(major==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return major;
    }
    public static void main(String[] args) {
        int nums[]={2,2,2,2,2,2,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        int result=major(nums);
        System.out.println("the major element is "+result);
    }
}
