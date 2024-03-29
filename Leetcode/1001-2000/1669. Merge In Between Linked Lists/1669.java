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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t1=new ListNode(0);
        ListNode t2 = new ListNode(0);
        ListNode temp = list1;
        for(int i=1; i<=b+1; i++)
        {
            if(i == a)
            t1 = list1;
            if(i == b+1)
                t2 = list1.next;
            list1 = list1.next;
        }
        t1.next = list2;
        while(list2.next != null)
            list2 = list2.next;
        list2.next = t2;
        return temp;
    }
}
