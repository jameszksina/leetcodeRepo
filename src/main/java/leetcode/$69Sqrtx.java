package leetcode;

public class $69Sqrtx {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 4) {
            return 1;
        }
        int start = 1;
        int end = x;
        while (start < end) {
            int middle = (end-start)/2 + start;
            int tmp = x/middle;
            if (tmp>middle) {
                start = middle+1;
            }else if(tmp<middle){
                end = middle-1;
            }else{
                return middle;
            }
        }
        if (x/end <end) {
            return end-1;
        }else{
            return end;
        }
    }
}
