// File: Easy/MaxVowelsInSubstring.java
public class MaxVowelsInSubstring {
    public static int maxVowels(String s, int k) {
        int count = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) count++;
            if (i >= k && isVowel(s.charAt(i - k))) count--;
            max = Math.max(max, count);
        }
        return max;
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println("Max vowels in substring: " + maxVowels(s, k)); // Output: 3
    }
}
