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
    public boolean isPalindrome(ListNode head) {
       
        if(head ==null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
         while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
         }
         
         ListNode second= Reverse(slow);
         ListNode first = head;

        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
         return true; 
    }
    public ListNode Reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
         while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
         }
         return prev; 
    }
}