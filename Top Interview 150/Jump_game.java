public class Jump_game {

    public static boolean canJump(int[] nums){

        int reachable = 0;
        for(int i=0 ; i<nums.length;++i){
            if(i>reachable)
            return false;
            reachable=Math.max(reachable,i+nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {0,2,3,0,5,0};//expected outcome is false
        boolean result=canJump(nums);
        System.out.println("the jump is " + result);
    }
}
