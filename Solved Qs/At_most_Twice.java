class At_most_Twice{
    public static void removeDups(int[] nums){
       int i=0;
       for (int n:nums){
        if(i<2||n>nums[i-1]){
        nums[i++]=n;
        }
        
       } 

       for(int j=0;j<nums.length;j++){
        System.out.println(nums[j]);
       }
    }

    public static void main(String[] args) {
        int nums[] = {2,2,2,3,4,3,3};//sorted array
        //expected outcome:2,2,3,3
        removeDups(nums);
    }

}