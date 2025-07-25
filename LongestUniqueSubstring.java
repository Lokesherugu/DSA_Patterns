// File: Medium/LongestUniqueSubstring.java
import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (window.contains(s.charAt(right))) {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String input1 = "abcabcbb";
        String input2 = "bbbbb";
        String input3 = "pwwkew";

        System.out.println("Input: " + input1 + " → Output: " + lengthOfLongestSubstring(input1)); // 3
        System.out.println("Input: " + input2 + " → Output: " + lengthOfLongestSubstring(input2)); // 1
        System.out.println("Input: " + input3 + " → Output: " + lengthOfLongestSubstring(input3)); // 3
    }
}
