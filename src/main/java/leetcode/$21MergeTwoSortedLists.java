package leetcode;

public class $21MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret = null;
        ListNode left = l1;
        ListNode right = l2;
        ListNode newN;
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null && l2 != null) {
            return l2;
        } else if (l1 != null && l2 == null) {
            return l1;
        } else {
            if (l1.val < l2.val) {
                ret = l1;
                left = l1.next;
                newN = l1;
            } else {
                ret = l2;
                right = l2.next;
                newN = l2;
            }
        }


        while (left != null || right != null) {
            if (left == null && right != null) {
                newN.next = right;
                right = right.next;
                newN = newN.next;
            } else if (left != null && right == null) {
                newN.next = left;
                left = left.next;
                newN = newN.next;
            } else {
                if (left.val < right.val) {
                    newN.next = left;
                    left = left.next;
                    newN = newN.next;
                } else {
                    newN.next = right;
                    right = right.next;
                    newN = newN.next;
                }
            }
        }
        return ret;
    }

    /*Definition for singly-linked list.*/
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
