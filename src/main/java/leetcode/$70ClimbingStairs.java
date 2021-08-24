package leetcode;

public class $70ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int tmp1 = 1;
        int tmp2 = 2;
        for (int i = 0; i < n - 2; i++) {
            if (i == n - 3) {
                return tmp1 + tmp2;
            } else {
                int swap = tmp2;
                tmp2 = tmp1 + tmp2;
                tmp1 = swap;
            }
        }
        return tmp1 + tmp2;
        //return climb(n);
    }

    private int climb(int n) {
        if (n <= 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }
        return climb(n - 1) + climb(n - 2);
    }
}
