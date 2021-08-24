package leetcode;

public class $88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int[] tmp = new int[m + n];
        int mIndex = 0, nIndex = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (mIndex >= m) {
                tmp[i] = nums2[nIndex++];
            } else if (nIndex >= n) {
                tmp[i] = nums1[mIndex++];
            } else {
                if (nums2[nIndex] <= nums1[mIndex]) {
                    tmp[i] = nums2[nIndex++];
                } else {
                    tmp[i] = nums1[mIndex++];
                }
            }

        }
        for (int i = 0; i < tmp.length; i++) {
            nums1[i] = tmp[i];
        }
    }
}
