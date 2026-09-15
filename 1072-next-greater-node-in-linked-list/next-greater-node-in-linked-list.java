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
    class Pair{
        int val;
        int idx;
        Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
    }
    public int[] nextLargerNodes(ListNode head) {
        if(head.next == null){
            return new int[]{0};
        }
        int len = 0;
        ListNode curr = head;
        while(curr != null){
            len++;
            curr = curr.next;
        }


        curr = head;
        int counter = 0;

        int[] ans = new int[len];
        Stack<Pair> st = new Stack<>();

        while(curr != null){
            while(st.size()>0 && st.peek().val < curr.val){
                Pair rem = st.pop();
                int i = rem.idx;
                ans[i] = curr.val;
            }
            Pair p = new Pair(curr.val, counter);
            st.push(p);
            curr = curr.next;
            counter++;
        }
        return ans;
        
    }
}