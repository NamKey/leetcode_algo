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
    
    /**
    * 1. 병합된 List의 Head를 정함
    * 2. 
    **/
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode mergeHead = new ListNode();
        ListNode mergeCurrent;
        ListNode listHead1 = list1;
        ListNode listHead2 = list2;
        
        // 1. 병합된 List의 Head를 정함
        if (listHead1 == null && listHead2 == null) {
            return mergeHead.next;
        } else if (listHead1 != null && listHead2 != null) {
            if(listHead1.val <= listHead2.val) {
                mergeHead.next = listHead1;
                listHead1 = listHead1.next;
            } else {
                mergeHead.next = listHead2;
                listHead2 = listHead2.next;
            }
        } else if (listHead1 != null) {
            mergeCurrent = listHead1;
            mergeHead.next = listHead1;
            listHead1 = listHead1.next;            
        } else if (listHead2 != null) {
            mergeCurrent = listHead2;
            mergeHead.next = listHead2;
            listHead2 = listHead2.next;            
        }
        
        // 1-2. 현재 이어붙여야되는 Node
        mergeCurrent = mergeHead.next;
        
        // 2. next Node를 따라가면서 이어 붙이기
        while (listHead1 != null || listHead2 != null) {
            if (listHead1 != null && listHead2 != null) {
                if (listHead1.val <= listHead2.val) {
                    mergeCurrent.next = listHead1;                                        
                    listHead1 = listHead1.next;
                } else {
                    mergeCurrent.next = listHead2;                    
                    listHead2 = listHead2.next;
                }
            } else if (listHead1 != null) {
                mergeCurrent.next = listHead1;
                listHead1 = listHead1.next;
            } else if (listHead2 != null) {
                mergeCurrent.next = listHead2;
                listHead2 = listHead2.next;
            }
            
            mergeCurrent = mergeCurrent.next;
        }
        
        return mergeHead.next;
    }    
}