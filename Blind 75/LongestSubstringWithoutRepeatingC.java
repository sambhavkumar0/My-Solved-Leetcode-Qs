
/* Problem Description - Given a string s, find the length of the longest substring without repeating characters.  */

/* We use a sliding window approach with two pointers i and j to track the current substring.
We use a HashMap to store the characters and their counts in the current substring.
We move the j pointer forward and update the HashMap.
If the current substring contains duplicate characters, we move the i pointer forward until the substring becomes valid again.
We update the longest substring length as we iterate through the string.*/

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, n = s.length();
        int longestSubstring = 0;

        while (j < n) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (j - i + 1 == map.size()) {
                longestSubstring = Math.max(longestSubstring, j - i + 1);
            } else {
                while (j - i + 1 > map.size()) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                longestSubstring = Math.max(longestSubstring, j - i + 1);
            }
            j++;
        }

        return longestSubstring;
    }
}

public class LongestSubstringWithoutRepeatingC {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("Length of Longest Substring Without Repeating Characters: " + result);
    }

}

/**
 * We iterate through the string using two pointers, i and j.
 * We update the HashMap to keep track of characters and their counts in the
 * current substring.
 * If the current substring contains duplicate characters, we adjust the window
 * size by moving the i pointer.
 */