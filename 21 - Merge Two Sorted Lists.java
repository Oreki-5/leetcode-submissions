import java.util.Objects;

// PENDING

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // l1.val == l2.val

        // l1.val > l2.val

        // l1.val < l2.val

        System.out.println(list1.val);

        return findNext(list1, list2);
        // System.out.println(list1);
    }

    public ListNode findNext(ListNode l1, ListNode l2) {

        if (Objects.equals(l1, null) && Objects.equals(l2, null)) {
            if (l1.val >= l2.val) {
                return new ListNode(l1.val, findNext(l1.next, l2));
            } else {
                return new ListNode(l2.val, findNext(l1, l2.next));
            }
        }
        if (Objects.equals(l2, null)) {
            return new ListNode(l1.val, l1.next);
        } else {
            return new ListNode(l2.val, l2.next);

        }

    }
}