import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcdabcbb";
        int start = 0;
        int end = 0;
        int max_length = 0;
        Set<Character> set = new HashSet<>(); // HashSet is more efficient than List

        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {  // Add only if not present
                set.add(s.charAt(end));
                max_length = Math.max(max_length, set.size());
                end++;
            } else {
                set.remove(s.charAt(start)); // Remove from the start of the window
                start++;
            }
        }
        System.out.println("Max length is " + max_length);
    }
}