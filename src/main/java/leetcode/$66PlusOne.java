package leetcode;

public class $66PlusOne {
    public int[] plusOne(int[] digits) {
        boolean add = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            int addNum = i == digits.length - 1 ? 1 : 0;
            if (add) {
                addNum++;
            }
            if (digits[i] + addNum == 10) {
                add = true;
                digits[i] = 0;
            } else {
                add = false;
                digits[i] += addNum;
            }
        }
        if(add){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for(int i=0;i<digits.length;i++){
                result[i+1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}
