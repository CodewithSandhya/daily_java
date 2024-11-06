public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // Start with the first string as the prefix

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1); // Shorten the prefix
                if (prefix.isEmpty()) {
                    return ""; // Return empty if no common prefix is found
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // Output: "fl"
        System.out.println(solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));    // Output: ""
    }
}
