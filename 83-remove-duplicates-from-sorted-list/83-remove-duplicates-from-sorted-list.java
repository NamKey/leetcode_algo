/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        deleteDuplicatedRecursive(head, head.next);
        return head;
    }

    private void deleteDuplicatedRecursive(ListNode current, ListNode next) {
        if (next == null || current == null) {
            return;
        }

        if (current.val == next.val) {
            current.next = next.next;
            next.next = null;
            deleteDuplicatedRecursive(current, current.next);
        } else {
            if (current.next != null) {
                deleteDuplicatedRecursive(current.next, current.next.next);
            }
        }
    }
}