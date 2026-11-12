class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < n; right++) {
            // Shrink the window from the left until the duplicate character is removed
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character and update max length
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}