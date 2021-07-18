package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $13RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> roman2Int = new HashMap<>();
        roman2Int.put('I', 1);
        roman2Int.put('V', 5);
        roman2Int.put('X', 10);
        roman2Int.put('L', 50);
        roman2Int.put('C', 100);
        roman2Int.put('D', 500);
        roman2Int.put('M', 1000);

        //这个其实不需要，因为一般从小到大排列，其实判断与i+1的大小就能决定是不是相减
        Map<Character, List<Character>> romanSub = new HashMap<>();
        List<Character> iSub = new ArrayList<>();
        iSub.add('V');
        iSub.add('X');
        romanSub.put('I', iSub);
        List<Character> xSub = new ArrayList<>();
        xSub.add('L');
        xSub.add('C');
        romanSub.put('X', xSub);
        List<Character> cSub = new ArrayList<>();
        cSub.add('D');
        cSub.add('M');
        romanSub.put('C', cSub);

        int result = 0;
        char[] charList = s.toCharArray();
        for (int i = 0; i < charList.length; i++) {
            List<Character> subList = romanSub.get(charList[i]);
            if (i + 1 < charList.length && subList != null && subList.contains(charList[i + 1])) {
                result += roman2Int.get(charList[i + 1]) - roman2Int.get(charList[i]);
                i++;
                continue;
            }
            result += roman2Int.get(charList[i]);
        }

        return result;
    }
}
