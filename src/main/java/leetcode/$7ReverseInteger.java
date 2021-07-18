package leetcode;

public class $7ReverseInteger {
    public int reverse1(int x) {
        if (x == 0) {
            return 0;
        }
        int tmp = Double.valueOf(Math.pow(2, 31)).intValue();
        String high = String.valueOf(tmp - 1);
        String low = String.valueOf(tmp);
        String input = String.valueOf(x);
        boolean minus = false;
        if (input.startsWith("-")) {
            minus = true;
            input = input.substring(1);
        }
        char[] charInput = input.toCharArray();
        for (int i = 0; i < charInput.length / 2; i++) {
            char tmpChar = charInput[i];
            charInput[i] = charInput[charInput.length - i - 1];
            charInput[charInput.length - i - 1] = tmpChar;
        }
        char[] charInput2 = new char[charInput.length];
        int index = 0;
        boolean zero = true;
        for (char a : charInput) {
            if (a != 0 || !zero) {
                charInput2[index] = a;
                index++;
                zero = false;
            }
        }

        input = String.valueOf(charInput);
        if (minus) {
            if (input.length() == low.length() && input.compareTo(low) > 0) {
                return 0;
            }

        } else {
            if (input.length() == high.length() && input.compareTo(high) > 0) {
                return 0;
            }
        }
        input = minus ? "-" + input : input;
        Integer inputInt = Integer.valueOf(input);

        return inputInt;

    }

    public int reverse(int x) {
        int result = 0;
        int maxInt = 2147483647;//2^31 - 1
        int minInt = -2147483648;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (result > maxInt / 10 || (result == maxInt / 10 && pop > 7)) {
                return 0;
            }
            if (result < minInt / 10 || (result == minInt / 10 && pop < -8)) {
                return 0;
            }
            result = result * 10 + pop;
        }
        return result;
    }
}
