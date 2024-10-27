package gsinterview;

import java.util.HashSet;

public class LongestSubstring {
	public static void main(String[] args) {
        String s = "abcdeefghijk";
        String longestSubstring = findLongestUniqueSubstring(s);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }

    public static String findLongestUniqueSubstring(String s) {
        int start = 0;
        int maxLength = 0;
        String longestSubstring = "";
        HashSet<Character> charSet = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            // If the character is already in the set, move the start pointer
            while (charSet.contains(s.charAt(end))) {
                charSet.remove(s.charAt(start));
                start++;
            }
            // Add the current character to the set
            charSet.add(s.charAt(end));
            // Update the longest substring if the current window is larger
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestSubstring = s.substring(start, end + 1);
            }
        }
        System.out.println(longestSubstring.length());
        return longestSubstring;
    }

}
