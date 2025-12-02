/*Given n non-negative integers height[i] where each represents a point at coordinate (i, height[i]), n vertical lines are drawn such that the two endpoints of the line i are at (i, height[i]) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water. */

/* We use a two-pointer approach to find the maximum area between two lines.
Initialize two pointers, left and right, at the beginning and end of the array respectively.
Calculate the area between the lines using the formula min(height[left], height[right]) * (right - left).
Update the maximum area if the calculated area is greater than the current maximum.
Move the pointer with the smaller height inward, as moving the pointer with the larger height cannot increase the area.*/
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int area = 0;

        while (left < right) {
            int length = right - left;
            int width = Math.min(height[left], height[right]);
            area = Math.max(area, length * width);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return area;
    }
}

public class ContainerWithMost {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = solution.maxArea(height);
        System.out.println("Maximum area: " + result);
    }

}

/*
 * Initialize two pointers, left and right, at the beginning and end of the
 * array.
 * Move the pointers towards each other to find the maximum area between two
 * lines.
 * Calculate the area using the formula and update the maximum area accordingly.
 * Continue this process until the two pointers meet.
 */