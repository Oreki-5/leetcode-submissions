

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
public class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(0);
        ListNode pointer = head;
        System.out.println(pointer.val);
        while (list1 != null && list2 != null) {

            if(list1.val > list2.val){
                pointer.next = list2;
                list2 = list2.next;
            }
            else{
                pointer.next = list1;
                list1 = list1.next;
            }
            pointer = pointer.next;
            System.out.println(pointer.val);
            System.out.println(head.next.val);
            System.out.println(head.val);
            if(pointer.next != null){
                System.out.println(pointer.next.val);
            }
            

        }
        pointer.next = list1 == null ? list2 : list1;

        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode output = mergeTwoLists(l1,l2);

    }

}

class ListNode {
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