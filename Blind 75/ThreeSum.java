/*Given an integer array nums, return all the unique triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. Notice that the solution set must not contain duplicate triplets. */

/*We sort the array nums to simplify the process of finding triplets.
We iterate through the sorted array and use a two-pointer approach to find triplets that sum up to zero.
We use a HashSet to avoid duplicate triplets.
We add the valid triplets to a list and return the list as the result. */

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    continue;
                }

                if (nums[j] + nums[k] + nums[i] > 0)
                    k--;
                else
                    j++;
            }
        }

        triplets.addAll(set);
        return triplets;
    }
}

public class ThreeSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = sol.threeSum(nums);
        System.out.println(result);
    }

}

/*
 * We sort the nums array to simplify the search for triplets.
 * We iterate through the sorted array and use a two-pointer approach to find
 * triplets.
 * We use a HashSet to avoid duplicate triplets in the result.
 * We add the valid triplets to a list and return it as the final result.
 */