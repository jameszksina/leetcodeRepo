package leetcode;

public class $28ImplementStrStr {
    public int strStr(String haystack, String needle) {
        int result = -1;
        if (isBlank(needle)) {
            return 0;
        }
        if (isBlank(haystack)) {
            return -1;
        }
        char[] stackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        boolean match = true;
        for (int i = 0; i < stackArr.length - needleArr.length; i++) {
            match = true;
            result = i;
            for (int j = 0; j < needleArr.length; j++) {
                if (stackArr[i + j] != needleArr[j]) {
                    match = false;
                    break;
                }
            }
            if(match){
                break;
            }
        }
        if (match) {
            return result;
        } else {
            return -1;
        }
    }

    private boolean isBlank(String str) {
        return str == null || str.equals("");
    }
}
