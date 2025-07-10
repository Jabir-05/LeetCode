public class FirstOccurrence {
    public static int firstOccurrenceInString(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "leetcode", needle = "leeto";
        int index = firstOccurrenceInString(haystack, needle);
        System.out.println("First occurrence index: " + index);
    }
}
