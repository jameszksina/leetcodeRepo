package leetcode;

public class $14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLen = 200;
        for (String str : strs) {
            if (str.length() < minLen) {
                minLen = str.length();
            }
        }
        if (minLen == 0) {
            return "";
        }
        StringBuilder prefix = new StringBuilder();
        int i = 0;
        boolean finish = false;
        while (i < minLen) {
            char pre = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (pre != strs[j].charAt(i)) {
                    finish = true;
                    break;
                }
            }
            if (finish) {
                break;
            }
            prefix.append(pre);
            i++;
        }
        return prefix.toString();
    }
}
