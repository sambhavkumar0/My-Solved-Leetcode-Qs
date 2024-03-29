import java.util.HashMap;
import java.util.Map;

/**Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. */

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> myMap = new HashMap();
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++){
            if (myMap.containsKey(nums[i])){
               result[0] = myMap.get(nums[i]);
               result[1] = i;
               break;
            }
            else myMap.put((target - nums[i]), i);
        }
        
        return result;
    }


    public static void main(String[] args) {
        int[] nums={2,3,5};
        int target=5;
        int [] result=twoSum(nums, target);
        for (int i=0; i<result.length; i++) {
         System.out.print(result[i]+ " ");
        }
    }
    }


