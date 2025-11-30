//Problem description: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

/* Solution Approach -
Create a HashMap to store elements and their indices.
Iterate through the array.
Check if target - nums[i] exists in the HashMap.
If found, return the indices.
If not found, add the current element along with its index to the HashMap.
  */

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }

        return ans;
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

/*
 * Utilizes a HashMap to efficiently find the complement of each element.
 * Iterates through the array once, finding the complement for each element.
 */