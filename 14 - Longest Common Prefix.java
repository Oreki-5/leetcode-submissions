import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        Arrays.sort(strs);
        if (strs[0].equals("")) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                break;
            }
            output += strs[0].charAt(i);
        }

        return output;
    }
}