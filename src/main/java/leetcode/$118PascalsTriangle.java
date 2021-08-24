package leetcode;

import java.util.ArrayList;
import java.util.List;

public class $118PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> rowLists = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> newRowList = new ArrayList<>();
            newRowList.add(1);
            for (int j = 0; j < rowLists.size() - 1; j++) {
                newRowList.add(rowLists.get(j) + rowLists.get(j + 1));
            }
            if (i > 0) {
                newRowList.add(1);
            }
            res.add(newRowList);
            rowLists = newRowList;
        }
        return res;
    }
}
